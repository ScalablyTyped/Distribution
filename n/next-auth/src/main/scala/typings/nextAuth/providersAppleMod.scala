package typings.nextAuth

import typings.nextAuth.anon.ClientSecret
import typings.nextAuth.nextAuthInts.`0`
import typings.nextAuth.nextAuthInts.`1`
import typings.nextAuth.nextAuthInts.`2`
import typings.nextAuth.nextAuthStrings.`true`
import typings.nextAuth.nextAuthStrings.clientSecret
import typings.nextAuth.nextAuthStrings.httpsColonSlashSlashappleidDotappleDotcom
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAppleMod {
  
  @JSImport("next-auth/providers/apple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_clientSecret[P /* <: AppleProfile */](options: (Omit[OAuthUserConfig[P], clientSecret]) & ClientSecret): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AppleProfile extends StObject {
    
    var at_hash: String
    
    /**
      * The audience registered claim identifies the recipient for which the identity token is intended.
      * Since the token is meant for your application, the value is the `client_id` from your developer account.
      */
    var aud: String
    
    var auth_time: Double
    
    /**
      * A String value representing the user's email address.
      * The email address is either the user's real email address or the proxy address,
      * depending on their status private email relay service.
      */
    var email: String
    
    /**
      * A String or Boolean value that indicates whether the service has verified the email.
      * The value of this claim is always true, because the servers only return verified email addresses.
      * The value can either be a String (`"true"`) or a Boolean (`true`).
      */
    var email_verified: `true` | typings.nextAuth.nextAuthBooleans.`true`
    
    /**
      * The expiration time registered identifies the time on or after which the identity token expires,
      * in terms of number of seconds since Epoch, in UTC.
      * The value must be greater than the current date/time when verifying the token.
      */
    var exp: Double
    
    /**
      * The issued at registered claim indicates the time at which Apple issued the identity token,
      * in terms of the number of seconds since Epoch, in UTC.
      */
    var iat: Double
    
    /**
      * A String or Boolean value that indicates whether the email shared by the user is the proxy address.
      * The value can either be a String (`"true"` or `"false"`) or a Boolean (`true` or `false`).
      */
    var is_private_email: Boolean
    
    /**
      * The issuer registered claim identifies the principal that issued the identity token.
      * Since Apple generates the token, the value is `https://appleid.apple.com`.
      */
    var iss: httpsColonSlashSlashappleidDotappleDotcom
    
    /**
      * A String value used to associate a client session and the identity token.
      * This value mitigates replay attacks and is present only if passed during the authorization request.
      */
    var nonce: String
    
    /**
      * A Boolean value that indicates whether the transaction is on a nonce-supported platform.
      * If you sent a nonce in the authorization request but don't see the nonce claim in the identity token,
      * check this claim to determine how to proceed.
      * If this claim returns true, you should treat nonce as mandatory and fail the transaction;
      * otherwise, you can proceed treating the nonce as options.
      */
    var nonce_supported: Boolean
    
    /**
      * An Integer value that indicates whether the user appears to be a real person.
      * Use the value of this claim to mitigate fraud. The possible values are: 0 (or Unsupported), 1 (or Unknown), 2 (or LikelyReal).
      * For more information, see [`ASUserDetectionStatus`](https://developer.apple.com/documentation/authenticationservices/asuserdetectionstatus).
      * This claim is present only on iOS 14 and later, macOS 11 and later, watchOS 7 and later, tvOS 14 and later;
      * the claim isn't present or supported for web-based apps.
      */
    var real_user_status: `0` | `1` | `2`
    
    /**
      * The subject registered claim identifies the principal that's the subject of the identity token.
      * Since this token is meant for your application, the value is the unique identifier for the user.
      */
    var sub: String
    
    /**
      * A String value representing the transfer identifier used to migrate users to your team.
      * This claim is present only during the 60-day transfer period after an you transfer an app.
      * For more information, see [Bringing New Apps and Users into Your Team](https://developer.apple.com/documentation/sign_in_with_apple/bringing_new_apps_and_users_into_your_team).
      */
    var transfer_sub: String
  }
  object AppleProfile {
    
    inline def apply(
      at_hash: String,
      aud: String,
      auth_time: Double,
      email: String,
      email_verified: `true` | typings.nextAuth.nextAuthBooleans.`true`,
      exp: Double,
      iat: Double,
      is_private_email: Boolean,
      nonce: String,
      nonce_supported: Boolean,
      real_user_status: `0` | `1` | `2`,
      sub: String,
      transfer_sub: String
    ): AppleProfile = {
      val __obj = js.Dynamic.literal(at_hash = at_hash.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], is_private_email = is_private_email.asInstanceOf[js.Any], iss = "https://appleid.apple.com", nonce = nonce.asInstanceOf[js.Any], nonce_supported = nonce_supported.asInstanceOf[js.Any], real_user_status = real_user_status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], transfer_sub = transfer_sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppleProfile]
    }
    
    extension [Self <: AppleProfile](x: Self) {
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: `true` | typings.nextAuth.nextAuthBooleans.`true`): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIs_private_email(value: Boolean): Self = StObject.set(x, "is_private_email", value.asInstanceOf[js.Any])
      
      inline def setIss(value: httpsColonSlashSlashappleidDotappleDotcom): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonce_supported(value: Boolean): Self = StObject.set(x, "nonce_supported", value.asInstanceOf[js.Any])
      
      inline def setReal_user_status(value: `0` | `1` | `2`): Self = StObject.set(x, "real_user_status", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTransfer_sub(value: String): Self = StObject.set(x, "transfer_sub", value.asInstanceOf[js.Any])
    }
  }
}
