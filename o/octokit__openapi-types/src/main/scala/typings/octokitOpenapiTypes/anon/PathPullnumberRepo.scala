package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepo extends StObject {
  
  var path: PullnumberRepo
}
object PathPullnumberRepo {
  
  inline def apply(path: PullnumberRepo): PathPullnumberRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepo]
  }
  
  extension [Self <: PathPullnumberRepo](x: Self) {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
