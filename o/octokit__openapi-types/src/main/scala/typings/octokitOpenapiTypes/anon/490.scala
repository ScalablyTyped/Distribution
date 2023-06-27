package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `490` extends StObject {
  
  var path: `444`
  
  var query: js.UndefOr[PerpageState] = js.undefined
}
object `490` {
  
  inline def apply(path: `444`): `490` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`490`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `490`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `444`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
