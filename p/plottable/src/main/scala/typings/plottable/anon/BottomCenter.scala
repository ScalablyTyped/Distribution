package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomCenter extends js.Object {
  
  var bottom: typings.plottable.plottableStrings.bottom = js.native
  
  var center: typings.plottable.plottableStrings.center = js.native
  
  var top: typings.plottable.plottableStrings.top = js.native
}
object BottomCenter {
  
  @scala.inline
  def apply(bottom: bottom, center: center, top: top): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomCenter]
  }
  
  @scala.inline
  implicit class BottomCenterOps[Self <: BottomCenter] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: bottom): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: center): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
