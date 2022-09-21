package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query426 extends StObject {
  
  var path: EnterpriseString
  
  var query: `426`
}
object Query426 {
  
  inline def apply(path: EnterpriseString, query: `426`): Query426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query426]
  }
  
  extension [Self <: Query426](x: Self) {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
