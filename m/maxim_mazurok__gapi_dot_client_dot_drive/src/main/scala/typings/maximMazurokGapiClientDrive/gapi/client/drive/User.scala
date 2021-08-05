package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** A plain text displayable name for this user. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The email address of the user. This may not be present in certain contexts if the user has not made their email address visible to the requester. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#user". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether this user is the requesting user. */
  var me: js.UndefOr[Boolean] = js.undefined
  
  /** The user's ID as visible in Permission resources. */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMe(value: Boolean): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    inline def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    inline def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
  }
}
