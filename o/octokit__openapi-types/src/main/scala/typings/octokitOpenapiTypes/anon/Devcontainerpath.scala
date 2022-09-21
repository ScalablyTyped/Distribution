package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devcontainerpath extends StObject {
  
  var devcontainer_path: String | Null
  
  var location: String
}
object Devcontainerpath {
  
  inline def apply(location: String): Devcontainerpath = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], devcontainer_path = null)
    __obj.asInstanceOf[Devcontainerpath]
  }
  
  extension [Self <: Devcontainerpath](x: Self) {
    
    inline def setDevcontainer_path(value: String): Self = StObject.set(x, "devcontainer_path", value.asInstanceOf[js.Any])
    
    inline def setDevcontainer_pathNull: Self = StObject.set(x, "devcontainer_path", null)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
