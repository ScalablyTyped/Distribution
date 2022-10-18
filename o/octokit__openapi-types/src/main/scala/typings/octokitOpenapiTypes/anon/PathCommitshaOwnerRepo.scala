package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerRepo extends StObject {
  
  var path: CommitshaOwnerRepo
}
object PathCommitshaOwnerRepo {
  
  inline def apply(path: CommitshaOwnerRepo): PathCommitshaOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerRepo]
  }
  
  extension [Self <: PathCommitshaOwnerRepo](x: Self) {
    
    inline def setPath(value: CommitshaOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
