package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssigneeIssuenumberOwner extends StObject {
  
  var path: AssigneeIssuenumberOwner
}
object PathAssigneeIssuenumberOwner {
  
  inline def apply(path: AssigneeIssuenumberOwner): PathAssigneeIssuenumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssigneeIssuenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAssigneeIssuenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AssigneeIssuenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
