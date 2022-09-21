package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.ellipse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasEllipse
  extends StObject
     with CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  /** Horizontal radius in `pt`. */
  var r1: Double
  
  /**
    * Vertical radius in `pt`.
    *
    * Defaults to the same value as {@link r1}.
    */
  var r2: js.UndefOr[Double] = js.undefined
  
  var `type`: ellipse
  
  /** Horizontal position from the left edge of the canvas element in `pt`. */
  var x: Double
  
  /** Vertical position from the top edge of the canvas element in `pt`. */
  var y: Double
}
object CanvasEllipse {
  
  inline def apply(r1: Double, x: Double, y: Double): CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ellipse")
    __obj.asInstanceOf[CanvasEllipse]
  }
  
  extension [Self <: CanvasEllipse](x: Self) {
    
    inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setR2Undefined: Self = StObject.set(x, "r2", js.undefined)
    
    inline def setType(value: ellipse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
