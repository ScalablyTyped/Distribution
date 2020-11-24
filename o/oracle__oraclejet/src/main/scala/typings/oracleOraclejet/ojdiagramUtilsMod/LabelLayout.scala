package typings.oracleOraclejet.ojdiagramUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelLayout extends js.Object {
  
  var angle: Double = js.native
  
  var halign: String = js.native
  
  var rotationPointX: Double = js.native
  
  var rotationPointY: Double = js.native
  
  var valign: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object LabelLayout {
  
  @scala.inline
  def apply(
    angle: Double,
    halign: String,
    rotationPointX: Double,
    rotationPointY: Double,
    valign: String,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], rotationPointX = rotationPointX.asInstanceOf[js.Any], rotationPointY = rotationPointY.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  
  @scala.inline
  implicit class LabelLayoutOps[Self <: LabelLayout] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalign(value: String): Self = this.set("halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationPointX(value: Double): Self = this.set("rotationPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationPointY(value: Double): Self = this.set("rotationPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValign(value: String): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
