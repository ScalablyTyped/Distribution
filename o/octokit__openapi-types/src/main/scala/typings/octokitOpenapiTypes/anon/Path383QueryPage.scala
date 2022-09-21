package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path383QueryPage extends StObject {
  
  var path: `383`
  
  var query: Page
}
object Path383QueryPage {
  
  inline def apply(path: `383`, query: Page): Path383QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path383QueryPage]
  }
  
  extension [Self <: Path383QueryPage](x: Self) {
    
    inline def setPath(value: `383`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
