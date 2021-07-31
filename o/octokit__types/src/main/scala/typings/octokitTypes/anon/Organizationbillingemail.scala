package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizationbillingemail extends StObject {
  
  var email: String
  
  var id: Double
  
  var login: String
  
  var organization_billing_email: String
  
  var `type`: String
  
  var url: String
}
object Organizationbillingemail {
  
  @scala.inline
  def apply(
    email: String,
    id: Double,
    login: String,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): Organizationbillingemail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationbillingemail]
  }
  
  @scala.inline
  implicit class OrganizationbillingemailMutableBuilder[Self <: Organizationbillingemail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
