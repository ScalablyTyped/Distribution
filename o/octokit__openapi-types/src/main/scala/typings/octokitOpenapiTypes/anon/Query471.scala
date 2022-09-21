package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query471 extends StObject {
  
  var path: OrgPackagename
  
  var query: `471`
}
object Query471 {
  
  inline def apply(path: OrgPackagename, query: `471`): Query471 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query471]
  }
  
  extension [Self <: Query471](x: Self) {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `471`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
