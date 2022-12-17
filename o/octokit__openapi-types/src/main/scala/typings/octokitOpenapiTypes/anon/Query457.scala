package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query457 extends StObject {
  
  var path: OrgString
  
  var query: `457`
}
object Query457 {
  
  inline def apply(path: OrgString, query: `457`): Query457 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query457]
  }
  
  extension [Self <: Query457](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `457`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
