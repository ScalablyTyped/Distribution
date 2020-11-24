package typings.miniprogram

import typings.miniprogram.anon.Shown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowAuthGuideArgs extends AsyncCallback[Shown] {
  
  /**
    * Identifier of the permission under guide, used to identify
    * the type of the permission (such as LBS).
    */
  var authType: String = js.native
}
object ShowAuthGuideArgs {
  
  @scala.inline
  def apply(authType: String): ShowAuthGuideArgs = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAuthGuideArgs]
  }
  
  @scala.inline
  implicit class ShowAuthGuideArgsOps[Self <: ShowAuthGuideArgs] (val x: Self) extends AnyVal {
    
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
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
  }
}
