package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentity extends StObject {
  
  /**
    * Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType is not federated),
    * this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For external users from
    * other Azure AD organization, this will be the domain of the federated organization, for example contoso.com.Supports
    * $filter. 512 character limit.
    */
  var issuer: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must
    * be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or
    * userName (also known as local accounts).When signInType is set to: emailAddress, (or a custom string that starts with
    * emailAddress like emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must begin
    * with alphabetical character or number, and can only contain alphanumeric characters and the following symbols: - or
    * Supports $filter. 64 character limit.
    */
  var issuerAssignedId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the user sign-in types in your directory, such as emailAddress, userName, federated, or userPrincipalName.
    * federated represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer.
    * Setting or updating a userPrincipalName identity will update the value of the userPrincipalName property on the user
    * object. The validations performed on the userPrincipalName property on the user object, for example, verified domains
    * and acceptable characters, will be performed when setting or updating a userPrincipalName identity. Additional
    * validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can
    * also be set to any custom string.
    */
  var signInType: js.UndefOr[NullableOption[String]] = js.undefined
}
object ObjectIdentity {
  
  inline def apply(): ObjectIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdentity] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: NullableOption[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerAssignedId(value: NullableOption[String]): Self = StObject.set(x, "issuerAssignedId", value.asInstanceOf[js.Any])
    
    inline def setIssuerAssignedIdNull: Self = StObject.set(x, "issuerAssignedId", null)
    
    inline def setIssuerAssignedIdUndefined: Self = StObject.set(x, "issuerAssignedId", js.undefined)
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSignInType(value: NullableOption[String]): Self = StObject.set(x, "signInType", value.asInstanceOf[js.Any])
    
    inline def setSignInTypeNull: Self = StObject.set(x, "signInType", null)
    
    inline def setSignInTypeUndefined: Self = StObject.set(x, "signInType", js.undefined)
  }
}
