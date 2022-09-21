package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.visuals.ISelectionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipShowOptions
  extends StObject
     with TooltipMoveOptions {
  
  @JSName("dataItems")
  var dataItems_TooltipShowOptions: js.Array[VisualTooltipDataItem]
}
object TooltipShowOptions {
  
  inline def apply(
    coordinates: js.Array[Double],
    dataItems: js.Array[VisualTooltipDataItem],
    identities: js.Array[ISelectionId],
    isTouchEvent: Boolean
  ): TooltipShowOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], dataItems = dataItems.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], isTouchEvent = isTouchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipShowOptions]
  }
  
  extension [Self <: TooltipShowOptions](x: Self) {
    
    inline def setDataItems(value: js.Array[VisualTooltipDataItem]): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsVarargs(value: VisualTooltipDataItem*): Self = StObject.set(x, "dataItems", js.Array(value*))
  }
}
