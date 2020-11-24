package typings.officeUiFabricReact.iconTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIIconStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIconStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var iconClassName: js.UndefOr[String] = js.native
  
  var isImage: Boolean = js.native
  
  var isPlaceholder: Boolean = js.native
  
  var styles: js.UndefOr[PartialIIconStyles] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
}
object IIconStyleProps {
  
  @scala.inline
  def apply(isImage: Boolean, isPlaceholder: Boolean): IIconStyleProps = {
    val __obj = js.Dynamic.literal(isImage = isImage.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconStyleProps]
  }
  
  @scala.inline
  implicit class IIconStylePropsOps[Self <: IIconStyleProps] (val x: Self) extends AnyVal {
    
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
    def setIsImage(value: Boolean): Self = this.set("isImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlaceholder(value: Boolean): Self = this.set("isPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialIIconStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
