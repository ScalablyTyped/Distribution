package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsername extends StObject {
  
  var path: Username
}
object PathUsername {
  
  inline def apply(path: Username): PathUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsername]
  }
  
  extension [Self <: PathUsername](x: Self) {
    
    inline def setPath(value: Username): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
