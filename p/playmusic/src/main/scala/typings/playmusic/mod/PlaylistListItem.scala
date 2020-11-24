package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistListItem extends js.Object {
  
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
  implicit class PlaylistListItemOps[Self <: PlaylistListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessControlled(value: Boolean): Self = this.set("accessControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlled: Self = this.set("accessControlled", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: String): Self = this.set("lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("lastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerName: Self = this.set("ownerName", js.undefined)
    
    @scala.inline
    def setOwnerProfilePhotoUrl(value: String): Self = this.set("ownerProfilePhotoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerProfilePhotoUrl: Self = this.set("ownerProfilePhotoUrl", js.undefined)
    
    @scala.inline
    def setRecentTimestamp(value: String): Self = this.set("recentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentTimestamp: Self = this.set("recentTimestamp", js.undefined)
    
    @scala.inline
    def setShareToken(value: String): Self = this.set("shareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareToken: Self = this.set("shareToken", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
