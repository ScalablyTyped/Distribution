package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTask extends StObject {
  
  var path: OwnerRepo
  
  var query: Task
}
object QueryTask {
  
  inline def apply(path: OwnerRepo, query: Task): QueryTask = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTask]
  }
  
  extension [Self <: QueryTask](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Task): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
