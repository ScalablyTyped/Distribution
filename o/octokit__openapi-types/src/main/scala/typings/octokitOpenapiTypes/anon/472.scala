package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `472` extends StObject {
  
  var path: PackagenamePackagetype
  
  var query: js.UndefOr[State] = js.undefined
}
object `472` {
  
  inline def apply(path: PackagenamePackagetype): `472` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`472`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `472`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: State): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
