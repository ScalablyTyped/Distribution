package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsedInsight extends Entity {
  
  // Information about when the item was last viewed or modified by the user. Read only.
  var lastUsed: js.UndefOr[NullableOption[UsageDetails]] = js.native
  
  /**
    * Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked
    * attachments, the type is driveItem.
    */
  var resource: js.UndefOr[NullableOption[Entity]] = js.native
  
  // Reference properties of the used document, such as the url and type of the document. Read-only
  var resourceReference: js.UndefOr[NullableOption[ResourceReference]] = js.native
  
  // Properties that you can use to visualize the document in your experience. Read-only
  var resourceVisualization: js.UndefOr[NullableOption[ResourceVisualization]] = js.native
}
object UsedInsight {
  
  @scala.inline
  def apply(): UsedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedInsight]
  }
  
  @scala.inline
  implicit class UsedInsightOps[Self <: UsedInsight] (val x: Self) extends AnyVal {
    
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
    def setLastUsed(value: NullableOption[UsageDetails]): Self = this.set("lastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUsed: Self = this.set("lastUsed", js.undefined)
    
    @scala.inline
    def setLastUsedNull: Self = this.set("lastUsed", null)
    
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
  }
}
