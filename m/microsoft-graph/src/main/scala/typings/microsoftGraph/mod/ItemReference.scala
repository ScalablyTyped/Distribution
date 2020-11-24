package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemReference extends js.Object {
  
  // Unique identifier of the drive instance that contains the item. Read-only.
  var driveId: js.UndefOr[NullableOption[String]] = js.native
  
  // Identifies the type of drive. See [drive][] resource for values.
  var driveType: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique identifier of the item in the drive. Read-only.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[NullableOption[String]] = js.native
  
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[NullableOption[String]] = js.native
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  var siteId: js.UndefOr[NullableOption[String]] = js.native
}
object ItemReference {
  
  @scala.inline
  def apply(): ItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReference]
  }
  
  @scala.inline
  implicit class ItemReferenceOps[Self <: ItemReference] (val x: Self) extends AnyVal {
    
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
    def setDriveId(value: NullableOption[String]): Self = this.set("driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    
    @scala.inline
    def setDriveIdNull: Self = this.set("driveId", null)
    
    @scala.inline
    def setDriveType(value: NullableOption[String]): Self = this.set("driveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveType: Self = this.set("driveType", js.undefined)
    
    @scala.inline
    def setDriveTypeNull: Self = this.set("driveType", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPath(value: NullableOption[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setShareId(value: NullableOption[String]): Self = this.set("shareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareId: Self = this.set("shareId", js.undefined)
    
    @scala.inline
    def setShareIdNull: Self = this.set("shareId", null)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    
    @scala.inline
    def setSharepointIdsNull: Self = this.set("sharepointIds", null)
    
    @scala.inline
    def setSiteId(value: NullableOption[String]): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteIdNull: Self = this.set("siteId", null)
  }
}
