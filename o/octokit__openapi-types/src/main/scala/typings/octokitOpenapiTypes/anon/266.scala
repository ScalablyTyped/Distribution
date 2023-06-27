package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `266` extends StObject {
  
  var path: Owner
  
  var query: js.UndefOr[Ecosystem] = js.undefined
}
object `266` {
  
  inline def apply(path: Owner): `266` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`266`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `266`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Ecosystem): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
