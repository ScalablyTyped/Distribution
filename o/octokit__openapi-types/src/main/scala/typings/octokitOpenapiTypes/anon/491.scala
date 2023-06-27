package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `491` extends StObject {
  
  var path: `444`
  
  var query: js.UndefOr[SortType] = js.undefined
}
object `491` {
  
  inline def apply(path: `444`): `491` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`491`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `491`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `444`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SortType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
