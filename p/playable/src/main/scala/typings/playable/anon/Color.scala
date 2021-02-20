package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  def color(data: IThemeConfig): String = js.native
}
object Color {
  
  @scala.inline
  def apply(color: IThemeConfig => String): Color = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: IThemeConfig => String): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
  }
}
