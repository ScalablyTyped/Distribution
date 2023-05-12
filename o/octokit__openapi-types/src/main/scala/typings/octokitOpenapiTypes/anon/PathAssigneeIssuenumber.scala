package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssigneeIssuenumber extends StObject {
  
  var path: AssigneeIssuenumber
}
object PathAssigneeIssuenumber {
  
  inline def apply(path: AssigneeIssuenumber): PathAssigneeIssuenumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssigneeIssuenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAssigneeIssuenumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AssigneeIssuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
