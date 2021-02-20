package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends StObject {
  
  def fill(data: IThemeConfig): String = js.native
}
object Fill {
  
  @scala.inline
  def apply(fill: IThemeConfig => String): Fill = {
    val __obj = js.Dynamic.literal(fill = js.Any.fromFunction1(fill))
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: IThemeConfig => String): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
  }
}
