package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import typings.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigTheme extends StObject {
  
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
  implicit class ConfigThemeMutableBuilder[Self <: ConfigTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
