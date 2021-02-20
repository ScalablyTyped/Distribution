package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.ColorProperty
import typings.mjmlReact.mjmlReactStrings.horizontal
import typings.mjmlReact.mjmlReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlSocialProps extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String | Double] = js.native
  
  var iconHeight: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[String] = js.native
  
  var innerPadding: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String | Double] = js.native
  
  var mode: js.UndefOr[vertical | horizontal] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object MjmlSocialProps {
  
  @scala.inline
  def apply(): MjmlSocialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialProps]
  }
  
  @scala.inline
  implicit class MjmlSocialPropsMutableBuilder[Self <: MjmlSocialProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    @scala.inline
    def setIconSize(value: String): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setInnerPadding(value: String): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setMode(value: vertical | horizontal): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
