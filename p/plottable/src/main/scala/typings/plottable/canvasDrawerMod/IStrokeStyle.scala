package typings.plottable.canvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStrokeStyle extends js.Object {
  
  var opacity: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var `stroke-dasharray`: js.UndefOr[String] = js.native
  
  var `stroke-opacity`: js.UndefOr[Double] = js.native
  
  var `stroke-width`: js.UndefOr[Double] = js.native
}
object IStrokeStyle {
  
  @scala.inline
  def apply(): IStrokeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStrokeStyle]
  }
  
  @scala.inline
  implicit class IStrokeStyleOps[Self <: IStrokeStyle] (val x: Self) extends AnyVal {
    
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def `setStroke-dasharray`(value: String): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: Double): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
  }
}
