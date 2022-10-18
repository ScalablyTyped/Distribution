package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAssigneeCreator extends StObject {
  
  var path: `292`
  
  var query: AssigneeCreator
}
object QueryAssigneeCreator {
  
  inline def apply(path: `292`, query: AssigneeCreator): QueryAssigneeCreator = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAssigneeCreator]
  }
  
  extension [Self <: QueryAssigneeCreator](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AssigneeCreator): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
