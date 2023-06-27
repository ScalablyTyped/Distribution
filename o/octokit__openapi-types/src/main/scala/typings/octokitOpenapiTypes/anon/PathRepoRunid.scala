package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunid extends StObject {
  
  var path: RepoRunid
  
  var query: js.UndefOr[`644`] = js.undefined
}
object PathRepoRunid {
  
  inline def apply(path: RepoRunid): PathRepoRunid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRunid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `644`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
