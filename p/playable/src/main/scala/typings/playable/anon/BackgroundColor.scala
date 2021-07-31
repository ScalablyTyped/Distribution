package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  def backgroundColor(data: IThemeConfig): String
}
object BackgroundColor {
  
  @scala.inline
  def apply(backgroundColor: IThemeConfig => String): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor))
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: IThemeConfig => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
  }
}
