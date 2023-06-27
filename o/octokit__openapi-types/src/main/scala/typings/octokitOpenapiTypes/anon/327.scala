package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327` extends StObject {
  
  /** @description Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue. Assignees are silently ignored otherwise._ */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
}
object `327` {
  
  inline def apply(): `327` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`327`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `327`] (val x: Self) extends AnyVal {
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
  }
}
