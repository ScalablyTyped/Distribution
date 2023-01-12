package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigneesArray extends StObject {
  
  /** @description Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._ */
  var assignees: js.Array[String]
}
object AssigneesArray {
  
  inline def apply(assignees: js.Array[String]): AssigneesArray = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssigneesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssigneesArray] (val x: Self) extends AnyVal {
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
  }
}
