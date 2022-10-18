package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTeamslug extends StObject {
  
  var path: RepoTeamslug
}
object PathRepoTeamslug {
  
  inline def apply(path: RepoTeamslug): PathRepoTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTeamslug]
  }
  
  extension [Self <: PathRepoTeamslug](x: Self) {
    
    inline def setPath(value: RepoTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
