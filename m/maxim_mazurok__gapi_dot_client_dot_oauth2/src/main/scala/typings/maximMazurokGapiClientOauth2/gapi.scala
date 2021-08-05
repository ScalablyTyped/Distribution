package typings.maximMazurokGapiClientOauth2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOauth2.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object oauth2 {
      
      @js.native
      trait MeResource extends StObject {
        
        def get(): Request[Userinfo] = js.native
        def get(request: Alt): Request[Userinfo] = js.native
      }
      
      trait Tokeninfo extends StObject {
        
        /** Who is the intended audience for this token. In general the same as issued_to. */
        var audience: js.UndefOr[String] = js.undefined
        
        /** The email address of the user. Present only if the email scope is present in the request. */
        var email: js.UndefOr[String] = js.undefined
        
        /** The expiry time of the token, as number of seconds left until expiry. */
        var expires_in: js.UndefOr[Double] = js.undefined
        
        /** To whom was the token issued to. In general the same as audience. */
        var issued_to: js.UndefOr[String] = js.undefined
        
        /** The space separated list of scopes granted to this token. */
        var scope: js.UndefOr[String] = js.undefined
        
        /** The obfuscated user id. */
        var user_id: js.UndefOr[String] = js.undefined
        
        /** Boolean flag which is true if the email address is verified. Present only if the email scope is present in the request. */
        var verified_email: js.UndefOr[Boolean] = js.undefined
      }
      object Tokeninfo {
        
        inline def apply(): Tokeninfo = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Tokeninfo]
        }
        
        extension [Self <: Tokeninfo](x: Self) {
          
          inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
          
          inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
          
          inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
          
          inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
          
          inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
          
          inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
          
          inline def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
          
          inline def setIssued_toUndefined: Self = StObject.set(x, "issued_to", js.undefined)
          
          inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
          
          inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
          
          inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
          
          inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
        }
      }
      
      trait Userinfo extends StObject {
        
        /** The user's email address. */
        var email: js.UndefOr[String] = js.undefined
        
        /** The user's last name. */
        var family_name: js.UndefOr[String] = js.undefined
        
        /** The user's gender. */
        var gender: js.UndefOr[String] = js.undefined
        
        /** The user's first name. */
        var given_name: js.UndefOr[String] = js.undefined
        
        /** The hosted domain e.g. example.com if the user is Google apps user. */
        var hd: js.UndefOr[String] = js.undefined
        
        /** The obfuscated ID of the user. */
        var id: js.UndefOr[String] = js.undefined
        
        /** URL of the profile page. */
        var link: js.UndefOr[String] = js.undefined
        
        /** The user's preferred locale. */
        var locale: js.UndefOr[String] = js.undefined
        
        /** The user's full name. */
        var name: js.UndefOr[String] = js.undefined
        
        /** URL of the user's picture image. */
        var picture: js.UndefOr[String] = js.undefined
        
        /** Boolean flag which is true if the email address is verified. Always verified because we only return the user's primary email address. */
        var verified_email: js.UndefOr[Boolean] = js.undefined
      }
      object Userinfo {
        
        inline def apply(): Userinfo = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Userinfo]
        }
        
        extension [Self <: Userinfo](x: Self) {
          
          inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
          
          inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
          
          inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
          
          inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
          
          inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
          
          inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
          
          inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
          
          inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
          
          inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
          
          inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
          
          inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
          
          inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
          
          inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
          
          inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
          
          inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
          
          inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
        }
      }
      
      @js.native
      trait UserinfoResource extends StObject {
        
        def get(): Request[Userinfo] = js.native
        def get(request: Alt): Request[Userinfo] = js.native
        
        var v2: V2Resource = js.native
      }
      
      trait V2Resource extends StObject {
        
        var me: MeResource
      }
      object V2Resource {
        
        inline def apply(me: MeResource): V2Resource = {
          val __obj = js.Dynamic.literal(me = me.asInstanceOf[js.Any])
          __obj.asInstanceOf[V2Resource]
        }
        
        extension [Self <: V2Resource](x: Self) {
          
          inline def setMe(value: MeResource): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
