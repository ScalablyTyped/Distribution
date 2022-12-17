package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path130QueryPage extends StObject {
  
  var path: `130`
  
  var query: Page
}
object Path130QueryPage {
  
  inline def apply(path: `130`, query: Page): Path130QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path130QueryPage]
  }
  
  extension [Self <: Path130QueryPage](x: Self) {
    
    inline def setPath(value: `130`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
