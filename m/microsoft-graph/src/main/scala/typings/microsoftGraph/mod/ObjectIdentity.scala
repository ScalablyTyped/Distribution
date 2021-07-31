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
    * userName (also known as local accounts).When signInType is set to: emailAddress, (or starts with emailAddress like
    * emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must be a valid local part of
    * an email addressSupports $filter. 512 character limit.
    */
  var issuerAssignedId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the user sign-in types in your directory, such as emailAddress, userName or federated. Here, federated
    * represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Additional
    * validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can
    * also be set to any custom string.
    */
  var signInType: js.UndefOr[NullableOption[String]] = js.undefined
}
object ObjectIdentity {
  
  @scala.inline
  def apply(): ObjectIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentity]
  }
  
  @scala.inline
  implicit class ObjectIdentityMutableBuilder[Self <: ObjectIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssuer(value: NullableOption[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerAssignedId(value: NullableOption[String]): Self = StObject.set(x, "issuerAssignedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerAssignedIdNull: Self = StObject.set(x, "issuerAssignedId", null)
    
    @scala.inline
    def setIssuerAssignedIdUndefined: Self = StObject.set(x, "issuerAssignedId", js.undefined)
    
    @scala.inline
    def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setSignInType(value: NullableOption[String]): Self = StObject.set(x, "signInType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInTypeNull: Self = StObject.set(x, "signInType", null)
    
    @scala.inline
    def setSignInTypeUndefined: Self = StObject.set(x, "signInType", js.undefined)
  }
}
