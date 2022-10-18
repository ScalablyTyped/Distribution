package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginName extends StObject {
  
  var pluginName: String
  
  var pluginVersion: js.UndefOr[String] = js.undefined
}
object PluginName {
  
  inline def apply(pluginName: String): PluginName = {
    val __obj = js.Dynamic.literal(pluginName = pluginName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginName]
  }
  
  extension [Self <: PluginName](x: Self) {
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginVersion(value: String): Self = StObject.set(x, "pluginVersion", value.asInstanceOf[js.Any])
    
    inline def setPluginVersionUndefined: Self = StObject.set(x, "pluginVersion", js.undefined)
  }
}
