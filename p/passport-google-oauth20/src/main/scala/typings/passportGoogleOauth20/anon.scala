package typings.passportGoogleOauth20

import typings.passportGoogleOauth20.passportGoogleOauth20Strings.`false`
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Athash extends StObject {
    
    /**
      * Access token hash. Provides validation that the access token is tied to the
      * identity token. If the ID token is issued with an access_token value in the
      * server flow, this claim is always included. This claim can be used as an
      * alternate mechanism to protect against cross-site request forgery attacks,
      * but if you follow Step 1 and Step 3 it is not necessary to verify the access
      * token.
      *
      * Ex: `"HK6E_P6Dh8Y93mRNtsDB1Q"`
      */
    var at_hash: js.UndefOr[String] = js.undefined
    
    /**
      * The audience that this ID token is intended for. It must be one of
      * the OAuth 2.0 client IDs of your application.
      *
      * Ex: `"1234987819200.apps.googleusercontent.com"`
      */
    var aud: String
    
    /**
      * The client_id of the authorized presenter. This claim is only needed when the
      * party requesting the ID token is not the same as the audience of the ID
      * token. This may be the case at Google for hybrid apps where a web application
      * and Android app have a different OAuth 2.0 client_id but share the same
      * Google APIs project.
      *
      * Ex: `"1234987819200.apps.googleusercontent.com"`
      */
    var azp: js.UndefOr[String] = js.undefined
    
    /**
      * The user's email address. This value may not be unique to this user and is
      * not suitable for use as a primary key. Provided only if your scope included
      * the email scope value.
      *
      * Ex: `"jsmith@example.com"`
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * True if the user's e-mail address has been verified; otherwise false.
      *
      * _Note:_ This comes as the string "true" or "false", not as a boolean!
      *
      * Ex: `"true"`
      */
    var email_verified: js.UndefOr[`true` | `false`] = js.undefined
    
    /**
      * Expiration time on or after which the ID token must not be accepted.
      * Represented in Unix time (integer seconds).
      *
      * Ex: `1353604926`
      */
    var exp: Double
    
    /**
      * The user's surname(s) or last name(s). Might be provided when a name claim is
      * present.
      */
    var family_name: js.UndefOr[String] = js.undefined
    
    /**
      * The user's given name(s) or first name(s). Might be provided when a name
      * claim is present.
      */
    var given_name: js.UndefOr[String] = js.undefined
    
    /**
      * The hosted G Suite domain of the user. Provided only if the user belongs to a
      * hosted domain.
      *
      * Ex: `"example.com"`
      */
    var hd: js.UndefOr[String] = js.undefined
    
    /**
      * The time the ID token was issued. Represented in Unix time (integer
      * seconds).
      *
      * Ex: `1353601026`
      */
    var iat: Double
    
    /**
      * The Issuer Identifier for the Issuer of the response. Always
      * https://accounts.google.com or accounts.google.com for Google ID
      * tokens.
      *
      * Ex: `"https://accounts.google.com"`
      */
    var iss: String
    
    /**
      * The user's locale, represented by a [BCP 47](https://www.rfc-editor.org/info/bcp47) language tag. Might be provided
      * when a name claim is present.
      *
      * Ex: `"en"`
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * The user's full name, in a displayable form. Might be provided when:
      *
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      *
      * When name claims are present, you can use them to update your app's user records. Note that this claim is never guaranteed to be present.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the nonce supplied by your app in the authentication
      * request. You should enforce protection against replay attacks by ensuring
      * it is presented only once.
      *
      * Ex: `"0394852-3190485-2490358"`
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the user's profile picture. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh When picture claims
      *   are present, you can use them to update your app's user records.
      *   Note that this claim is never guaranteed to be present.
      *
      * Ex: `"https://lh4.googleusercontent.com/-aBcDeFG/ABCDEFGHI/JSKLMNO/pQRstuv/s99-c/photo.jpg"`
      */
    var picture: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the user's profile page. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh When profile claims
      *   are present, you can use them to update your app's user records.
      *   Note that this claim is never guaranteed to be present.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier for the user, unique among all Google accounts and
      * never reused. A Google account can have multiple email addresses at
      * different points in time, but the sub value is never changed. Use sub
      * within your application as the unique-identifier key for the user.
      * Maximum length of 255 case-sensitive ASCII characters.
      *
      * Ex: `"10769150350006150715113082367"`
      */
    var sub: String
  }
  object Athash {
    
    inline def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): Athash = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Athash]
    }
    
    extension [Self <: Athash](x: Self) {
      
      inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      inline def setAt_hashUndefined: Self = StObject.set(x, "at_hash", js.undefined)
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      inline def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmail_verified(value: `true` | `false`): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
      
      inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
    
    var verified: `true` | `false`
  }
  object Value {
    
    inline def apply(value: String, verified: `true` | `false`): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: `true` | `false`): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
