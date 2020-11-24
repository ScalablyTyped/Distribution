package typings.openfin.windowOptionMod

import typings.openfin.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeRegion extends js.Object {
  
  var bottomRightCorner: js.UndefOr[Double] = js.native
  
  var sides: js.UndefOr[Bottom] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object ResizeRegion {
  
  @scala.inline
  def apply(): ResizeRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeRegion]
  }
  
  @scala.inline
  implicit class ResizeRegionOps[Self <: ResizeRegion] (val x: Self) extends AnyVal {
    
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
    def setBottomRightCorner(value: Double): Self = this.set("bottomRightCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRightCorner: Self = this.set("bottomRightCorner", js.undefined)
    
    @scala.inline
    def setSides(value: Bottom): Self = this.set("sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
