package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `784` extends StObject {
  
  var path: TeamidNumber
  
  var query: js.UndefOr[`632`] = js.undefined
}
object `784` {
  
  inline def apply(path: TeamidNumber): `784` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`784`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `784`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `632`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
