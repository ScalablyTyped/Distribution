package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportStateAndNotificationDevice extends StObject {
  
  /** Notifications metadata for devices. See the **Device NOTIFICATIONS** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits). */
  var notifications: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** States of devices to update. See the **Device STATES** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits). */
  var states: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object ReportStateAndNotificationDevice {
  
  inline def apply(): ReportStateAndNotificationDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStateAndNotificationDevice]
  }
  
  extension [Self <: ReportStateAndNotificationDevice](x: Self) {
    
    inline def setNotifications(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setStates(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
