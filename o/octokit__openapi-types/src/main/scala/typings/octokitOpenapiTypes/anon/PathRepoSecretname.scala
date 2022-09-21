package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoSecretname extends StObject {
  
  var path: RepoSecretname
}
object PathRepoSecretname {
  
  inline def apply(path: RepoSecretname): PathRepoSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoSecretname]
  }
  
  extension [Self <: PathRepoSecretname](x: Self) {
    
    inline def setPath(value: RepoSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
