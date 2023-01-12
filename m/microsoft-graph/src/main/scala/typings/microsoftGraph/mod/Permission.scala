package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission
  extends StObject
     with Entity {
  
  /**
    * A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue
    * indicates there is no expiration set for this permission. Optional.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var grantedTo: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  var grantedToIdentities: js.UndefOr[NullableOption[js.Array[IdentitySet]]] = js.undefined
  
  // For link type permissions, the details of the users to whom permission was granted. Read-only.
  var grantedToIdentitiesV2: js.UndefOr[NullableOption[js.Array[SharePointIdentitySet]]] = js.undefined
  
  // For user type permissions, the details of the users and applications for this permission. Read-only.
  var grantedToV2: js.UndefOr[NullableOption[SharePointIdentitySet]] = js.undefined
  
  /**
    * Indicates whether the password is set for this permission. This property only appears in the response. Optional.
    * Read-only. For OneDrive Personal only..
    */
  var hasPassword: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  // Details of any associated sharing invitation for this permission. Read-only.
  var invitation: js.UndefOr[NullableOption[SharingInvitation]] = js.undefined
  
  // Provides the link details of the current permission, if it is a link type permissions. Read-only.
  var link: js.UndefOr[NullableOption[SharingLink]] = js.undefined
  
  // The type of permission, for example, read. See below for the full list of roles. Read-only.
  var roles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // A unique token that can be used to access this shared item via the **shares** API. Read-only.
  var shareId: js.UndefOr[NullableOption[String]] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setGrantedTo(value: NullableOption[IdentitySet]): Self = StObject.set(x, "grantedTo", value.asInstanceOf[js.Any])
    
    inline def setGrantedToIdentities(value: NullableOption[js.Array[IdentitySet]]): Self = StObject.set(x, "grantedToIdentities", value.asInstanceOf[js.Any])
    
    inline def setGrantedToIdentitiesNull: Self = StObject.set(x, "grantedToIdentities", null)
    
    inline def setGrantedToIdentitiesUndefined: Self = StObject.set(x, "grantedToIdentities", js.undefined)
    
    inline def setGrantedToIdentitiesV2(value: NullableOption[js.Array[SharePointIdentitySet]]): Self = StObject.set(x, "grantedToIdentitiesV2", value.asInstanceOf[js.Any])
    
    inline def setGrantedToIdentitiesV2Null: Self = StObject.set(x, "grantedToIdentitiesV2", null)
    
    inline def setGrantedToIdentitiesV2Undefined: Self = StObject.set(x, "grantedToIdentitiesV2", js.undefined)
    
    inline def setGrantedToIdentitiesV2Varargs(value: SharePointIdentitySet*): Self = StObject.set(x, "grantedToIdentitiesV2", js.Array(value*))
    
    inline def setGrantedToIdentitiesVarargs(value: IdentitySet*): Self = StObject.set(x, "grantedToIdentities", js.Array(value*))
    
    inline def setGrantedToNull: Self = StObject.set(x, "grantedTo", null)
    
    inline def setGrantedToUndefined: Self = StObject.set(x, "grantedTo", js.undefined)
    
    inline def setGrantedToV2(value: NullableOption[SharePointIdentitySet]): Self = StObject.set(x, "grantedToV2", value.asInstanceOf[js.Any])
    
    inline def setGrantedToV2Null: Self = StObject.set(x, "grantedToV2", null)
    
    inline def setGrantedToV2Undefined: Self = StObject.set(x, "grantedToV2", js.undefined)
    
    inline def setHasPassword(value: NullableOption[Boolean]): Self = StObject.set(x, "hasPassword", value.asInstanceOf[js.Any])
    
    inline def setHasPasswordNull: Self = StObject.set(x, "hasPassword", null)
    
    inline def setHasPasswordUndefined: Self = StObject.set(x, "hasPassword", js.undefined)
    
    inline def setInheritedFrom(value: NullableOption[ItemReference]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromNull: Self = StObject.set(x, "inheritedFrom", null)
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setInvitation(value: NullableOption[SharingInvitation]): Self = StObject.set(x, "invitation", value.asInstanceOf[js.Any])
    
    inline def setInvitationNull: Self = StObject.set(x, "invitation", null)
    
    inline def setInvitationUndefined: Self = StObject.set(x, "invitation", js.undefined)
    
    inline def setLink(value: NullableOption[SharingLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setShareId(value: NullableOption[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdNull: Self = StObject.set(x, "shareId", null)
    
    inline def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
  }
}
