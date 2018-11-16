package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Decimal")
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
  /**
               * Constructor for a primitive type <code>Edm.Decimal</code>.
               * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
               * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.  Note that
               * <code>maxFractionDigits</code> and <code>minFractionDigits</code> are set to  the value of the
               * constraint <code>scale</code> unless it is "variable". They can however  be overwritten.
               * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
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
  /**
               * Parses the given value, which is expected to be of the given type, to a decimal
               * in<code>string</code> representation.
               * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
               * <code>null</code>
               * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
               * or  "string".  See {@link sap.ui.model.odata.type} for more information.
               * @returns the parsed value
              */
  def parseValue(vValue: scala.Double, sSourceType: java.lang.String): java.lang.String = js.native
  /**
               * Validates whether the given value in model representation is valid and meets thedefined constraints.
               * @param sValue the value to be validated
              */
  def validateValue(sValue: java.lang.String): scala.Unit = js.native
}

