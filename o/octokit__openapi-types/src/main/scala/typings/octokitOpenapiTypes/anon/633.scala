package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `633` extends StObject {
  
  var path: TeamslugString
  
  var query: js.UndefOr[`632`] = js.undefined
}
object `633` {
  
  inline def apply(path: TeamslugString): `633` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`633`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `633`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `632`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
