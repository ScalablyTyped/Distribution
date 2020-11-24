package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.ColorProperty
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
import typings.mjmlReact.mjmlReactStrings.medium
import typings.mjmlReact.mjmlReactStrings.pinterest
import typings.mjmlReact.mjmlReactStrings.snapchat
import typings.mjmlReact.mjmlReactStrings.soundcloud
import typings.mjmlReact.mjmlReactStrings.tumblr
import typings.mjmlReact.mjmlReactStrings.twitter
import typings.mjmlReact.mjmlReactStrings.vertical
import typings.mjmlReact.mjmlReactStrings.vimeo
import typings.mjmlReact.mjmlReactStrings.web
import typings.mjmlReact.mjmlReactStrings.xing
import typings.mjmlReact.mjmlReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlSocialElementProps extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String | Double] = js.native
  
  var iconHeight: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String | Double] = js.native
  
  var mode: js.UndefOr[vertical | horizontal] = js.native
  
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object MjmlSocialElementProps {
  
  @scala.inline
  def apply(): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
  
  @scala.inline
  implicit class MjmlSocialElementPropsOps[Self <: MjmlSocialElementProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIconHeight(value: String): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    
    @scala.inline
    def setIconSize(value: String): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String | Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMode(value: vertical | horizontal): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
}
