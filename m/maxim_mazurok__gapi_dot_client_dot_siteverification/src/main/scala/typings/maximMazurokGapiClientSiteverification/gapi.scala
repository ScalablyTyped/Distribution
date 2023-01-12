package typings.maximMazurokGapiClientSiteverification

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSiteverification.anon.Alt
import typings.maximMazurokGapiClientSiteverification.anon.Fields
import typings.maximMazurokGapiClientSiteverification.anon.Id
import typings.maximMazurokGapiClientSiteverification.anon.Identifier
import typings.maximMazurokGapiClientSiteverification.anon.Key
import typings.maximMazurokGapiClientSiteverification.anon.Oauthtoken
import typings.maximMazurokGapiClientSiteverification.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object siteverification {
      
      trait SiteVerificationWebResourceGettokenRequest extends StObject {
        
        /** The site for which a verification token will be generated. */
        var site: js.UndefOr[Identifier] = js.undefined
        
        /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
        var verificationMethod: js.UndefOr[String] = js.undefined
      }
      object SiteVerificationWebResourceGettokenRequest {
        
        inline def apply(): SiteVerificationWebResourceGettokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteVerificationWebResourceGettokenRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SiteVerificationWebResourceGettokenRequest] (val x: Self) extends AnyVal {
          
          inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
          
          inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
          
          inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
          
          inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
        }
      }
      
      trait SiteVerificationWebResourceGettokenResponse extends StObject {
        
        /**
          * The verification method to use in conjunction with this token. For FILE, the token should be placed in the top-level directory of the site, stored inside a file of the same name.
          * For META, the token should be placed in the HEAD tag of the default page that is loaded for the site. For DNS, the token should be placed in a TXT record of the domain.
          */
        var method: js.UndefOr[String] = js.undefined
        
        /** The verification token. The token must be placed appropriately in order for verification to succeed. */
        var token: js.UndefOr[String] = js.undefined
      }
      object SiteVerificationWebResourceGettokenResponse {
        
        inline def apply(): SiteVerificationWebResourceGettokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteVerificationWebResourceGettokenResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SiteVerificationWebResourceGettokenResponse] (val x: Self) extends AnyVal {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
          
          inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      trait SiteVerificationWebResourceListResponse extends StObject {
        
        /** The list of sites that are owned by the authenticated user. */
        var items: js.UndefOr[js.Array[SiteVerificationWebResourceResource]] = js.undefined
      }
      object SiteVerificationWebResourceListResponse {
        
        inline def apply(): SiteVerificationWebResourceListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteVerificationWebResourceListResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SiteVerificationWebResourceListResponse] (val x: Self) extends AnyVal {
          
          inline def setItems(value: js.Array[SiteVerificationWebResourceResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: SiteVerificationWebResourceResource*): Self = StObject.set(x, "items", js.Array(value*))
        }
      }
      
      trait SiteVerificationWebResourceResource extends StObject {
        
        /** The string used to identify this site. This value should be used in the "id" portion of the REST URL for the Get, Update, and Delete operations. */
        var id: js.UndefOr[String] = js.undefined
        
        /** The email addresses of all verified owners. */
        var owners: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The address and type of a site that is verified or will be verified. */
        var site: js.UndefOr[Identifier] = js.undefined
      }
      object SiteVerificationWebResourceResource {
        
        inline def apply(): SiteVerificationWebResourceResource = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteVerificationWebResourceResource]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SiteVerificationWebResourceResource] (val x: Self) extends AnyVal {
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
          
          inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
          
          inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value*))
          
          inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
          
          inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
        }
      }
      
      @js.native
      trait WebResourceResource extends StObject {
        
        /** Relinquish ownership of a website or domain. */
        def delete(): Request[Unit] = js.native
        def delete(request: Alt): Request[Unit] = js.native
        
        /** Get the most current data for a website or domain. */
        def get(): Request[SiteVerificationWebResourceResource] = js.native
        def get(request: Alt): Request[SiteVerificationWebResourceResource] = js.native
        
        /** Get a verification token for placing on a website or domain. */
        def getToken(request: Fields): Request[SiteVerificationWebResourceGettokenResponse] = js.native
        def getToken(request: Key, body: SiteVerificationWebResourceGettokenRequest): Request[SiteVerificationWebResourceGettokenResponse] = js.native
        
        /** Attempt verification of a website or domain. */
        def insert(request: Oauthtoken): Request[SiteVerificationWebResourceResource] = js.native
        def insert(request: PrettyPrint, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
        
        /** Get the list of your verified websites and domains. */
        def list(): Request[SiteVerificationWebResourceListResponse] = js.native
        def list(request: Key): Request[SiteVerificationWebResourceListResponse] = js.native
        
        def patch(request: Alt, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
        /** Modify the list of owners for your website or domain. This method supports patch semantics. */
        def patch(request: Id): Request[SiteVerificationWebResourceResource] = js.native
        
        def update(request: Alt, body: SiteVerificationWebResourceResource): Request[SiteVerificationWebResourceResource] = js.native
        /** Modify the list of owners for your website or domain. */
        def update(request: Id): Request[SiteVerificationWebResourceResource] = js.native
      }
    }
  }
}
