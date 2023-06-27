package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `673` extends StObject {
  
  var path: OwnerString
  
  var query: js.UndefOr[ClientipLocation] = js.undefined
}
object `673` {
  
  inline def apply(path: OwnerString): `673` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`673`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `673`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipLocation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
