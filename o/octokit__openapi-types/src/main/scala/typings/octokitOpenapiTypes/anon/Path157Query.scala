package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path157Query extends StObject {
  
  var path: `157`
  
  var query: js.UndefOr[Affiliation] = js.undefined
}
object Path157Query {
  
  inline def apply(path: `157`): Path157Query = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path157Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path157Query] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `157`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Affiliation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
