package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumber extends StObject {
  
  var path: CommentnumberDiscussionnumber
}
object PathCommentnumberDiscussionnumber {
  
  inline def apply(path: CommentnumberDiscussionnumber): PathCommentnumberDiscussionnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumber]
  }
  
  extension [Self <: PathCommentnumberDiscussionnumber](x: Self) {
    
    inline def setPath(value: CommentnumberDiscussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
