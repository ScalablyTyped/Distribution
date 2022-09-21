package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunidQuery426 extends StObject {
  
  var path: RepoRunid
  
  var query: `426`
}
object PathRepoRunidQuery426 {
  
  inline def apply(path: RepoRunid, query: `426`): PathRepoRunidQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunidQuery426]
  }
  
  extension [Self <: PathRepoRunidQuery426](x: Self) {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
