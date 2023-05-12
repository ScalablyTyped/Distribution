package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddUserOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Custom data associated with the user (only Mongodb 2.6 or higher) */
  var customData: js.UndefOr[Document] = js.undefined
  
  /** Roles associated with the created user */
  var roles: js.UndefOr[String | (js.Array[RoleSpecification | String]) | RoleSpecification] = js.undefined
}
object AddUserOptions {
  
  inline def apply(): AddUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddUserOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddUserOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomData(value: Document): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setRoles(value: String | (js.Array[RoleSpecification | String]) | RoleSpecification): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: (RoleSpecification | String)*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
