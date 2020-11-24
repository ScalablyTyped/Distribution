package typings.officeUiFabricReact.linkTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinkStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var isButton: js.UndefOr[Boolean] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object ILinkStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): ILinkStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkStyleProps]
  }
  
  @scala.inline
  implicit class ILinkStylePropsOps[Self <: ILinkStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIsButton(value: Boolean): Self = this.set("isButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsButton: Self = this.set("isButton", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
  }
}
