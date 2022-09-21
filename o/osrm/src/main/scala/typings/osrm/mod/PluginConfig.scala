package typings.osrm.mod

import typings.osrm.osrmStrings.`object`
import typings.osrm.osrmStrings.json_buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConfig extends StObject {
  
  /**
    * The format of the result object to various API calls.
    * Valid options are object (default), which returns a standard Javascript object, as described above, and json_buffer, which will return a NodeJS Buffer object, containing a JSON string.
    * The latter has the advantage that it can be immediately serialized to disk/sent over the network, and the generation of the string is performed outside the main NodeJS event loop.
    * This option is ignored by the tile plugin.
    */
  var format: js.UndefOr[`object` | json_buffer] = js.undefined
}
object PluginConfig {
  
  inline def apply(): PluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginConfig]
  }
  
  extension [Self <: PluginConfig](x: Self) {
    
    inline def setFormat(value: `object` | json_buffer): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
