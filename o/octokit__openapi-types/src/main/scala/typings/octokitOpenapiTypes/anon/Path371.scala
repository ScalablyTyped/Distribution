package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path371 extends StObject {
  
  var path: `371`
  
  var query: `372`
}
object Path371 {
  
  inline def apply(path: `371`, query: `372`): Path371 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path371]
  }
  
  extension [Self <: Path371](x: Self) {
    
    inline def setPath(value: `371`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `372`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
