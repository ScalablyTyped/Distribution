package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var path: Teamslug
  
  var query: js.UndefOr[PerpageRole] = js.undefined
}
object `144` {
  
  inline def apply(path: Teamslug): `144` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
