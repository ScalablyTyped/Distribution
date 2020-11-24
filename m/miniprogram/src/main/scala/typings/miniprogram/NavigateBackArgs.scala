package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackArgs extends AsyncCallback[Unit] {
  
  /**
    * Number of pages to return. If delta is greater than the number
    * of open pages, it returns to the home page. Default value is 1
    */
  var delta: js.UndefOr[Double] = js.native
}
object NavigateBackArgs {
  
  @scala.inline
  def apply(): NavigateBackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackArgs]
  }
  
  @scala.inline
  implicit class NavigateBackArgsOps[Self <: NavigateBackArgs] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
  }
}
