package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.ellipse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasEllipse
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  var r1: Double = js.native
  
  var r2: js.UndefOr[Double] = js.native
  
  var `type`: ellipse = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object CanvasEllipse {
  
  @scala.inline
  def apply(r1: Double, `type`: ellipse, x: Double, y: Double): CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasEllipse]
  }
  
  @scala.inline
  implicit class CanvasEllipseMutableBuilder[Self <: CanvasEllipse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2Undefined: Self = StObject.set(x, "r2", js.undefined)
    
    @scala.inline
    def setType(value: ellipse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
