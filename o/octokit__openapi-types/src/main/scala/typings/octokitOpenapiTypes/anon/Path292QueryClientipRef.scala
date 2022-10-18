package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path292QueryClientipRef extends StObject {
  
  var path: `292`
  
  var query: ClientipRef
}
object Path292QueryClientipRef {
  
  inline def apply(path: `292`, query: ClientipRef): Path292QueryClientipRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path292QueryClientipRef]
  }
  
  extension [Self <: Path292QueryClientipRef](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
