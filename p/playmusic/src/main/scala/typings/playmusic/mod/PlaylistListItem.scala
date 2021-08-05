package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistListItem extends StObject {
  
  var accessControlled: js.UndefOr[Boolean] = js.undefined
  
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var ownerName: js.UndefOr[String] = js.undefined
  
  var ownerProfilePhotoUrl: js.UndefOr[String] = js.undefined
  
  var recentTimestamp: js.UndefOr[String] = js.undefined
  
  var shareToken: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PlaylistListItem {
  
  inline def apply(): PlaylistListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListItem]
  }
  
  extension [Self <: PlaylistListItem](x: Self) {
    
    inline def setAccessControlled(value: Boolean): Self = StObject.set(x, "accessControlled", value.asInstanceOf[js.Any])
    
    inline def setAccessControlledUndefined: Self = StObject.set(x, "accessControlled", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTimestamp(value: String): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    inline def setOwnerProfilePhotoUrl(value: String): Self = StObject.set(x, "ownerProfilePhotoUrl", value.asInstanceOf[js.Any])
    
    inline def setOwnerProfilePhotoUrlUndefined: Self = StObject.set(x, "ownerProfilePhotoUrl", js.undefined)
    
    inline def setRecentTimestamp(value: String): Self = StObject.set(x, "recentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRecentTimestampUndefined: Self = StObject.set(x, "recentTimestamp", js.undefined)
    
    inline def setShareToken(value: String): Self = StObject.set(x, "shareToken", value.asInstanceOf[js.Any])
    
    inline def setShareTokenUndefined: Self = StObject.set(x, "shareToken", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
