package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var path: Teamslug
  
  var query: js.UndefOr[Page] = js.undefined
}
object `142` {
  
  inline def apply(path: Teamslug): `142` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `142`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
