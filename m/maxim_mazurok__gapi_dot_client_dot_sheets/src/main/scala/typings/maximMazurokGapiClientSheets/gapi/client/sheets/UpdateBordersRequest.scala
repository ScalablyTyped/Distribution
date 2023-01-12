package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBordersRequest extends StObject {
  
  /** The border to put at the bottom of the range. */
  var bottom: js.UndefOr[Border] = js.undefined
  
  /** The horizontal border to put within the range. */
  var innerHorizontal: js.UndefOr[Border] = js.undefined
  
  /** The vertical border to put within the range. */
  var innerVertical: js.UndefOr[Border] = js.undefined
  
  /** The border to put at the left of the range. */
  var left: js.UndefOr[Border] = js.undefined
  
  /** The range whose borders should be updated. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The border to put at the right of the range. */
  var right: js.UndefOr[Border] = js.undefined
  
  /** The border to put at the top of the range. */
  var top: js.UndefOr[Border] = js.undefined
}
object UpdateBordersRequest {
  
  inline def apply(): UpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBordersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBordersRequest] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setInnerHorizontal(value: Border): Self = StObject.set(x, "innerHorizontal", value.asInstanceOf[js.Any])
    
    inline def setInnerHorizontalUndefined: Self = StObject.set(x, "innerHorizontal", js.undefined)
    
    inline def setInnerVertical(value: Border): Self = StObject.set(x, "innerVertical", value.asInstanceOf[js.Any])
    
    inline def setInnerVerticalUndefined: Self = StObject.set(x, "innerVertical", js.undefined)
    
    inline def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
