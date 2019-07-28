package typings.openui5.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Boolean")
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

