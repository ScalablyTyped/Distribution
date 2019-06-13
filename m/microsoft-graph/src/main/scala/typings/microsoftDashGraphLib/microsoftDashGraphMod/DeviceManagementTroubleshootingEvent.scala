package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementTroubleshootingEvent extends Entity {
  /** Id used for tracing the failure in the service. */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /** Time when the event occurred . */
  var eventDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceManagementTroubleshootingEvent {
  @scala.inline
  def apply(
    correlationId: java.lang.String = null,
    eventDateTime: java.lang.String = null,
    id: java.lang.String = null
  ): DeviceManagementTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (eventDateTime != null) __obj.updateDynamic("eventDateTime")(eventDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DeviceManagementTroubleshootingEvent]
  }
}

