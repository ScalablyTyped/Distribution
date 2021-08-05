package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disconnectedcolor extends StObject {
  
  def `--disconnected-color`(data: IThemeConfig): String
}
object Disconnectedcolor {
  
  inline def apply(`--disconnected-color`: IThemeConfig => String): Disconnectedcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("--disconnected-color")(js.Any.fromFunction1(`--disconnected-color`))
    __obj.asInstanceOf[Disconnectedcolor]
  }
  
  extension [Self <: Disconnectedcolor](x: Self) {
    
    inline def `set--disconnected-color`(value: IThemeConfig => String): Self = StObject.set(x, "--disconnected-color", js.Any.fromFunction1(value))
  }
}
