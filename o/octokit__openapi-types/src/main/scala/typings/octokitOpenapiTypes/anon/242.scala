package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var path: Owner
  
  var query: js.UndefOr[ClientipRef] = js.undefined
}
object `242` {
  
  inline def apply(path: Owner): `242` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`242`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `242`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
