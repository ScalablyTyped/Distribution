package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  @JSName("&:after")
  var AmpersandColonafter: BackgroundColor
  
  def backgroundColor(data: IThemeConfig): String
}
object After {
  
  inline def apply(AmpersandColonafter: BackgroundColor, backgroundColor: IThemeConfig => String): After = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor))
    __obj.updateDynamic("&:after")(AmpersandColonafter.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAmpersandColonafter(value: BackgroundColor): Self = StObject.set(x, "&:after", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: IThemeConfig => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
  }
}
