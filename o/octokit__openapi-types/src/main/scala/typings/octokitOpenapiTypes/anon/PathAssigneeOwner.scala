package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssigneeOwner extends StObject {
  
  var path: AssigneeOwner
}
object PathAssigneeOwner {
  
  inline def apply(path: AssigneeOwner): PathAssigneeOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssigneeOwner]
  }
  
  extension [Self <: PathAssigneeOwner](x: Self) {
    
    inline def setPath(value: AssigneeOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
