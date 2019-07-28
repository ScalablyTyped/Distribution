package typings.openui5.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.TimeOfDay")
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

