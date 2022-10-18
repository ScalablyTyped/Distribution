package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunidQuery250 extends StObject {
  
  var path: RepoRunid
  
  var query: `250`
}
object PathRepoRunidQuery250 {
  
  inline def apply(path: RepoRunid, query: `250`): PathRepoRunidQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunidQuery250]
  }
  
  extension [Self <: PathRepoRunidQuery250](x: Self) {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
