package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFilledElement extends StObject {
  
  /**
    * Background color the element is filled with.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`,
    * as well as a reference to a pattern.
    *
    * To fill the element with a gradient, use {@link linearGradient} instead.
    */
  var color: js.UndefOr[String | PatternFill] = js.undefined
  
  /**
    * Opacity of the {@link color} or {@link linearGradient}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `1`.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Linear horizontal gradient the element is filled with.
    *
    * The given stops are distributed equally from left to right.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * To fill the element with a solid color, use {@link color} instead.
    */
  var linearGradient: js.UndefOr[js.Array[String]] = js.undefined
}
object CanvasFilledElement {
  
  inline def apply(): CanvasFilledElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasFilledElement]
  }
  
  extension [Self <: CanvasFilledElement](x: Self) {
    
    inline def setColor(value: String | PatternFill): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLinearGradient(value: js.Array[String]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientUndefined: Self = StObject.set(x, "linearGradient", js.undefined)
    
    inline def setLinearGradientVarargs(value: String*): Self = StObject.set(x, "linearGradient", js.Array(value*))
  }
}
