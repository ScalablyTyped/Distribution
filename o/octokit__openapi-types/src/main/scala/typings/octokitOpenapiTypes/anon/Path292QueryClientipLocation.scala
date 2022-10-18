package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path292QueryClientipLocation extends StObject {
  
  var path: `292`
  
  var query: ClientipLocation
}
object Path292QueryClientipLocation {
  
  inline def apply(path: `292`, query: ClientipLocation): Path292QueryClientipLocation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path292QueryClientipLocation]
  }
  
  extension [Self <: Path292QueryClientipLocation](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipLocation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
