package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import typings.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigTheme extends js.Object {
  
  var config: IPlayerConfig = js.native
  
  var theme: IThemeService = js.native
}
object ConfigTheme {
  
  @scala.inline
  def apply(config: IPlayerConfig, theme: IThemeService): ConfigTheme = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTheme]
  }
  
  @scala.inline
  implicit class ConfigThemeOps[Self <: ConfigTheme] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
