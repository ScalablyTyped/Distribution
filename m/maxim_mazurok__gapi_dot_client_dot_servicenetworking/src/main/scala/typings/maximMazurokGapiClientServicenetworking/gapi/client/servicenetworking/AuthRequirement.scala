package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthRequirement extends StObject {
  
  /**
    * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT
    * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When
    * this setting is absent, only JWTs with audience "https://Service_name/API_name" will be accepted. For example, if no audiences are in the setting, LibraryService API will only
    * accept JWTs with the following audience "https://library-example.googleapis.com/google.example.library.v1.LibraryService". Example: audiences:
    * bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.undefined
  
  /** id from authentication provider. Example: provider_id: bookstore_auth */
  var providerId: js.UndefOr[String] = js.undefined
}
object AuthRequirement {
  
  @scala.inline
  def apply(): AuthRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthRequirement]
  }
  
  @scala.inline
  implicit class AuthRequirementMutableBuilder[Self <: AuthRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudiences(value: String): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
