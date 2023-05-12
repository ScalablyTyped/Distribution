package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunid extends StObject {
  
  var path: RepoRunid
  
  var query: `543`
}
object PathRepoRunid {
  
  inline def apply(path: RepoRunid, query: `543`): PathRepoRunid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRunid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `543`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
