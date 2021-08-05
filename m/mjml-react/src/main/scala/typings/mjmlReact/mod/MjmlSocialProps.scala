package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.ColorProperty
import typings.mjmlReact.mjmlReactStrings.horizontal
import typings.mjmlReact.mjmlReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlSocialProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var color: js.UndefOr[ColorProperty] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String | Double] = js.undefined
  
  var iconHeight: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[String] = js.undefined
  
  var innerPadding: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[vertical | horizontal] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object MjmlSocialProps {
  
  inline def apply(): MjmlSocialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialProps]
  }
  
  extension [Self <: MjmlSocialProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconSize(value: String): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setInnerPadding(value: String): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMode(value: vertical | horizontal): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
