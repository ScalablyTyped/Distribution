package typings.openui5.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.String")
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

