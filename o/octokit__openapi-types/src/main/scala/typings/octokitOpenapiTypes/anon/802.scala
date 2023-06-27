package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `802` extends StObject {
  
  var path: PackagenameString
  
  var query: js.UndefOr[`613`] = js.undefined
}
object `802` {
  
  inline def apply(path: PackagenameString): `802` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`802`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `802`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `613`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
