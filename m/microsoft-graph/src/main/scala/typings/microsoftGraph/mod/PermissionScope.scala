package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionScope extends StObject {
  
  /**
    * A description of the delegated permissions, intended to be read by an administrator granting the permission on behalf
    * of all users. This text appears in tenant-wide admin consent experiences.
    */
  var adminConsentDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The permission's title, intended to be read by an administrator granting the permission on behalf of all users.
  var adminConsentDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Unique delegated permission identifier inside the collection of delegated permissions defined for a resource
    * application.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * When creating or updating a permission, this property must be set to true (which is the default). To delete a
    * permission, this property must first be set to false. At that point, in a subsequent call, the permission may be
    * removed.
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  var origin: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies whether this delegated permission should be considered safe for non-admin users to consent to on behalf of
    * themselves, or whether an administrator should be required for consent to the permissions. This will be the default
    * behavior, but each customer can choose to customize the behavior in their organization (by allowing, restricting or
    * limiting user consent to this delegated permission.)
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A description of the delegated permissions, intended to be read by a user granting the permission on their own behalf.
    * This text appears in consent experiences where the user is consenting only on behalf of themselves.
    */
  var userConsentDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A title for the permission, intended to be read by a user granting the permission on their own behalf. This text
    * appears in consent experiences where the user is consenting only on behalf of themselves.
    */
  var userConsentDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the value to include in the scp (scope) claim in access tokens. Must not exceed 120 characters in length.
    * Allowed characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges
    * 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
    */
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object PermissionScope {
  
  inline def apply(): PermissionScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionScope]
  }
  
  extension [Self <: PermissionScope](x: Self) {
    
    inline def setAdminConsentDescription(value: NullableOption[String]): Self = StObject.set(x, "adminConsentDescription", value.asInstanceOf[js.Any])
    
    inline def setAdminConsentDescriptionNull: Self = StObject.set(x, "adminConsentDescription", null)
    
    inline def setAdminConsentDescriptionUndefined: Self = StObject.set(x, "adminConsentDescription", js.undefined)
    
    inline def setAdminConsentDisplayName(value: NullableOption[String]): Self = StObject.set(x, "adminConsentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAdminConsentDisplayNameNull: Self = StObject.set(x, "adminConsentDisplayName", null)
    
    inline def setAdminConsentDisplayNameUndefined: Self = StObject.set(x, "adminConsentDisplayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setOrigin(value: NullableOption[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginNull: Self = StObject.set(x, "origin", null)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserConsentDescription(value: NullableOption[String]): Self = StObject.set(x, "userConsentDescription", value.asInstanceOf[js.Any])
    
    inline def setUserConsentDescriptionNull: Self = StObject.set(x, "userConsentDescription", null)
    
    inline def setUserConsentDescriptionUndefined: Self = StObject.set(x, "userConsentDescription", js.undefined)
    
    inline def setUserConsentDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userConsentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserConsentDisplayNameNull: Self = StObject.set(x, "userConsentDisplayName", null)
    
    inline def setUserConsentDisplayNameUndefined: Self = StObject.set(x, "userConsentDisplayName", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
