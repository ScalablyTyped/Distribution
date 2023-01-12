package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignment extends StObject {
  
  /** The user to whom the comment was assigned. */
  var assignedUser: js.UndefOr[User] = js.undefined
  
  /** The sub-type of this event. */
  var subtype: js.UndefOr[String] = js.undefined
}
object Assignment {
  
  inline def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    inline def setAssignedUser(value: User): Self = StObject.set(x, "assignedUser", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserUndefined: Self = StObject.set(x, "assignedUser", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
