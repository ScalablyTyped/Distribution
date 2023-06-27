package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path786Query extends StObject {
  
  var path: `786`
  
  var query: js.UndefOr[`552`] = js.undefined
}
object Path786Query {
  
  inline def apply(path: `786`): Path786Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path786Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path786Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `786`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
