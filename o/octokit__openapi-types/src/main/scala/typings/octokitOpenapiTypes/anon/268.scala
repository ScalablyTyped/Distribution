package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `268` extends StObject {
  
  /** @description Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue. Assignees are silently ignored otherwise._ */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
}
object `268` {
  
  inline def apply(): `268` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`268`]
  }
  
  extension [Self <: `268`](x: Self) {
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
  }
}
