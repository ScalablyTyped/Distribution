package typings.playable.anon

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigTheme extends StObject {
  
  var config: IPlayerConfig
  
  var theme: IThemeService
}
object ConfigTheme {
  
  inline def apply(config: IPlayerConfig, theme: IThemeService): ConfigTheme = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigTheme] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
