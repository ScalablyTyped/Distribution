package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoSha extends StObject {
  
  var path: RepoSha
}
object PathRepoSha {
  
  inline def apply(path: RepoSha): PathRepoSha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoSha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoSha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
