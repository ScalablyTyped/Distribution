package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowMovementOptions extends js.Object {
  
  var moveIndependently: Boolean = js.native
}
object WindowMovementOptions {
  
  @scala.inline
  def apply(moveIndependently: Boolean): WindowMovementOptions = {
    val __obj = js.Dynamic.literal(moveIndependently = moveIndependently.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowMovementOptions]
  }
  
  @scala.inline
  implicit class WindowMovementOptionsOps[Self <: WindowMovementOptions] (val x: Self) extends AnyVal {
    
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
    def setMoveIndependently(value: Boolean): Self = this.set("moveIndependently", value.asInstanceOf[js.Any])
  }
}
