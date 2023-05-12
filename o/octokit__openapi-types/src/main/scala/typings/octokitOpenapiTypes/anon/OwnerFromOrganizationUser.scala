package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerFromOrganizationUser extends StObject {
  
  var owner: FromOrganizationUser
}
object OwnerFromOrganizationUser {
  
  inline def apply(owner: FromOrganizationUser): OwnerFromOrganizationUser = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerFromOrganizationUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerFromOrganizationUser] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: FromOrganizationUser): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
