package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path394QueryPage extends StObject {
  
  var path: `394`
  
  var query: Page
}
object Path394QueryPage {
  
  inline def apply(path: `394`, query: Page): Path394QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path394QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path394QueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `394`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
