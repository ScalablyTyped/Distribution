package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `321` extends StObject {
  
  var path: Owner
  
  var query: js.UndefOr[PerpageSince] = js.undefined
}
object `321` {
  
  inline def apply(path: Owner): `321` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`321`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `321`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
