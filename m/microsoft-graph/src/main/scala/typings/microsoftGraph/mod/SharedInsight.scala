package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedInsight
  extends StObject
     with Entity {
  
  // Details about the shared item. Read only.
  var lastShared: js.UndefOr[NullableOption[SharingDetail]] = js.undefined
  
  var lastSharedMethod: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  /**
    * Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked
    * attachments, the type is driveItem.
    */
  var resource: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  // Reference properties of the shared document, such as the url and type of the document. Read-only
  var resourceReference: js.UndefOr[NullableOption[ResourceReference]] = js.undefined
  
  // Properties that you can use to visualize the document in your experience. Read-only
  var resourceVisualization: js.UndefOr[NullableOption[ResourceVisualization]] = js.undefined
  
  var sharingHistory: js.UndefOr[NullableOption[js.Array[SharingDetail]]] = js.undefined
}
object SharedInsight {
  
  @scala.inline
  def apply(): SharedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedInsight]
  }
  
  @scala.inline
  implicit class SharedInsightMutableBuilder[Self <: SharedInsight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastShared(value: NullableOption[SharingDetail]): Self = StObject.set(x, "lastShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSharedMethod(value: NullableOption[Entity]): Self = StObject.set(x, "lastSharedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSharedMethodNull: Self = StObject.set(x, "lastSharedMethod", null)
    
    @scala.inline
    def setLastSharedMethodUndefined: Self = StObject.set(x, "lastSharedMethod", js.undefined)
    
    @scala.inline
    def setLastSharedNull: Self = StObject.set(x, "lastShared", null)
    
    @scala.inline
    def setLastSharedUndefined: Self = StObject.set(x, "lastShared", js.undefined)
    
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
    
    @scala.inline
    def setSharingHistory(value: NullableOption[js.Array[SharingDetail]]): Self = StObject.set(x, "sharingHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingHistoryNull: Self = StObject.set(x, "sharingHistory", null)
    
    @scala.inline
    def setSharingHistoryUndefined: Self = StObject.set(x, "sharingHistory", js.undefined)
    
    @scala.inline
    def setSharingHistoryVarargs(value: SharingDetail*): Self = StObject.set(x, "sharingHistory", js.Array(value :_*))
  }
}
