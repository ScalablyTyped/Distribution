package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportStateAndNotificationDevice extends StObject {
  
  /** Notifications metadata for devices. See the **Device NOTIFICATIONS** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits). */
  var notifications: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.ReportStateAndNotificationDevice with TopLevel[js.Any]
  ] = js.native
  
  /** States of devices to update. See the **Device STATES** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits). */
  var states: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.ReportStateAndNotificationDevice with TopLevel[js.Any]
  ] = js.native
}
object ReportStateAndNotificationDevice {
  
  @scala.inline
  def apply(): ReportStateAndNotificationDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStateAndNotificationDevice]
  }
  
  @scala.inline
  implicit class ReportStateAndNotificationDeviceMutableBuilder[Self <: ReportStateAndNotificationDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifications(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.ReportStateAndNotificationDevice with TopLevel[js.Any]
    ): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setStates(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.ReportStateAndNotificationDevice with TopLevel[js.Any]
    ): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
