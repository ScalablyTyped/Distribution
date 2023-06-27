package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `440` extends StObject {
  
  var path: Teamid
  
  var query: js.UndefOr[PerpageRole] = js.undefined
}
object `440` {
  
  inline def apply(path: Teamid): `440` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`440`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `440`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
