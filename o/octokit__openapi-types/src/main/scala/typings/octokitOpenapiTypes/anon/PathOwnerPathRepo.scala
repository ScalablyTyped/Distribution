package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerPathRepo extends StObject {
  
  var path: OwnerPathRepo
  
  var query: js.UndefOr[`237`] = js.undefined
}
object PathOwnerPathRepo {
  
  inline def apply(path: OwnerPathRepo): PathOwnerPathRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerPathRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerPathRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `237`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
