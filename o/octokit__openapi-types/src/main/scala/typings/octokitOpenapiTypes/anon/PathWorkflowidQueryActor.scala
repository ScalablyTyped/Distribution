package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWorkflowidQueryActor extends StObject {
  
  var path: Workflowid
  
  var query: Actor
}
object PathWorkflowidQueryActor {
  
  inline def apply(path: Workflowid, query: Actor): PathWorkflowidQueryActor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathWorkflowidQueryActor]
  }
  
  extension [Self <: PathWorkflowidQueryActor](x: Self) {
    
    inline def setPath(value: Workflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Actor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
