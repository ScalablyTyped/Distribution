package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path444Query extends StObject {
  
  var path: `444`
  
  var query: js.UndefOr[Page] = js.undefined
}
object Path444Query {
  
  inline def apply(path: `444`): Path444Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path444Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path444Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `444`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
