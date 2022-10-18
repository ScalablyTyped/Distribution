package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResolution extends StObject {
  
  var path: OrgString
  
  var query: Resolution
}
object QueryResolution {
  
  inline def apply(path: OrgString, query: Resolution): QueryResolution = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResolution]
  }
  
  extension [Self <: QueryResolution](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Resolution): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
