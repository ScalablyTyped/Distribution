package typings.openui5.sap.ui.model.odata

import typings.openui5.sap.ui.model.SimpleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type")
@js.native
object `type` extends js.Object {
  @js.native
  class Boolean protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.Boolean</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given boolean value to the given target type.
      * @param bValue the value to be formatted
      * @param sTargetType the target type; may be "any", "boolean" or "string". If it is "string", the
      * result is  "Yes" or "No" in the current {@link sap.ui.core.Configuration#getLanguage language}.  See
      * {@link sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(bValue: scala.Boolean, sTargetType: java.lang.String): scala.Boolean | java.lang.String = js.native
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Boolean = js.native
    /**
      * Parses the given value from the given type to a boolean.
      * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "boolean" or
      * "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: scala.Boolean, sSourceType: java.lang.String): scala.Boolean = js.native
    /**
      * Validates whether the given value in model representation is valid and meets the givenconstraints.
      * @param bValue the value to be validated
      */
    def validateValue(bValue: scala.Boolean): Unit = js.native
  }
  
  @js.native
  class Byte protected () extends Int {
    /**
      * Constructor for a primitive type <code>Edm.Byte</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Returns the type's supported range as object with properties <code>minimum</code>
      * and<code>maximum</code>.
      * @returns the range
      */
    def getRange(): js.Any = js.native
  }
  
  @js.native
  class Date protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.Date</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @param sValue the value to be formatted
      * @param sTargetType the target type; may be "any" or "string".  See {@link sap.ui.model.odata.type}
      * for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): java.lang.String = js.native
    /**
      * Parses the given value to a date.
      * @param sValue the value to be parsed, maps <code>""</code> to <code>null</code>
      * @param sSourceType the source type (the expected type of <code>sValue</code>); must be "string"  See
      * {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thegiven constraints.
      * @param sValue the value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
  @js.native
  class DateTime protected () extends DateTimeBase {
    /**
      * Constructor for a primitive type <code>Edm.DateTime</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
      * validateValue}  throws an error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  abstract class DateTimeBase protected () extends ODataType {
    /**
      * Base constructor for the primitive types <code>Edm.DateTime</code>
      * and<code>Edm.DateTimeOffset</code>.
      * @param oFormatOptions Type-specific format options; see subtypes
      * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @since 1.27.0
      * @param oValue The value to be formatted, which is represented in the model as a <code>Date</code> 
      * instance (OData V2)
      * @param sTargetType The target type, may be "any" or "string"; see {@link sap.ui.model.odata.type}
      * for more  information
      * @returns The formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(oValue: Date, sTargetType: java.lang.String): Date | java.lang.String = js.native
    /**
      * Parses the given value to a <code>Date</code> instance (OData V2).
      * @since 1.27.0
      * @param sValue The value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>
      * @param sSourceType The source type (the expected type of <code>sValue</code>), must be "string"; see
      *  {@link sap.ui.model.odata.type} for more information
      * @returns The parsed value
      */
    def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): Date | java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @since 1.27.0
      * @param oValue The value to be validated
      */
    def validateValue(oValue: Date): Unit = js.native
  }
  
  @js.native
  class DateTimeOffset protected () extends DateTimeBase {
    /**
      * Constructor for a primitive type <code>Edm.DateTimeOffset</code>.
      * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
      * validateValue}  throws an error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    def formatValue(vValue: java.lang.String, sTargetType: java.lang.String): Date | java.lang.String = js.native
  }
  
  @js.native
  class Decimal protected () extends ODataType {
    /**
      * Constructor for a primitive type <code>Edm.Decimal</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.  Note that
      * <code>maxFractionDigits</code> and <code>minFractionDigits</code> are set to  the value of the
      * constraint <code>scale</code> unless it is "variable". They can however  be overwritten.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type. When formatting to "string" the type'sconstraint
      * <code>scale</code> is taken into account.
      * @param sValue the value to be formatted, which is represented as a string in the model
      * @param sTargetType the target type; may be "any", "float", "int" or "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    /**
      * Parses the given value, which is expected to be of the given type, to a decimal
      * in<code>string</code> representation.
      * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
      * or  "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @param sValue the value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
  @js.native
  class Double protected () extends ODataType {
    /**
      * Constructor for a primitive type <code>Edm.Double</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    def formatValue(vValue: java.lang.String, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    /**
      * Formats the given value to the given target type. When formatting to "string", very largeor very
      * small values are formatted to the exponential format (e.g. "-3.14 E+15").
      * @param vValue the value to be formatted, which is represented as a number in the model
      * @param sTargetType the target type; may be "any", "float", "int", "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(vValue: scala.Double, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    /**
      * Parses the given value, which is expected to be of the given type, to an Edm.Double
      * in<code>number</code> representation.
      * @since 1.29.0
      * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>; note that there is no way to enter <code>Infinity</code> or  <code>NaN</code>
      * values
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
      * or  "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Double = js.native
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): scala.Double = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @since 1.29.0
      * @param fValue the value to be validated
      */
    def validateValue(fValue: scala.Double): Unit = js.native
  }
  
  @js.native
  class Guid protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.Guid</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @param sValue the value to be formatted
      * @param sTargetType the target type; may be "any" or "string".  See {@link sap.ui.model.odata.type}
      * for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): java.lang.String = js.native
    /**
      * Parses the given value to a GUID.
      * @param sValue the value to be parsed, maps <code>""</code> to <code>null</code>
      * @param sSourceType the source type (the expected type of <code>sValue</code>); must be "string". 
      * See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thegiven constraints.
      * @param sValue the value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
  @js.native
  class Int protected () extends ODataType {
    /**
      * Constructor for a new <code>Int</code>.
      * @param oFormatOptions type-specific format options; see subtypes
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.When formatting to <code>string</code> the format
      * options are used.
      * @param iValue the value in model representation to be formatted
      * @param sTargetType the target type; may be "any", "int", "float" or "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(iValue: scala.Double, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Double = js.native
    /**
      * Parses the given value, which is expected to be of the given source type, to an Int innumber
      * representation.
      * @param vValue the value to be parsed. The empty string and <code>null</code> are parsed to 
      * <code>null</code>.
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
      * or  "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): scala.Double = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @param iValue the value to be validated
      */
    def validateValue(iValue: scala.Double): Unit = js.native
  }
  
  @js.native
  class Int16 protected () extends Int {
    /**
      * Constructor for a primitive type <code>Edm.Int16</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Returns the type's supported range as object with properties <code>minimum</code>
      * and<code>maximum</code>.
      * @returns the range
      */
    def getRange(): js.Any = js.native
  }
  
  @js.native
  class Int32 protected () extends Int {
    /**
      * Constructor for a primitive type <code>Edm.Int32</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Returns the type's supported range as object with properties <code>minimum</code>
      * and<code>maximum</code>.
      * @returns the range
      */
    def getRange(): js.Any = js.native
  }
  
  @js.native
  class Int64 protected () extends ODataType {
    /**
      * Constructor for a primitive type <code>Edm.Int64</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @param sValue the value to be formatted, which is represented as a string in the model
      * @param sTargetType the target type; may be "any", "float", "int" or "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    /**
      * Parses the given value, which is expected to be of the given type, to an Int64 in<code>string</code>
      * representation.
      * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
      * or  "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @param sValue the value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
  @js.native
  class ODataType protected () extends SimpleType {
    /**
      * Constructor for a new <code>ODataType</code>.
      * @param oFormatOptions type-specific format options; see subtypes
      * @param oConstraints type-specific constraints (e.g. <code>oConstraints.nullable</code>), see
      * subtypes
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Raw protected () extends ODataType {
    /**
      * Constructor for a placeholder for all unsupported OData primitive types.
      * @param oFormatOptions Must be <code>undefined</code>
      * @param oConstraints Must be <code>undefined</code>
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Method not supported
      * @since 1.37.0
      */
    def parseValue(): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def validateValue(): Unit = js.native
  }
  
  @js.native
  class SByte protected () extends Int {
    /**
      * Constructor for a primitive type <code>Edm.SByte</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}
      * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
      * throws an  error if any constraint is violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Returns the type's supported range as object with properties <code>minimum</code>
      * and<code>maximum</code>.
      * @returns the range
      */
    def getRange(): js.Any = js.native
  }
  
  @js.native
  class Single protected () extends ODataType {
    /**
      * Constructor for a primitive type <code>Edm.Single</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
      * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @param vValue the value to be formatted, which is represented as a number in the model
      * @param sTargetType the target type; may be "any", "float", "int", "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(vValue: java.lang.String, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    def formatValue(vValue: scala.Double, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
    /**
      * Parses the given value, which is expected to be of the given type, to an Edm.Single
      * in<code>number</code> representation.
      * @since 1.29.0
      * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
      * <code>null</code>; note that there is no way to enter <code>Infinity</code> or  <code>NaN</code>
      * values
      * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
      *  or "string".  See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Double = js.native
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): scala.Double = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @since 1.29.0
      * @param fValue the value to be validated
      */
    def validateValue(fValue: scala.Double): Unit = js.native
  }
  
  @js.native
  class String protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.String</code>.
      * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
      * this  type ignores them since it does not support any format options
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.If <code>isDigitSequence</code> constraint of this
      * type is set to <code>true</code> and thetarget type is any or string and the given value contains
      * only digits, the leading zeros aretruncated.
      * @param sValue the value to be formatted
      * @param sTargetType the target type; may be "any", "boolean", "float", "int" or "string".  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the formatted output value in the target type; <code>undefined</code> is always formatted 
      * to <code>null</code>; <code>null</code> is formatted to "" if the target type is "string".
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): java.lang.String | scala.Double | scala.Boolean = js.native
    /**
      * Parses the given value which is expected to be of the given type to a string.If
      * <code>isDigitSequence</code> constraint of this type is set to <code>true</code> andthe parsed
      * string is a sequence of digits, then the parsed string is either enhanced withleading zeros, if
      * <code>maxLength</code> constraint is given, or leading zeros are removedfrom parsed string.
      * @param vValue the value to be parsed, maps <code>""</code> to <code>null</code>
      * @param sSourceType the source type (the expected type of <code>vValue</code>).  See {@link
      * sap.ui.model.odata.type} for more information.
      * @returns the parsed value
      */
    def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    def parseValue(vValue: scala.Boolean, sSourceType: java.lang.String): java.lang.String = js.native
    def parseValue(vValue: scala.Double, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates whether the given value in model representation is valid and meets thedefined constraints.
      * @param sValue the value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
  @js.native
  class Time protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.Time</code>.
      * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Parses the given value, which is expected to be of the given type, to a time object.
      * @param sValue the value to be parsed, maps <code>""</code> to <code>null</code>
      * @param sSourceType the source type (the expected type of <code>sValue</code>); must be "string". 
      * See {@link sap.ui.model.odata.type} for more information.
      * @returns the parsed value as described in {@link #formatValue formatValue}
      */
    def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): js.Any = js.native
  }
  
  @js.native
  class TimeOfDay protected () extends ODataType {
    /**
      * Constructor for an OData primitive type <code>Edm.TimeOfDay</code>.
      * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
      * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
      * constraint is  violated
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      * Formats the given value to the given target type.
      * @since 1.37.0
      * @param sValue The value to be formatted, which is represented as a string in the model
      * @param sTargetType The target type, may be "any" or "string"; see {@link sap.ui.model.odata.type}
      * for more  information
      * @returns The formatted output value in the target type; <code>undefined</code> or <code>null</code> 
      * are formatted to <code>null</code>
      */
    def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): java.lang.String = js.native
    /**
      * Parses the given value, which is expected to be of the given type, to a string with anOData V4
      * Edm.TimeOfDay value.
      * @since 1.37.0
      * @param sValue The value to be parsed, maps <code>""</code> to <code>null</code>
      * @param sSourceType The source type (the expected type of <code>sValue</code>), must be "string"; see
      *  {@link sap.ui.model.odata.type} for more information.
      * @returns The parsed value
      */
    def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
    /**
      * Validates the given value in model representation and meets the type's constraints.
      * @since 1.37.0
      * @param sValue The value to be validated
      */
    def validateValue(sValue: java.lang.String): Unit = js.native
  }
  
}

