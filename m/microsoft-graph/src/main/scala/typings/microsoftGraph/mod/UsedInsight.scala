package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class UsedInsightMutableBuilder[Self <: UsedInsight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUsed(value: NullableOption[UsageDetails]): Self = StObject.set(x, "lastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedNull: Self = StObject.set(x, "lastUsed", null)
    
    @scala.inline
    def setLastUsedUndefined: Self = StObject.set(x, "lastUsed", js.undefined)
    
    @scala.inline
    def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceReferenceNull: Self = StObject.set(x, "resourceReference", null)
    
    @scala.inline
    def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = StObject.set(x, "resourceVisualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVisualizationNull: Self = StObject.set(x, "resourceVisualization", null)
    
    @scala.inline
    def setResourceVisualizationUndefined: Self = StObject.set(x, "resourceVisualization", js.undefined)
  }
}
