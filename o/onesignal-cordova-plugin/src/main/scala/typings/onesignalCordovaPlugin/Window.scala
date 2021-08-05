package typings.onesignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var plugins: CordovaPlugins
}
object Window {
  
  inline def apply(plugins: CordovaPlugins): Window = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setPlugins(value: CordovaPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
