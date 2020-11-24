package typings.officeUiFabricReact.hoverCardTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHoverCardStyleProps extends js.Object {
  
  /**
    * Optional className(s) for the host div of HoverCard.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}
object IHoverCardStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IHoverCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardStyleProps]
  }
  
  @scala.inline
  implicit class IHoverCardStylePropsOps[Self <: IHoverCardStyleProps] (val x: Self) extends AnyVal {
    
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
  }
}
