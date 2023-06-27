package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoString extends StObject {
  
  var path: RepoString
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathRepoString {
  
  inline def apply(path: RepoString): PathRepoString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
