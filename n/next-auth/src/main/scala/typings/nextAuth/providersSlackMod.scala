package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersSlackMod {
  
  @JSImport("next-auth/providers/slack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: SlackProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait SlackProfile extends StObject {
    
    var date_email_verified: Double
    
    var email: String
    
    var email_verified: Boolean
    
    var family_name: String
    
    var given_name: String
    
    @JSName("https://slack.com/team_domain")
    var httpsColonSlashSlashslackDotcomSlashteam_domain: String
    
    @JSName("https://slack.com/team_id")
    var httpsColonSlashSlashslackDotcomSlashteam_id: String
    
    @JSName("https://slack.com/team_image_102")
    var httpsColonSlashSlashslackDotcomSlashteam_image_102: String
    
    @JSName("https://slack.com/team_image_132")
    var httpsColonSlashSlashslackDotcomSlashteam_image_132: String
    
    @JSName("https://slack.com/team_image_230")
    var httpsColonSlashSlashslackDotcomSlashteam_image_230: String
    
    @JSName("https://slack.com/team_image_34")
    var httpsColonSlashSlashslackDotcomSlashteam_image_34: String
    
    @JSName("https://slack.com/team_image_44")
    var httpsColonSlashSlashslackDotcomSlashteam_image_44: String
    
    @JSName("https://slack.com/team_image_68")
    var httpsColonSlashSlashslackDotcomSlashteam_image_68: String
    
    @JSName("https://slack.com/team_image_88")
    var httpsColonSlashSlashslackDotcomSlashteam_image_88: String
    
    @JSName("https://slack.com/team_image_default")
    var httpsColonSlashSlashslackDotcomSlashteam_image_default: Boolean
    
    @JSName("https://slack.com/team_name")
    var httpsColonSlashSlashslackDotcomSlashteam_name: String
    
    @JSName("https://slack.com/user_id")
    var httpsColonSlashSlashslackDotcomSlashuser_id: String
    
    @JSName("https://slack.com/user_image_1024")
    var httpsColonSlashSlashslackDotcomSlashuser_image_1024: String
    
    @JSName("https://slack.com/user_image_192")
    var httpsColonSlashSlashslackDotcomSlashuser_image_192: String
    
    @JSName("https://slack.com/user_image_24")
    var httpsColonSlashSlashslackDotcomSlashuser_image_24: String
    
    @JSName("https://slack.com/user_image_32")
    var httpsColonSlashSlashslackDotcomSlashuser_image_32: String
    
    @JSName("https://slack.com/user_image_48")
    var httpsColonSlashSlashslackDotcomSlashuser_image_48: String
    
    @JSName("https://slack.com/user_image_512")
    var httpsColonSlashSlashslackDotcomSlashuser_image_512: String
    
    @JSName("https://slack.com/user_image_72")
    var httpsColonSlashSlashslackDotcomSlashuser_image_72: String
    
    var locale: String
    
    var name: String
    
    var ok: Boolean
    
    var picture: String
    
    var sub: String
  }
  object SlackProfile {
    
    inline def apply(
      date_email_verified: Double,
      email: String,
      email_verified: Boolean,
      family_name: String,
      given_name: String,
      httpsColonSlashSlashslackDotcomSlashteam_domain: String,
      httpsColonSlashSlashslackDotcomSlashteam_id: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_102: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_132: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_230: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_34: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_44: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_68: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_88: String,
      httpsColonSlashSlashslackDotcomSlashteam_image_default: Boolean,
      httpsColonSlashSlashslackDotcomSlashteam_name: String,
      httpsColonSlashSlashslackDotcomSlashuser_id: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_1024: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_192: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_24: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_32: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_48: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_512: String,
      httpsColonSlashSlashslackDotcomSlashuser_image_72: String,
      locale: String,
      name: String,
      ok: Boolean,
      picture: String,
      sub: String
    ): SlackProfile = {
      val __obj = js.Dynamic.literal(date_email_verified = date_email_verified.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_domain")(httpsColonSlashSlashslackDotcomSlashteam_domain.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_id")(httpsColonSlashSlashslackDotcomSlashteam_id.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_102")(httpsColonSlashSlashslackDotcomSlashteam_image_102.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_132")(httpsColonSlashSlashslackDotcomSlashteam_image_132.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_230")(httpsColonSlashSlashslackDotcomSlashteam_image_230.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_34")(httpsColonSlashSlashslackDotcomSlashteam_image_34.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_44")(httpsColonSlashSlashslackDotcomSlashteam_image_44.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_68")(httpsColonSlashSlashslackDotcomSlashteam_image_68.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_88")(httpsColonSlashSlashslackDotcomSlashteam_image_88.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_image_default")(httpsColonSlashSlashslackDotcomSlashteam_image_default.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/team_name")(httpsColonSlashSlashslackDotcomSlashteam_name.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_id")(httpsColonSlashSlashslackDotcomSlashuser_id.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_1024")(httpsColonSlashSlashslackDotcomSlashuser_image_1024.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_192")(httpsColonSlashSlashslackDotcomSlashuser_image_192.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_24")(httpsColonSlashSlashslackDotcomSlashuser_image_24.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_32")(httpsColonSlashSlashslackDotcomSlashuser_image_32.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_48")(httpsColonSlashSlashslackDotcomSlashuser_image_48.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_512")(httpsColonSlashSlashslackDotcomSlashuser_image_512.asInstanceOf[js.Any])
      __obj.updateDynamic("https://slack.com/user_image_72")(httpsColonSlashSlashslackDotcomSlashuser_image_72.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlackProfile]
    }
    
    extension [Self <: SlackProfile](x: Self) {
      
      inline def setDate_email_verified(value: Double): Self = StObject.set(x, "date_email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_domain(value: String): Self = StObject.set(x, "https://slack.com/team_domain", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_id(value: String): Self = StObject.set(x, "https://slack.com/team_id", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_102(value: String): Self = StObject.set(x, "https://slack.com/team_image_102", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_132(value: String): Self = StObject.set(x, "https://slack.com/team_image_132", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_230(value: String): Self = StObject.set(x, "https://slack.com/team_image_230", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_34(value: String): Self = StObject.set(x, "https://slack.com/team_image_34", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_44(value: String): Self = StObject.set(x, "https://slack.com/team_image_44", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_68(value: String): Self = StObject.set(x, "https://slack.com/team_image_68", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_88(value: String): Self = StObject.set(x, "https://slack.com/team_image_88", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_image_default(value: Boolean): Self = StObject.set(x, "https://slack.com/team_image_default", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashteam_name(value: String): Self = StObject.set(x, "https://slack.com/team_name", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_id(value: String): Self = StObject.set(x, "https://slack.com/user_id", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_1024(value: String): Self = StObject.set(x, "https://slack.com/user_image_1024", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_192(value: String): Self = StObject.set(x, "https://slack.com/user_image_192", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_24(value: String): Self = StObject.set(x, "https://slack.com/user_image_24", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_32(value: String): Self = StObject.set(x, "https://slack.com/user_image_32", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_48(value: String): Self = StObject.set(x, "https://slack.com/user_image_48", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_512(value: String): Self = StObject.set(x, "https://slack.com/user_image_512", value.asInstanceOf[js.Any])
      
      inline def setHttpsColonSlashSlashslackDotcomSlashuser_image_72(value: String): Self = StObject.set(x, "https://slack.com/user_image_72", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
