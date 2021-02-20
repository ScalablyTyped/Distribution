package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistListItem extends StObject {
  
  var accessControlled: js.UndefOr[Boolean] = js.native
  
  var creationTimestamp: js.UndefOr[String] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var ownerName: js.UndefOr[String] = js.native
  
  var ownerProfilePhotoUrl: js.UndefOr[String] = js.native
  
  var recentTimestamp: js.UndefOr[String] = js.native
  
  var shareToken: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PlaylistListItem {
  
  @scala.inline
  def apply(): PlaylistListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListItem]
  }
  
  @scala.inline
  implicit class PlaylistListItemMutableBuilder[Self <: PlaylistListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlled(value: Boolean): Self = StObject.set(x, "accessControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlledUndefined: Self = StObject.set(x, "accessControlled", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: String): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    @scala.inline
    def setOwnerProfilePhotoUrl(value: String): Self = StObject.set(x, "ownerProfilePhotoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerProfilePhotoUrlUndefined: Self = StObject.set(x, "ownerProfilePhotoUrl", js.undefined)
    
    @scala.inline
    def setRecentTimestamp(value: String): Self = StObject.set(x, "recentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentTimestampUndefined: Self = StObject.set(x, "recentTimestamp", js.undefined)
    
    @scala.inline
    def setShareToken(value: String): Self = StObject.set(x, "shareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTokenUndefined: Self = StObject.set(x, "shareToken", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
