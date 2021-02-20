package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateAndNotificationPayload extends StObject {
  
  /** The devices for updating state and sending notifications. */
  var devices: js.UndefOr[ReportStateAndNotificationDevice] = js.native
}
object StateAndNotificationPayload {
  
  @scala.inline
  def apply(): StateAndNotificationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateAndNotificationPayload]
  }
  
  @scala.inline
  implicit class StateAndNotificationPayloadMutableBuilder[Self <: StateAndNotificationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: ReportStateAndNotificationDevice): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}
