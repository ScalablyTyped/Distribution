package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query355 extends StObject {
  
  var path: OrgPackagename
  
  var query: `355`
}
object Query355 {
  
  inline def apply(path: OrgPackagename, query: `355`): Query355 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query355]
  }
  
  extension [Self <: Query355](x: Self) {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `355`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
