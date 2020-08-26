package typings.officeUiFabricReact.overlayTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Is overlay dark themed
    */
  var isDark: js.UndefOr[Boolean] = js.native
  /**
    * Is overlay visible
    */
  var isNone: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IOverlayStyleProps {
  @scala.inline
  def apply(theme: ITheme): IOverlayStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayStyleProps]
  }
  @scala.inline
  implicit class IOverlayStylePropsOps[Self <: IOverlayStyleProps] (val x: Self) extends AnyVal {
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
    def setIsDark(value: Boolean): Self = this.set("isDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDark: Self = this.set("isDark", js.undefined)
    @scala.inline
    def setIsNone(value: Boolean): Self = this.set("isNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNone: Self = this.set("isNone", js.undefined)
  }
  
}

