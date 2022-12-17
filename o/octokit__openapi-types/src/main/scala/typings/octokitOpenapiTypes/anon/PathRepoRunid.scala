package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunid extends StObject {
  
  var path: RepoRunid
  
  var query: `474`
}
object PathRepoRunid {
  
  inline def apply(path: RepoRunid, query: `474`): PathRepoRunid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunid]
  }
  
  extension [Self <: PathRepoRunid](x: Self) {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `474`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
