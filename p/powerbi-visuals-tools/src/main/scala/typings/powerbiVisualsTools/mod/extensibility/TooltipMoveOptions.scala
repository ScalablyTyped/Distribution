package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.visuals.ISelectionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipMoveOptions extends StObject {
  
  var coordinates: js.Array[Double]
  
  var dataItems: js.UndefOr[js.Array[VisualTooltipDataItem]] = js.undefined
  
  var identities: js.Array[ISelectionId]
  
  var isTouchEvent: Boolean
}
object TooltipMoveOptions {
  
  inline def apply(coordinates: js.Array[Double], identities: js.Array[ISelectionId], isTouchEvent: Boolean): TooltipMoveOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], isTouchEvent = isTouchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMoveOptions]
  }
  
  extension [Self <: TooltipMoveOptions](x: Self) {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setDataItems(value: js.Array[VisualTooltipDataItem]): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setDataItemsVarargs(value: VisualTooltipDataItem*): Self = StObject.set(x, "dataItems", js.Array(value*))
    
    inline def setIdentities(value: js.Array[ISelectionId]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: ISelectionId*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setIsTouchEvent(value: Boolean): Self = StObject.set(x, "isTouchEvent", value.asInstanceOf[js.Any])
  }
}
