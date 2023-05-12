package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path134QueryPage extends StObject {
  
  var path: `134`
  
  var query: Page
}
object Path134QueryPage {
  
  inline def apply(path: `134`, query: Page): Path134QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path134QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path134QueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `134`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
