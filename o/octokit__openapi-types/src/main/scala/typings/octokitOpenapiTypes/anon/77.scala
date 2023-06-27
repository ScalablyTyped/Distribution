package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var path: Org
  
  var query: js.UndefOr[`76`] = js.undefined
}
object `77` {
  
  inline def apply(path: Org): `77` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `77`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `76`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
