package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.mjmlReact.mjmlReactStrings.`fixed-height`
import typings.mjmlReact.mjmlReactStrings.`fluid-height`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlHeroProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var backgroundHeight: js.UndefOr[String] = js.undefined
  
  var backgroundPosition: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.undefined
  
  var backgroundUrl: js.UndefOr[String] = js.undefined
  
  var backgroundWidth: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[`fluid-height` | `fixed-height`] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlHeroProps {
  
  @scala.inline
  def apply(): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlHeroProps]
  }
  
  @scala.inline
  implicit class MjmlHeroPropsMutableBuilder[Self <: MjmlHeroProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundHeight(value: String): Self = StObject.set(x, "backgroundHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundHeightUndefined: Self = StObject.set(x, "backgroundHeight", js.undefined)
    
    @scala.inline
    def setBackgroundPosition(value: BackgroundPositionProperty[String | Double]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundUrl(value: String): Self = StObject.set(x, "backgroundUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUrlUndefined: Self = StObject.set(x, "backgroundUrl", js.undefined)
    
    @scala.inline
    def setBackgroundWidth(value: String): Self = StObject.set(x, "backgroundWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundWidthUndefined: Self = StObject.set(x, "backgroundWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMode(value: `fluid-height` | `fixed-height`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
