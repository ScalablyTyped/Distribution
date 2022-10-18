package typings.playable.anon

import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  def fill(data: IThemeConfig): String
}
object Fill {
  
  inline def apply(fill: IThemeConfig => String): Fill = {
    val __obj = js.Dynamic.literal(fill = js.Any.fromFunction1(fill))
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setFill(value: IThemeConfig => String): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
  }
}
