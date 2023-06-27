package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `757` extends StObject {
  
  var path: AlertnumberOwnerRepo
  
  var query: js.UndefOr[`591`] = js.undefined
}
object `757` {
  
  inline def apply(path: AlertnumberOwnerRepo): `757` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`757`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `757`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `591`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
