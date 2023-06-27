package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path154Query extends StObject {
  
  var path: `154`
  
  var query: js.UndefOr[Archivedstate] = js.undefined
}
object Path154Query {
  
  inline def apply(path: `154`): Path154Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path154Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path154Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `154`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Archivedstate): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
