package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssigneeOwnerRepo extends StObject {
  
  var path: AssigneeOwnerRepo
}
object PathAssigneeOwnerRepo {
  
  inline def apply(path: AssigneeOwnerRepo): PathAssigneeOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssigneeOwnerRepo]
  }
  
  extension [Self <: PathAssigneeOwnerRepo](x: Self) {
    
    inline def setPath(value: AssigneeOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
