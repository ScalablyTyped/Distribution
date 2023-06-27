package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `759` extends StObject {
  
  var path: OwnerString
  
  var query: js.UndefOr[DirectionPerpage] = js.undefined
}
object `759` {
  
  inline def apply(path: OwnerString): `759` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`759`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `759`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
