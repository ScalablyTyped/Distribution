package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path470Query extends StObject {
  
  var path: `470`
  
  var query: js.UndefOr[Page] = js.undefined
}
object Path470Query {
  
  inline def apply(path: `470`): Path470Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path470Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path470Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `470`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
