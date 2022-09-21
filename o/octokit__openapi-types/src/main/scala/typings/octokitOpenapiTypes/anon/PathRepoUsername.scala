package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoUsername extends StObject {
  
  var path: RepoUsername
}
object PathRepoUsername {
  
  inline def apply(path: RepoUsername): PathRepoUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoUsername]
  }
  
  extension [Self <: PathRepoUsername](x: Self) {
    
    inline def setPath(value: RepoUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
