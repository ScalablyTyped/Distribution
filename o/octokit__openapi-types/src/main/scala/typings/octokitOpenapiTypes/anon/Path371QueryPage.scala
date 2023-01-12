package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path371QueryPage extends StObject {
  
  var path: `371`
  
  var query: Page
}
object Path371QueryPage {
  
  inline def apply(path: `371`, query: Page): Path371QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path371QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path371QueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `371`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
