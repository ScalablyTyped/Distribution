package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `783` extends StObject {
  
  var path: TeamidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object `783` {
  
  inline def apply(path: TeamidNumber): `783` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`783`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `783`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
