package typings.nextAuth

import typings.nextAuth.anon.FirstName
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersWorkosMod {
  
  @JSImport("next-auth/providers/workos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: WorkOSProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait WorkOSProfile extends StObject {
    
    var connection_id: String
    
    var connection_type: String
    
    var email: String
    
    var first_name: String
    
    var id: String
    
    var idp_id: String
    
    var last_name: String
    
    var `object`: String
    
    var organization_id: String
    
    var raw_attributes: FirstName
  }
  object WorkOSProfile {
    
    inline def apply(
      connection_id: String,
      connection_type: String,
      email: String,
      first_name: String,
      id: String,
      idp_id: String,
      last_name: String,
      `object`: String,
      organization_id: String,
      raw_attributes: FirstName
    ): WorkOSProfile = {
      val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], connection_type = connection_type.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idp_id = idp_id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], raw_attributes = raw_attributes.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkOSProfile]
    }
    
    extension [Self <: WorkOSProfile](x: Self) {
      
      inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
      
      inline def setConnection_type(value: String): Self = StObject.set(x, "connection_type", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdp_id(value: String): Self = StObject.set(x, "idp_id", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
      
      inline def setRaw_attributes(value: FirstName): Self = StObject.set(x, "raw_attributes", value.asInstanceOf[js.Any])
    }
  }
}
