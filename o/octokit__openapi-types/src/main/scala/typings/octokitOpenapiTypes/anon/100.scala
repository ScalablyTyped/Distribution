package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var path: Org
  
  var query: js.UndefOr[Filter] = js.undefined
}
object `100` {
  
  inline def apply(path: Org): `100` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `100`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
