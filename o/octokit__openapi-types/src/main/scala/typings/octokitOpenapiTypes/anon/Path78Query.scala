package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path78Query extends StObject {
  
  var path: `78`
  
  var query: js.UndefOr[PagePerpage] = js.undefined
}
object Path78Query {
  
  inline def apply(path: `78`): Path78Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path78Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path78Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `78`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
