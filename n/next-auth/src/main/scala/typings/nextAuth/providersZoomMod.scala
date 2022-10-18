package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersZoomMod {
  
  @JSImport("next-auth/providers/zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: ZoomProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait ZoomProfile extends StObject {
    
    var account_id: String
    
    var created_at: String
    
    var dept: String
    
    var email: String
    
    var first_name: String
    
    var group_ids: js.Array[String]
    
    var host_key: String
    
    var id: String
    
    var im_group_ids: js.Array[String]
    
    var jid: String
    
    var language: String
    
    var last_client_version: String
    
    var last_login_time: String
    
    var last_name: String
    
    var personal_meeting_url: String
    
    var phone_country: String
    
    var phone_number: String
    
    var pic_url: String
    
    var pmi: Double
    
    var role_name: String
    
    var status: String
    
    var timezone: String
    
    var `type`: Double
    
    var use_pmi: Boolean
    
    var vanity_url: String
    
    var verified: Double
  }
  object ZoomProfile {
    
    inline def apply(
      account_id: String,
      created_at: String,
      dept: String,
      email: String,
      first_name: String,
      group_ids: js.Array[String],
      host_key: String,
      id: String,
      im_group_ids: js.Array[String],
      jid: String,
      language: String,
      last_client_version: String,
      last_login_time: String,
      last_name: String,
      personal_meeting_url: String,
      phone_country: String,
      phone_number: String,
      pic_url: String,
      pmi: Double,
      role_name: String,
      status: String,
      timezone: String,
      `type`: Double,
      use_pmi: Boolean,
      vanity_url: String,
      verified: Double
    ): ZoomProfile = {
      val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], dept = dept.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], group_ids = group_ids.asInstanceOf[js.Any], host_key = host_key.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], im_group_ids = im_group_ids.asInstanceOf[js.Any], jid = jid.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_client_version = last_client_version.asInstanceOf[js.Any], last_login_time = last_login_time.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], personal_meeting_url = personal_meeting_url.asInstanceOf[js.Any], phone_country = phone_country.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pic_url = pic_url.asInstanceOf[js.Any], pmi = pmi.asInstanceOf[js.Any], role_name = role_name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], use_pmi = use_pmi.asInstanceOf[js.Any], vanity_url = vanity_url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomProfile]
    }
    
    extension [Self <: ZoomProfile](x: Self) {
      
      inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDept(value: String): Self = StObject.set(x, "dept", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setGroup_ids(value: js.Array[String]): Self = StObject.set(x, "group_ids", value.asInstanceOf[js.Any])
      
      inline def setGroup_idsVarargs(value: String*): Self = StObject.set(x, "group_ids", js.Array(value*))
      
      inline def setHost_key(value: String): Self = StObject.set(x, "host_key", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIm_group_ids(value: js.Array[String]): Self = StObject.set(x, "im_group_ids", value.asInstanceOf[js.Any])
      
      inline def setIm_group_idsVarargs(value: String*): Self = StObject.set(x, "im_group_ids", js.Array(value*))
      
      inline def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLast_client_version(value: String): Self = StObject.set(x, "last_client_version", value.asInstanceOf[js.Any])
      
      inline def setLast_login_time(value: String): Self = StObject.set(x, "last_login_time", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setPersonal_meeting_url(value: String): Self = StObject.set(x, "personal_meeting_url", value.asInstanceOf[js.Any])
      
      inline def setPhone_country(value: String): Self = StObject.set(x, "phone_country", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPic_url(value: String): Self = StObject.set(x, "pic_url", value.asInstanceOf[js.Any])
      
      inline def setPmi(value: Double): Self = StObject.set(x, "pmi", value.asInstanceOf[js.Any])
      
      inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUse_pmi(value: Boolean): Self = StObject.set(x, "use_pmi", value.asInstanceOf[js.Any])
      
      inline def setVanity_url(value: String): Self = StObject.set(x, "vanity_url", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Double): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
