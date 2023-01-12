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
  
  inline def apply(): SharedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedInsight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedInsight] (val x: Self) extends AnyVal {
    
    inline def setLastShared(value: NullableOption[SharingDetail]): Self = StObject.set(x, "lastShared", value.asInstanceOf[js.Any])
    
    inline def setLastSharedMethod(value: NullableOption[Entity]): Self = StObject.set(x, "lastSharedMethod", value.asInstanceOf[js.Any])
    
    inline def setLastSharedMethodNull: Self = StObject.set(x, "lastSharedMethod", null)
    
    inline def setLastSharedMethodUndefined: Self = StObject.set(x, "lastSharedMethod", js.undefined)
    
    inline def setLastSharedNull: Self = StObject.set(x, "lastShared", null)
    
    inline def setLastSharedUndefined: Self = StObject.set(x, "lastShared", js.undefined)
    
    inline def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    inline def setResourceReferenceNull: Self = StObject.set(x, "resourceReference", null)
    
    inline def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = StObject.set(x, "resourceVisualization", value.asInstanceOf[js.Any])
    
    inline def setResourceVisualizationNull: Self = StObject.set(x, "resourceVisualization", null)
    
    inline def setResourceVisualizationUndefined: Self = StObject.set(x, "resourceVisualization", js.undefined)
    
    inline def setSharingHistory(value: NullableOption[js.Array[SharingDetail]]): Self = StObject.set(x, "sharingHistory", value.asInstanceOf[js.Any])
    
    inline def setSharingHistoryNull: Self = StObject.set(x, "sharingHistory", null)
    
    inline def setSharingHistoryUndefined: Self = StObject.set(x, "sharingHistory", js.undefined)
    
    inline def setSharingHistoryVarargs(value: SharingDetail*): Self = StObject.set(x, "sharingHistory", js.Array(value*))
  }
}
