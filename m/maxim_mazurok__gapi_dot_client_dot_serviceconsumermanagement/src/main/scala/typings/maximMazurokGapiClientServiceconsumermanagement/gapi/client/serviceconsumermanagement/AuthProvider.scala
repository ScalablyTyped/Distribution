package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthProvider extends StObject {
  
  /**
    * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will
    * be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no
    * audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService -
    * https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.undefined
  
  /** Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec. */
  var authorizationUrl: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: "bookstore_auth". */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example:
    * https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional
    * if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email
    * domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
    */
  var jwksUri: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is:
    * checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token
    * query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query:
    * access_token
    */
  var jwtLocations: js.UndefOr[js.Array[JwtLocation]] = js.undefined
}
object AuthProvider {
  
  inline def apply(): AuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthProvider]
  }
  
  extension [Self <: AuthProvider](x: Self) {
    
    inline def setAudiences(value: String): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwksUri(value: String): Self = StObject.set(x, "jwksUri", value.asInstanceOf[js.Any])
    
    inline def setJwksUriUndefined: Self = StObject.set(x, "jwksUri", js.undefined)
    
    inline def setJwtLocations(value: js.Array[JwtLocation]): Self = StObject.set(x, "jwtLocations", value.asInstanceOf[js.Any])
    
    inline def setJwtLocationsUndefined: Self = StObject.set(x, "jwtLocations", js.undefined)
    
    inline def setJwtLocationsVarargs(value: JwtLocation*): Self = StObject.set(x, "jwtLocations", js.Array(value :_*))
  }
}
