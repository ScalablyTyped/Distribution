package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  /**
    * A list of access level resource names that allow resources to be accessed by authenticated requester. It is part of Secure GCP processing for the incoming request. An access level
    * string has the format: "//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}" Example:
    * "//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL"
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The intended audience(s) for this authentication information. Reflects the audience (`aud`) claim within a JWT. The audience value(s) depends on the `issuer`, but typically include
    * one or more of the following pieces of information: * The services intended to receive the credential. For example, ["https://pubsub.googleapis.com/",
    * "https://storage.googleapis.com/"]. * A set of service-based scopes. For example, ["https://www.googleapis.com/auth/cloud-platform"]. * The client id of an app, such as the Firebase
    * project id for JWTs from Firebase Auth. Consult the documentation for the credential issuer to determine the information provided.
    */
  var audiences: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Structured claims presented with the credential. JWTs include `{key: value}` pairs for standard and private claims. The following is a subset of the standard required and optional
    * claims that would typically be presented for a Google-based JWT: {'iss': 'accounts.google.com', 'sub': '113289723416554971153', 'aud': ['123456789012', 'pubsub.googleapis.com'],
    * 'azp': '123456789012.apps.googleusercontent.com', 'email': 'jsmith@example.com', 'iat': 1353601026, 'exp': 1353604926} SAML assertions are similarly specified, but with an identity
    * provider dependent structure.
    */
  var claims: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.Auth & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The authorized presenter of the credential. Reflects the optional Authorized Presenter (`azp`) claim within a JWT or the OAuth client id. For example, a Google Cloud Platform client
    * id looks as follows: "123456789012.apps.googleusercontent.com".
    */
  var presenter: js.UndefOr[String] = js.undefined
  
  /**
    * The authenticated principal. Reflects the issuer (`iss`) and subject (`sub`) claims within a JWT. The issuer and subject should be `/` delimited, with `/` percent-encoded within the
    * subject fragment. For Google accounts, the principal format is: "https://accounts.google.com/{id}"
    */
  var principal: js.UndefOr[String] = js.undefined
}
object Auth {
  
  inline def apply(): Auth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth]
  }
  
  extension [Self <: Auth](x: Self) {
    
    inline def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value :_*))
    
    inline def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
    
    inline def setClaims(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.Auth & TopLevel[js.Any]
    ): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setPresenter(value: String): Self = StObject.set(x, "presenter", value.asInstanceOf[js.Any])
    
    inline def setPresenterUndefined: Self = StObject.set(x, "presenter", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
  }
}
