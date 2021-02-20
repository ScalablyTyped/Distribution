package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.line
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasLine
  extends CanvasLineElement
     with CanvasElement {
  
  var lineCap: js.UndefOr[round | square] = js.native
  
  var `type`: line = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
object CanvasLine {
  
  @scala.inline
  def apply(`type`: line, x1: Double, x2: Double, y1: Double, y2: Double): CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasLine]
  }
  
  @scala.inline
  implicit class CanvasLineMutableBuilder[Self <: CanvasLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCap(value: round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
