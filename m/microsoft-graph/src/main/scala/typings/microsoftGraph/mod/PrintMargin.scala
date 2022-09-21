package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintMargin extends StObject {
  
  // The margin in microns from the bottom edge.
  var bottom: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The margin in microns from the left edge.
  var left: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The margin in microns from the right edge.
  var right: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The margin in microns from the top edge.
  var top: js.UndefOr[NullableOption[Double]] = js.undefined
}
object PrintMargin {
  
  inline def apply(): PrintMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintMargin]
  }
  
  extension [Self <: PrintMargin](x: Self) {
    
    inline def setBottom(value: NullableOption[Double]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomNull: Self = StObject.set(x, "bottom", null)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: NullableOption[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: NullableOption[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: NullableOption[Double]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
