package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path292QueryAfterBefore extends StObject {
  
  var path: `292`
  
  var query: AfterBefore
}
object Path292QueryAfterBefore {
  
  inline def apply(path: `292`, query: AfterBefore): Path292QueryAfterBefore = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path292QueryAfterBefore]
  }
  
  extension [Self <: Path292QueryAfterBefore](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AfterBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
