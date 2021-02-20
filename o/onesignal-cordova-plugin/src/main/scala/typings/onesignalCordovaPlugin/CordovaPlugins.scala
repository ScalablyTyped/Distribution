package typings.onesignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  var OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneSignal(value: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): Self = StObject.set(x, "OneSignal", value.asInstanceOf[js.Any])
  }
}
