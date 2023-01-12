package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPermissionState extends StObject {
  
  var hasPrompted: Boolean
  
  var provisional: Boolean
  
  var state: OSNotificationPermissionState
  
  var status: OSNotificationPermission
}
object OSPermissionState {
  
  inline def apply(
    hasPrompted: Boolean,
    provisional: Boolean,
    state: OSNotificationPermissionState,
    status: OSNotificationPermission
  ): OSPermissionState = {
    val __obj = js.Dynamic.literal(hasPrompted = hasPrompted.asInstanceOf[js.Any], provisional = provisional.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSPermissionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPermissionState] (val x: Self) extends AnyVal {
    
    inline def setHasPrompted(value: Boolean): Self = StObject.set(x, "hasPrompted", value.asInstanceOf[js.Any])
    
    inline def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
    
    inline def setState(value: OSNotificationPermissionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OSNotificationPermission): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
