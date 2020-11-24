package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPullDown extends js.Object {
  
  var canPullDown: Boolean = js.native
}
object CanPullDown {
  
  @scala.inline
  def apply(canPullDown: Boolean): CanPullDown = {
    val __obj = js.Dynamic.literal(canPullDown = canPullDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPullDown]
  }
  
  @scala.inline
  implicit class CanPullDownOps[Self <: CanPullDown] (val x: Self) extends AnyVal {
    
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
    def setCanPullDown(value: Boolean): Self = this.set("canPullDown", value.asInstanceOf[js.Any])
  }
}
