package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTeamid extends StObject {
  
  var path: RepoTeamid
}
object PathRepoTeamid {
  
  inline def apply(path: RepoTeamid): PathRepoTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoTeamid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
