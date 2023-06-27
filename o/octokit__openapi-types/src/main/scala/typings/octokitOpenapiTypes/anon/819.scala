package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `819` extends StObject {
  
  var path: `786`
  
  var query: js.UndefOr[DirectionPagePerpageSort] = js.undefined
}
object `819` {
  
  inline def apply(path: `786`): `819` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`819`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `819`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `786`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
