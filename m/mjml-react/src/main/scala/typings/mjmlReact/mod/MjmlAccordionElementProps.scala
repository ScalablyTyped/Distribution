package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlAccordionElementProps extends js.Object {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var iconAlign: js.UndefOr[String] = js.native
  
  var iconHeight: js.UndefOr[String] = js.native
  
  var iconPosition: js.UndefOr[left | right] = js.native
  
  var iconUnwrappedAlt: js.UndefOr[String] = js.native
  
  var iconUnwrappedUrl: js.UndefOr[String] = js.native
  
  var iconWidth: js.UndefOr[String] = js.native
  
  var iconWrappedAlt: js.UndefOr[String] = js.native
  
  var iconWrappedUrl: js.UndefOr[String] = js.native
}
object MjmlAccordionElementProps {
  
  @scala.inline
  def apply(): MjmlAccordionElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionElementProps]
  }
  
  @scala.inline
  implicit class MjmlAccordionElementPropsOps[Self <: MjmlAccordionElementProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: BackgroundColorProperty): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setIconAlign(value: String): Self = this.set("iconAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconAlign: Self = this.set("iconAlign", js.undefined)
    
    @scala.inline
    def setIconHeight(value: String): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    
    @scala.inline
    def setIconPosition(value: left | right): Self = this.set("iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPosition: Self = this.set("iconPosition", js.undefined)
    
    @scala.inline
    def setIconUnwrappedAlt(value: String): Self = this.set("iconUnwrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUnwrappedAlt: Self = this.set("iconUnwrappedAlt", js.undefined)
    
    @scala.inline
    def setIconUnwrappedUrl(value: String): Self = this.set("iconUnwrappedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUnwrappedUrl: Self = this.set("iconUnwrappedUrl", js.undefined)
    
    @scala.inline
    def setIconWidth(value: String): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
    
    @scala.inline
    def setIconWrappedAlt(value: String): Self = this.set("iconWrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconWrappedAlt: Self = this.set("iconWrappedAlt", js.undefined)
    
    @scala.inline
    def setIconWrappedUrl(value: String): Self = this.set("iconWrappedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconWrappedUrl: Self = this.set("iconWrappedUrl", js.undefined)
  }
}
