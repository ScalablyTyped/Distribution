package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.ellipse
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
  implicit class CanvasEllipseOps[Self <: CanvasEllipse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ellipse): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR2: Self = this.set("r2", js.undefined)
  }
}
