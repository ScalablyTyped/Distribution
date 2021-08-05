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
  
  // For user type permissions, the details of the users &amp; applications for this permission. Read-only.
  var grantedTo: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // For link type permissions, the details of the users to whom permission was granted. Read-only.
  var grantedToIdentities: js.UndefOr[NullableOption[js.Array[IdentitySet]]] = js.undefined
  
  /**
    * This indicates whether password is set for this permission, it's only showing in response. Optional and Read-only and
    * for OneDrive Personal only.
    */
  var hasPassword: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  // Details of any associated sharing invitation for this permission. Read-only.
  var invitation: js.UndefOr[NullableOption[SharingInvitation]] = js.undefined
  
  // Provides the link details of the current permission, if it is a link type permissions. Read-only.
  var link: js.UndefOr[NullableOption[SharingLink]] = js.undefined
  
  // The type of permission, e.g. read. See below for the full list of roles. Read-only.
  var roles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // A unique token that can be used to access this shared item via the **shares** API. Read-only.
  var shareId: js.UndefOr[NullableOption[String]] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setGrantedTo(value: NullableOption[IdentitySet]): Self = StObject.set(x, "grantedTo", value.asInstanceOf[js.Any])
    
    inline def setGrantedToIdentities(value: NullableOption[js.Array[IdentitySet]]): Self = StObject.set(x, "grantedToIdentities", value.asInstanceOf[js.Any])
    
    inline def setGrantedToIdentitiesNull: Self = StObject.set(x, "grantedToIdentities", null)
    
    inline def setGrantedToIdentitiesUndefined: Self = StObject.set(x, "grantedToIdentities", js.undefined)
    
    inline def setGrantedToIdentitiesVarargs(value: IdentitySet*): Self = StObject.set(x, "grantedToIdentities", js.Array(value :_*))
    
    inline def setGrantedToNull: Self = StObject.set(x, "grantedTo", null)
    
    inline def setGrantedToUndefined: Self = StObject.set(x, "grantedTo", js.undefined)
    
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
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    inline def setShareId(value: NullableOption[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdNull: Self = StObject.set(x, "shareId", null)
    
    inline def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
  }
}
