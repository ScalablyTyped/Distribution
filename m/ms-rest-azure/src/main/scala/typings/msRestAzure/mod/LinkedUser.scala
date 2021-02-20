package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedUser extends StObject {
  
  /**
    * The user name. This could be a display name or a GUID.
    */
  var name: String = js.native
  
  /**
    * The user type: 'user', 'servicePrincipal'.
    */
  var `type`: UserType = js.native
}
object LinkedUser {
  
  @scala.inline
  def apply(name: String, `type`: UserType): LinkedUser = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedUser]
  }
  
  @scala.inline
  implicit class LinkedUserMutableBuilder[Self <: LinkedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
