package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path383 extends StObject {
  
  var path: `383`
  
  var query: `384`
}
object Path383 {
  
  inline def apply(path: `383`, query: `384`): Path383 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path383]
  }
  
  extension [Self <: Path383](x: Self) {
    
    inline def setPath(value: `383`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `384`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
