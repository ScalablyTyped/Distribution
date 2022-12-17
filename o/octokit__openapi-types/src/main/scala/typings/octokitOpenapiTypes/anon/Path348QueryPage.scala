package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path348QueryPage extends StObject {
  
  var path: `348`
  
  var query: Page
}
object Path348QueryPage {
  
  inline def apply(path: `348`, query: Page): Path348QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path348QueryPage]
  }
  
  extension [Self <: Path348QueryPage](x: Self) {
    
    inline def setPath(value: `348`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
