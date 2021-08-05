package typings.onesignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
}
object CordovaPlugins {
  
  inline def apply(OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setOneSignal(value: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): Self = StObject.set(x, "OneSignal", value.asInstanceOf[js.Any])
  }
}
