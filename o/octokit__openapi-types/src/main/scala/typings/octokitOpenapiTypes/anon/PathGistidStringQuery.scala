package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidStringQuery extends StObject {
  
  var path: GistidString
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathGistidStringQuery {
  
  inline def apply(path: GistidString): PathGistidStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGistidStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: GistidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
