package typings.playable.anon

import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  def color(data: IThemeConfig): String
}
object Color {
  
  inline def apply(color: IThemeConfig => String): Color = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color))
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: IThemeConfig => String): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
  }
}
