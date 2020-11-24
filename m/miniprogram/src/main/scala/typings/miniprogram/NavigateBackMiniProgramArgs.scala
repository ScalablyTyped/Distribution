package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackMiniProgramArgs extends AsyncCallback[Unit] {
  
  /**
    * The extra data that needs to be returned to the target Mini Program,
    *  and the target Mini Program can get it in `App.onLaunch()` or `App.onShow()`.
    */
  var extraData: js.Any = js.native
}
object NavigateBackMiniProgramArgs {
  
  @scala.inline
  def apply(extraData: js.Any): NavigateBackMiniProgramArgs = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackMiniProgramArgs]
  }
  
  @scala.inline
  implicit class NavigateBackMiniProgramArgsOps[Self <: NavigateBackMiniProgramArgs] (val x: Self) extends AnyVal {
    
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
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
  }
}
