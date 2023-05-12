package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromOrganizationUser extends StObject {
  
  var from: OrganizationUser
}
object FromOrganizationUser {
  
  inline def apply(from: OrganizationUser): FromOrganizationUser = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromOrganizationUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromOrganizationUser] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: OrganizationUser): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
