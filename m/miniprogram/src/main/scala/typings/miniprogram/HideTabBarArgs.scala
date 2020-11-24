package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideTabBarArgs extends AsyncCallback[Unit] {
  
  /**
    * Need animation effect or not, none by default.
    */
  var animation: js.UndefOr[Boolean] = js.native
}
object HideTabBarArgs {
  
  @scala.inline
  def apply(): HideTabBarArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTabBarArgs]
  }
  
  @scala.inline
  implicit class HideTabBarArgsOps[Self <: HideTabBarArgs] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
}
