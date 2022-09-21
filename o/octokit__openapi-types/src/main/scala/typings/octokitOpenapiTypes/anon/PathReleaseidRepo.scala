package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReleaseidRepo extends StObject {
  
  var path: ReleaseidRepo
}
object PathReleaseidRepo {
  
  inline def apply(path: ReleaseidRepo): PathReleaseidRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReleaseidRepo]
  }
  
  extension [Self <: PathReleaseidRepo](x: Self) {
    
    inline def setPath(value: ReleaseidRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
