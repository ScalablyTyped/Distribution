package typings.plottable.canvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFillStyle extends js.Object {
  
  var fill: js.UndefOr[String] = js.native
  
  var `fill-opacity`: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object IFillStyle {
  
  @scala.inline
  def apply(): IFillStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFillStyle]
  }
  
  @scala.inline
  implicit class IFillStyleOps[Self <: IFillStyle] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: Double): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
