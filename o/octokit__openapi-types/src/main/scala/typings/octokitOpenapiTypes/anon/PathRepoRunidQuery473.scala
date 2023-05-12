package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunidQuery473 extends StObject {
  
  var path: RepoRunid
  
  var query: `473`
}
object PathRepoRunidQuery473 {
  
  inline def apply(path: RepoRunid, query: `473`): PathRepoRunidQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRunidQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
