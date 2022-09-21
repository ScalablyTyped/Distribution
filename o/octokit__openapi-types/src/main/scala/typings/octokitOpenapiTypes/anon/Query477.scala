package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query477 extends StObject {
  
  var path: OrgString
  
  var query: `477`
}
object Query477 {
  
  inline def apply(path: OrgString, query: `477`): Query477 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query477]
  }
  
  extension [Self <: Query477](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `477`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
