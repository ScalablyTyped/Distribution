package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumber extends StObject {
  
  var path: Discussionnumber
}
object PathDiscussionnumber {
  
  inline def apply(path: Discussionnumber): PathDiscussionnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumber]
  }
  
  extension [Self <: PathDiscussionnumber](x: Self) {
    
    inline def setPath(value: Discussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
