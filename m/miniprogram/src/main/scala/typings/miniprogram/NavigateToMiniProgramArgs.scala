package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToMiniProgramArgs extends AsyncCallback[Unit] {
  
  var appId: String = js.native
  
  /**
    * The extra data that needs to be passed to the target Mini Program,
    * and the target Mini Program can get it in `App.onLaunch()` or `App.onShow()`.
    */
  var extraData: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object NavigateToMiniProgramArgs {
  
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramArgs = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramArgs]
  }
  
  @scala.inline
  implicit class NavigateToMiniProgramArgsOps[Self <: NavigateToMiniProgramArgs] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
