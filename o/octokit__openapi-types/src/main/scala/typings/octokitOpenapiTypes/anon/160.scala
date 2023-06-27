package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var path: `157`
  
  var query: js.UndefOr[Page] = js.undefined
}
object `160` {
  
  inline def apply(path: `157`): `160` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `160`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `157`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
