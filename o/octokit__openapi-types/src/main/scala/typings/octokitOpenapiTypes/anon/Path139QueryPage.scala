package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path139QueryPage extends StObject {
  
  var path: `139`
  
  var query: Page
}
object Path139QueryPage {
  
  inline def apply(path: `139`, query: Page): Path139QueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path139QueryPage]
  }
  
  extension [Self <: Path139QueryPage](x: Self) {
    
    inline def setPath(value: `139`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
