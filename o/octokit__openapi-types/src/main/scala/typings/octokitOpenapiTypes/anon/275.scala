package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `275` extends StObject {
  
  var path: Owner
  
  var query: js.UndefOr[Environment] = js.undefined
}
object `275` {
  
  inline def apply(path: Owner): `275` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`275`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `275`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Environment): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
