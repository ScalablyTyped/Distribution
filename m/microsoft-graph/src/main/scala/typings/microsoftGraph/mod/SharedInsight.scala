package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedInsight extends Entity {
  // Details about the shared item. Read only.
  var lastShared: js.UndefOr[SharingDetail] = js.native
  var lastSharedMethod: js.UndefOr[Entity] = js.native
  /**
    * Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked
    * attachments, the type is driveItem.
    */
  var resource: js.UndefOr[Entity] = js.native
  // Reference properties of the shared document, such as the url and type of the document. Read-only
  var resourceReference: js.UndefOr[ResourceReference] = js.native
  // Properties that you can use to visualize the document in your experience. Read-only
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.native
  var sharingHistory: js.UndefOr[js.Array[SharingDetail]] = js.native
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
    def setLastShared(value: SharingDetail): Self = this.set("lastShared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastShared: Self = this.set("lastShared", js.undefined)
    @scala.inline
    def setLastSharedMethod(value: Entity): Self = this.set("lastSharedMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSharedMethod: Self = this.set("lastSharedMethod", js.undefined)
    @scala.inline
    def setResource(value: Entity): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResourceReference(value: ResourceReference): Self = this.set("resourceReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceReference: Self = this.set("resourceReference", js.undefined)
    @scala.inline
    def setResourceVisualization(value: ResourceVisualization): Self = this.set("resourceVisualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceVisualization: Self = this.set("resourceVisualization", js.undefined)
    @scala.inline
    def setSharingHistoryVarargs(value: SharingDetail*): Self = this.set("sharingHistory", js.Array(value :_*))
    @scala.inline
    def setSharingHistory(value: js.Array[SharingDetail]): Self = this.set("sharingHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharingHistory: Self = this.set("sharingHistory", js.undefined)
  }
  
}

