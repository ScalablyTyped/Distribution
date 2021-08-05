package typings.postcss.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultMessage
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var plugin: String
  
  var `type`: String
}
object ResultMessage {
  
  inline def apply(plugin: String, `type`: String): ResultMessage = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultMessage]
  }
  
  extension [Self <: ResultMessage](x: Self) {
    
    inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
