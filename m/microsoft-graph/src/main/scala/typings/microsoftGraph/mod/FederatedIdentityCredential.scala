package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedIdentityCredential
  extends StObject
     with Entity {
  
  /**
    * The audience that can appear in the external token. This field is mandatory and should be set to
    * api://AzureADTokenExchange for Azure AD. It says what Microsoft identity platform should accept in the aud claim in the
    * incoming token. This value represents Azure AD in your external identity provider and has no fixed value across
    * identity providers - you may need to create a new application registration in your identity provider to serve as the
    * audience of this token. This field can only accept a single value and has a limit of 600 characters. Required.
    */
  var audiences: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The un-validated, user-provided description of the federated identity credential. It has a limit of 600 characters.
    * Optional.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The URL of the external identity provider and must match the issuer claim of the external token being exchanged. The
    * combination of the values of issuer and subject must be unique on the app. It has a limit of 600 characters. Required.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * is the unique identifier for the federated identity credential, which has a limit of 120 characters and must be URL
    * friendly. It is immutable once created. Required. Not nullable. Supports $filter (eq).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The identifier of the external software workload within the external identity provider. Like the audience
    * value, it has no fixed format, as each identity provider uses their own - sometimes a GUID, sometimes a colon delimited
    * identifier, sometimes arbitrary strings. The value here must match the sub claim within the token presented to Azure
    * AD. The combination of issuer and subject must be unique on the app. It has a limit of 600 characters. Supports $filter
    * (eq).
    */
  var subject: js.UndefOr[String] = js.undefined
}
object FederatedIdentityCredential {
  
  inline def apply(): FederatedIdentityCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedIdentityCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedIdentityCredential] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
