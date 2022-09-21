package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query468 extends StObject {
  
  var path: OrgString
  
  var query: `468`
}
object Query468 {
  
  inline def apply(path: OrgString, query: `468`): Query468 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query468]
  }
  
  extension [Self <: Query468](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `468`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
