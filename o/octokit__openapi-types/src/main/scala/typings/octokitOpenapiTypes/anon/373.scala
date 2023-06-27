package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `373` extends StObject {
  
  var path: Pullnumber
  
  var query: js.UndefOr[Page] = js.undefined
}
object `373` {
  
  inline def apply(path: Pullnumber): `373` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`373`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `373`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
