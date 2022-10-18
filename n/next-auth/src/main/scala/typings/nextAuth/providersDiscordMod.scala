package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersDiscordMod {
  
  @JSImport("next-auth/providers/discord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: DiscordProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait DiscordProfile extends StObject {
    
    var accent_color: Double
    
    var avatar: String
    
    var banner: String
    
    var banner_color: String
    
    var discriminator: String
    
    var email: String
    
    var flags: Double
    
    var id: String
    
    var image_url: String
    
    var locale: String
    
    var mfa_enabled: Boolean
    
    var premium_type: Double
    
    var public_flags: Double
    
    var username: String
    
    var verified: Boolean
  }
  object DiscordProfile {
    
    inline def apply(
      accent_color: Double,
      avatar: String,
      banner: String,
      banner_color: String,
      discriminator: String,
      email: String,
      flags: Double,
      id: String,
      image_url: String,
      locale: String,
      mfa_enabled: Boolean,
      premium_type: Double,
      public_flags: Double,
      username: String,
      verified: Boolean
    ): DiscordProfile = {
      val __obj = js.Dynamic.literal(accent_color = accent_color.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], banner = banner.asInstanceOf[js.Any], banner_color = banner_color.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], premium_type = premium_type.asInstanceOf[js.Any], public_flags = public_flags.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscordProfile]
    }
    
    extension [Self <: DiscordProfile](x: Self) {
      
      inline def setAccent_color(value: Double): Self = StObject.set(x, "accent_color", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBanner_color(value: String): Self = StObject.set(x, "banner_color", value.asInstanceOf[js.Any])
      
      inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMfa_enabled(value: Boolean): Self = StObject.set(x, "mfa_enabled", value.asInstanceOf[js.Any])
      
      inline def setPremium_type(value: Double): Self = StObject.set(x, "premium_type", value.asInstanceOf[js.Any])
      
      inline def setPublic_flags(value: Double): Self = StObject.set(x, "public_flags", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
