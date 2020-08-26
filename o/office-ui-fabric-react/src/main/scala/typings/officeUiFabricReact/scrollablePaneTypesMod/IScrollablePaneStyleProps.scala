package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IScrollablePaneStyleProps {
  @scala.inline
  def apply(theme: ITheme): IScrollablePaneStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneStyleProps]
  }
  @scala.inline
  implicit class IScrollablePaneStylePropsOps[Self <: IScrollablePaneStyleProps] (val x: Self) extends AnyVal {
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
    def setScrollbarVisibility(value: ScrollbarVisibility): Self = this.set("scrollbarVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarVisibility: Self = this.set("scrollbarVisibility", js.undefined)
  }
  
}

