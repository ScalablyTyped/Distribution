package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepo extends StObject {
  
  var path: Repo
}
object PathRepo {
  
  inline def apply(path: Repo): PathRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepo]
  }
  
  extension [Self <: PathRepo](x: Self) {
    
    inline def setPath(value: Repo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
