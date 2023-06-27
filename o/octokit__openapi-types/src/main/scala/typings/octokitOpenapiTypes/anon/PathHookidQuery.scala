package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidQuery extends StObject {
  
  var path: Hookid
  
  var query: js.UndefOr[Cursor] = js.undefined
}
object PathHookidQuery {
  
  inline def apply(path: Hookid): PathHookidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Hookid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Cursor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
