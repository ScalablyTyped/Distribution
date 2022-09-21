package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Memberemail extends StObject {
  
  /**
    * @description An email attached to a user
    * @example mona_lisa@github.com
    */
  var member_email: String
  
  /**
    * @description The internal user ID of the identity
    * @example 1
    */
  var member_id: Double
  
  /**
    * @description The handle/login for the user
    * @example mona-lisa_eocsaxrs
    */
  var member_login: String
  
  /**
    * @description The user display name/profile name
    * @example Mona Lisa
    */
  var member_name: String
}
object Memberemail {
  
  inline def apply(member_email: String, member_id: Double, member_login: String, member_name: String): Memberemail = {
    val __obj = js.Dynamic.literal(member_email = member_email.asInstanceOf[js.Any], member_id = member_id.asInstanceOf[js.Any], member_login = member_login.asInstanceOf[js.Any], member_name = member_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memberemail]
  }
  
  extension [Self <: Memberemail](x: Self) {
    
    inline def setMember_email(value: String): Self = StObject.set(x, "member_email", value.asInstanceOf[js.Any])
    
    inline def setMember_id(value: Double): Self = StObject.set(x, "member_id", value.asInstanceOf[js.Any])
    
    inline def setMember_login(value: String): Self = StObject.set(x, "member_login", value.asInstanceOf[js.Any])
    
    inline def setMember_name(value: String): Self = StObject.set(x, "member_name", value.asInstanceOf[js.Any])
  }
}
