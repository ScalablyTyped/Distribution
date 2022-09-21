package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssignee extends StObject {
  
  var path: Assignee
}
object PathAssignee {
  
  inline def apply(path: Assignee): PathAssignee = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssignee]
  }
  
  extension [Self <: PathAssignee](x: Self) {
    
    inline def setPath(value: Assignee): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
