package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthProvider extends js.Object {
  
  /**
    * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will
    * be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no
    * audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService -
    * https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.native
  
  /** Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec. */
  var authorizationUrl: js.UndefOr[String] = js.native
  
  /** The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: "bookstore_auth". */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example:
    * https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.native
  
  /**
    * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional
    * if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email
    * domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
    */
  var jwksUri: js.UndefOr[String] = js.native
  
  /**
    * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is:
    * checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token
    * query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query:
    * access_token
    */
  var jwtLocations: js.UndefOr[js.Array[JwtLocation]] = js.native
}
object AuthProvider {
  
  @scala.inline
  def apply(): AuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthProvider]
  }
  
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudiences(value: String): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiences: Self = this.set("audiences", js.undefined)
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationUrl: Self = this.set("authorizationUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJwksUri(value: String): Self = this.set("jwksUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwksUri: Self = this.set("jwksUri", js.undefined)
    
    @scala.inline
    def setJwtLocationsVarargs(value: JwtLocation*): Self = this.set("jwtLocations", js.Array(value :_*))
    
    @scala.inline
    def setJwtLocations(value: js.Array[JwtLocation]): Self = this.set("jwtLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtLocations: Self = this.set("jwtLocations", js.undefined)
  }
}
