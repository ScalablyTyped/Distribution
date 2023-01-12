package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  * --------
  * Information about a chat member
  */
trait ThreadMember extends StObject {
  
  /**
    * The member's user principal name in the current tenant.
    */
  var upn: String
}
object ThreadMember {
  
  inline def apply(upn: String): ThreadMember = {
    val __obj = js.Dynamic.literal(upn = upn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreadMember] (val x: Self) extends AnyVal {
    
    inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
  }
}
