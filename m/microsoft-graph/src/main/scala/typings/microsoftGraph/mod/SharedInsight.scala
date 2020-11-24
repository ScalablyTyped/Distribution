package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedInsight extends Entity {
  
  // Details about the shared item. Read only.
  var lastShared: js.UndefOr[NullableOption[SharingDetail]] = js.native
  
  var lastSharedMethod: js.UndefOr[NullableOption[Entity]] = js.native
  
  /**
    * Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked
    * attachments, the type is driveItem.
    */
  var resource: js.UndefOr[NullableOption[Entity]] = js.native
  
  // Reference properties of the shared document, such as the url and type of the document. Read-only
  var resourceReference: js.UndefOr[NullableOption[ResourceReference]] = js.native
  
  // Properties that you can use to visualize the document in your experience. Read-only
  var resourceVisualization: js.UndefOr[NullableOption[ResourceVisualization]] = js.native
  
  var sharingHistory: js.UndefOr[NullableOption[js.Array[SharingDetail]]] = js.native
}
object SharedInsight {
  
  @scala.inline
  def apply(): SharedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedInsight]
  }
  
  @scala.inline
  implicit class SharedInsightOps[Self <: SharedInsight] (val x: Self) extends AnyVal {
    
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
    def setLastShared(value: NullableOption[SharingDetail]): Self = this.set("lastShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastShared: Self = this.set("lastShared", js.undefined)
    
    @scala.inline
    def setLastSharedNull: Self = this.set("lastShared", null)
    
    @scala.inline
    def setLastSharedMethod(value: NullableOption[Entity]): Self = this.set("lastSharedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSharedMethod: Self = this.set("lastSharedMethod", js.undefined)
    
    @scala.inline
    def setLastSharedMethodNull: Self = this.set("lastSharedMethod", null)
    
    @scala.inline
    def setResource(value: NullableOption[Entity]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceNull: Self = this.set("resource", null)
    
    @scala.inline
    def setResourceReference(value: NullableOption[ResourceReference]): Self = this.set("resourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceReference: Self = this.set("resourceReference", js.undefined)
    
    @scala.inline
    def setResourceReferenceNull: Self = this.set("resourceReference", null)
    
    @scala.inline
    def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = this.set("resourceVisualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceVisualization: Self = this.set("resourceVisualization", js.undefined)
    
    @scala.inline
    def setResourceVisualizationNull: Self = this.set("resourceVisualization", null)
    
    @scala.inline
    def setSharingHistoryVarargs(value: SharingDetail*): Self = this.set("sharingHistory", js.Array(value :_*))
    
    @scala.inline
    def setSharingHistory(value: NullableOption[js.Array[SharingDetail]]): Self = this.set("sharingHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingHistory: Self = this.set("sharingHistory", js.undefined)
    
    @scala.inline
    def setSharingHistoryNull: Self = this.set("sharingHistory", null)
  }
}
