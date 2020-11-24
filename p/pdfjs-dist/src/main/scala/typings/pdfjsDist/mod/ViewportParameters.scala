package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportParameters extends js.Object {
  
   // (optional) The vertical, i.e. y-axis, offset. The default value is `0`.
  var dontFlip: js.UndefOr[Boolean] = js.native
  
   // (optional) The desired rotation, in degrees, of the viewport. If omitted it defaults to the page rotation.
  var offsetX: js.UndefOr[Double] = js.native
  
   // (optional) The horizontal, i.e. x-axis, offset. The default value is `0`.
  var offsetY: js.UndefOr[Double] = js.native
  
   // The desired scale of the viewport.
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: Double = js.native
}
object ViewportParameters {
  
  @scala.inline
  def apply(scale: Double): ViewportParameters = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportParameters]
  }
  
  @scala.inline
  implicit class ViewportParametersOps[Self <: ViewportParameters] (val x: Self) extends AnyVal {
    
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontFlip(value: Boolean): Self = this.set("dontFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontFlip: Self = this.set("dontFlip", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
}
