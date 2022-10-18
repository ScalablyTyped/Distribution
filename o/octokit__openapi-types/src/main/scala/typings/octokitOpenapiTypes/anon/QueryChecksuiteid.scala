package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryChecksuiteid extends StObject {
  
  var path: OwnerRepo
  
  var query: Checksuiteid
}
object QueryChecksuiteid {
  
  inline def apply(path: OwnerRepo, query: Checksuiteid): QueryChecksuiteid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryChecksuiteid]
  }
  
  extension [Self <: QueryChecksuiteid](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Checksuiteid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
