package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasLine
  extends StObject
     with CanvasLineElement
     with CanvasElement {
  
  /**
    * Line end type.
    *
    * Defaults to `butt`.
    */
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  
  var `type`: line
  
  /** Horizontal line start position from the left in `pt`. */
  var x1: Double
  
  /** Horizontal line end position from the left in `pt`. */
  var x2: Double
  
  /** Vertical line start position from the top in `pt`. */
  var y1: Double
  
  /** Vertical line end position from the top in `pt`. */
  var y2: Double
}
object CanvasLine {
  
  inline def apply(x1: Double, x2: Double, y1: Double, y2: Double): CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[CanvasLine]
  }
  
  extension [Self <: CanvasLine](x: Self) {
    
    inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
