package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `637` extends StObject {
  
  var path: ProjectidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object `637` {
  
  inline def apply(path: ProjectidNumber): `637` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`637`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `637`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
