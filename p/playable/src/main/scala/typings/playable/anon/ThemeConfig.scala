package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConfig extends js.Object {
  
  var themeConfig: IThemeConfig = js.native
}
object ThemeConfig {
  
  @scala.inline
  def apply(themeConfig: IThemeConfig): ThemeConfig = {
    val __obj = js.Dynamic.literal(themeConfig = themeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeConfig]
  }
  
  @scala.inline
  implicit class ThemeConfigOps[Self <: ThemeConfig] (val x: Self) extends AnyVal {
    
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
    def setThemeConfig(value: IThemeConfig): Self = this.set("themeConfig", value.asInstanceOf[js.Any])
  }
}
