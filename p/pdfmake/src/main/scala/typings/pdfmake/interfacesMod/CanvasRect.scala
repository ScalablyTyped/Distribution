package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRect
  extends StObject
     with CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  var h: Double
  
  var r: js.UndefOr[Double] = js.undefined
  
  var `type`: rect
  
  var w: Double
  
  var x: Double
  
  var y: Double
}
object CanvasRect {
  
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): CanvasRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[CanvasRect]
  }
  
  @scala.inline
  implicit class CanvasRectMutableBuilder[Self <: CanvasRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
