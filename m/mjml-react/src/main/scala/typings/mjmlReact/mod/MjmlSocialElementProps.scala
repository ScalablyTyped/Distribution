package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Color
import typings.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typings.mjmlReact.mjmlReactStrings.`google-noshare`
import typings.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typings.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typings.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typings.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typings.mjmlReact.mjmlReactStrings.`xing-noshare`
import typings.mjmlReact.mjmlReactStrings.dribbble
import typings.mjmlReact.mjmlReactStrings.facebook
import typings.mjmlReact.mjmlReactStrings.github
import typings.mjmlReact.mjmlReactStrings.google
import typings.mjmlReact.mjmlReactStrings.horizontal
import typings.mjmlReact.mjmlReactStrings.instagram
import typings.mjmlReact.mjmlReactStrings.linkedin
import typings.mjmlReact.mjmlReactStrings.ltr
import typings.mjmlReact.mjmlReactStrings.medium
import typings.mjmlReact.mjmlReactStrings.pinterest
import typings.mjmlReact.mjmlReactStrings.rtl
import typings.mjmlReact.mjmlReactStrings.snapchat
import typings.mjmlReact.mjmlReactStrings.soundcloud
import typings.mjmlReact.mjmlReactStrings.tumblr
import typings.mjmlReact.mjmlReactStrings.twitter
import typings.mjmlReact.mjmlReactStrings.vertical
import typings.mjmlReact.mjmlReactStrings.vimeo
import typings.mjmlReact.mjmlReactStrings.web
import typings.mjmlReact.mjmlReactStrings.xing
import typings.mjmlReact.mjmlReactStrings.youtube
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlSocialElementProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String | Double] = js.undefined
  
  var iconHeight: js.UndefOr[String] = js.undefined
  
  var iconPadding: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[vertical | horizontal] = js.undefined
  
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object MjmlSocialElementProps {
  
  inline def apply(): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
  
  extension [Self <: MjmlSocialElementProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconPadding(value: String): Self = StObject.set(x, "iconPadding", value.asInstanceOf[js.Any])
    
    inline def setIconPaddingUndefined: Self = StObject.set(x, "iconPadding", js.undefined)
    
    inline def setIconSize(value: String): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMode(value: vertical | horizontal): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
