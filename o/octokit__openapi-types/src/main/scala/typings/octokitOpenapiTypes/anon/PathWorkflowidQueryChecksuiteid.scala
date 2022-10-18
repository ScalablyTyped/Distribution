package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWorkflowidQueryChecksuiteid extends StObject {
  
  var path: Workflowid
  
  var query: Checksuiteid
}
object PathWorkflowidQueryChecksuiteid {
  
  inline def apply(path: Workflowid, query: Checksuiteid): PathWorkflowidQueryChecksuiteid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathWorkflowidQueryChecksuiteid]
  }
  
  extension [Self <: PathWorkflowidQueryChecksuiteid](x: Self) {
    
    inline def setPath(value: Workflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Checksuiteid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
