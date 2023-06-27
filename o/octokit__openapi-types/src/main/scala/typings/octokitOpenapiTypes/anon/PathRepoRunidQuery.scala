package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunidQuery extends StObject {
  
  var path: RepoRunid
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathRepoRunidQuery {
  
  inline def apply(path: RepoRunid): PathRepoRunidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRunidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
