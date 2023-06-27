package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunidQuery extends StObject {
  
  var path: Runid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathRunidQuery {
  
  inline def apply(path: Runid): PathRunidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
