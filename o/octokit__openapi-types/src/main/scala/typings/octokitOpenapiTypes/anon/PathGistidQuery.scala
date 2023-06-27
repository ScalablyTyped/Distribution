package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidQuery extends StObject {
  
  var path: Gistid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathGistidQuery {
  
  inline def apply(path: Gistid): PathGistidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGistidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Gistid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
