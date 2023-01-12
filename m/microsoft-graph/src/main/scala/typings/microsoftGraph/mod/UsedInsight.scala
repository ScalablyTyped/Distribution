package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsedInsight
  extends StObject
     with Entity {
  
  // Information about when the item was last viewed or modified by the user. Read only.
  var lastUsed: js.UndefOr[NullableOption[UsageDetails]] = js.undefined
  
  /**
    * Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked
    * attachments, the type is driveItem.
    */
  var resource: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  // Reference properties of the used document, such as the url and type of the document. Read-only
  var resourceReference: js.UndefOr[NullableOption[ResourceReference]] = js.undefined
  
  // Properties that you can use to visualize the document in your experience. Read-only
  var resourceVisualization: js.UndefOr[NullableOption[ResourceVisualization]] = js.undefined
}
object UsedInsight {
  
  inline def apply(): UsedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedInsight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsedInsight] (val x: Self) extends AnyVal {
    
    inline def setLastUsed(value: NullableOption[UsageDetails]): Self = StObject.set(x, "lastUsed", value.asInstanceOf[js.Any])
    
    inline def setLastUsedNull: Self = StObject.set(x, "lastUsed", null)
    
    inline def setLastUsedUndefined: Self = StObject.set(x, "lastUsed", js.undefined)
    
    inline def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    inline def setResourceReferenceNull: Self = StObject.set(x, "resourceReference", null)
    
    inline def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = StObject.set(x, "resourceVisualization", value.asInstanceOf[js.Any])
    
    inline def setResourceVisualizationNull: Self = StObject.set(x, "resourceVisualization", null)
    
    inline def setResourceVisualizationUndefined: Self = StObject.set(x, "resourceVisualization", js.undefined)
  }
}
