package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.onesignalCordovaPluginStrings.ActionTaken
import typings.onesignalCordovaPlugin.onesignalCordovaPluginStrings.Opened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSNotificationAction extends StObject {
  
  var actionID: String
  
  var `type`: Opened | ActionTaken
}
object OSNotificationAction {
  
  inline def apply(actionID: String, `type`: Opened | ActionTaken): OSNotificationAction = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationAction]
  }
  
  extension [Self <: OSNotificationAction](x: Self) {
    
    inline def setActionID(value: String): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    inline def setType(value: Opened | ActionTaken): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
