package typings.officeUiFabricReact.iconTypesMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontIconProps extends HTMLAttributes[HTMLElement] {
  /**
    * The name of the icon to use from the icon font.
    * If string is empty, a placeholder icon will be rendered the same width as an icon.
    */
  var iconName: js.UndefOr[String] = js.native
}

object IFontIconProps {
  @scala.inline
  def apply(): IFontIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFontIconProps]
  }
  @scala.inline
  implicit class IFontIconPropsOps[Self <: IFontIconProps] (val x: Self) extends AnyVal {
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
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
  }
  
}

