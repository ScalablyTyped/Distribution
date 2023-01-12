package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunidQuery407 extends StObject {
  
  var path: RepoRunid
  
  var query: `407`
}
object PathRepoRunidQuery407 {
  
  inline def apply(path: RepoRunid, query: `407`): PathRepoRunidQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunidQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRunidQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
