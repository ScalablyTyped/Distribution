package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConfig extends StObject {
  
  var themeConfig: IThemeConfig
}
object ThemeConfig {
  
  inline def apply(themeConfig: IThemeConfig): ThemeConfig = {
    val __obj = js.Dynamic.literal(themeConfig = themeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeConfig]
  }
  
  extension [Self <: ThemeConfig](x: Self) {
    
    inline def setThemeConfig(value: IThemeConfig): Self = StObject.set(x, "themeConfig", value.asInstanceOf[js.Any])
  }
}
