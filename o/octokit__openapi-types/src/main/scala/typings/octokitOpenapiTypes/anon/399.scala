package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `399` extends StObject {
  
  var path: Alertnumber
  
  var query: js.UndefOr[PagePerpage] = js.undefined
}
object `399` {
  
  inline def apply(path: Alertnumber): `399` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`399`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `399`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
