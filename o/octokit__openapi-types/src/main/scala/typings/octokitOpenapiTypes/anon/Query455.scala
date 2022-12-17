package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query455 extends StObject {
  
  var path: OrgPackagename
  
  var query: `455`
}
object Query455 {
  
  inline def apply(path: OrgPackagename, query: `455`): Query455 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query455]
  }
  
  extension [Self <: Query455](x: Self) {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `455`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
