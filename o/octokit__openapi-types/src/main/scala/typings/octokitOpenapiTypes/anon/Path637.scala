package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path637 extends StObject {
  
  var path: `637`
  
  var query: `214`
}
object Path637 {
  
  inline def apply(path: `637`, query: `214`): Path637 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path637]
  }
  
  extension [Self <: Path637](x: Self) {
    
    inline def setPath(value: `637`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `214`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
