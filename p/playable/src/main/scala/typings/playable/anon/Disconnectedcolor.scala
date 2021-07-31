package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disconnectedcolor extends StObject {
  
  def `--disconnected-color`(data: IThemeConfig): String
}
object Disconnectedcolor {
  
  @scala.inline
  def apply(`--disconnected-color`: IThemeConfig => String): Disconnectedcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("--disconnected-color")(js.Any.fromFunction1(`--disconnected-color`))
    __obj.asInstanceOf[Disconnectedcolor]
  }
  
  @scala.inline
  implicit class DisconnectedcolorMutableBuilder[Self <: Disconnectedcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set--disconnected-color`(value: IThemeConfig => String): Self = StObject.set(x, "--disconnected-color", js.Any.fromFunction1(value))
  }
}
