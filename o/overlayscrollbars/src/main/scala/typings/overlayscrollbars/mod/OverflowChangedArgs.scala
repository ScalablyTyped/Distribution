package typings.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverflowChangedArgs extends js.Object {
  
  var clipped: Boolean = js.native
  
  var x: Boolean = js.native
  
  var xScrollable: Boolean = js.native
  
  var y: Boolean = js.native
  
  var yScrollable: Boolean = js.native
}
object OverflowChangedArgs {
  
  @scala.inline
  def apply(clipped: Boolean, x: Boolean, xScrollable: Boolean, y: Boolean, yScrollable: Boolean): OverflowChangedArgs = {
    val __obj = js.Dynamic.literal(clipped = clipped.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xScrollable = xScrollable.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yScrollable = yScrollable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowChangedArgs]
  }
  
  @scala.inline
  implicit class OverflowChangedArgsOps[Self <: OverflowChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Boolean): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXScrollable(value: Boolean): Self = this.set("xScrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Boolean): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYScrollable(value: Boolean): Self = this.set("yScrollable", value.asInstanceOf[js.Any])
  }
}
