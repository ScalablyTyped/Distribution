package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortCutConfig extends js.Object {
  
  var desktop: js.UndefOr[Boolean] = js.native
  
  var startMenu: js.UndefOr[Boolean] = js.native
  
  var systemStartup: js.UndefOr[Boolean] = js.native
}
object ShortCutConfig {
  
  @scala.inline
  def apply(): ShortCutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortCutConfig]
  }
  
  @scala.inline
  implicit class ShortCutConfigOps[Self <: ShortCutConfig] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setStartMenu(value: Boolean): Self = this.set("startMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenu: Self = this.set("startMenu", js.undefined)
    
    @scala.inline
    def setSystemStartup(value: Boolean): Self = this.set("systemStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemStartup: Self = this.set("systemStartup", js.undefined)
  }
}
