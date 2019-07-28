package typings.openui5.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.DateTimeOffset")
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

