package typings.officeUiFabricReact.choiceGroupOptionTypesMod

import typings.officeUiFabricReact.anon.HeightWidth
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOptionStyleProps extends js.Object {
  /** Whether the option is checked or not. */
  var checked: js.UndefOr[Boolean] = js.native
  /** Whether the option is disabled or not. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the option is in focus or not. */
  var focused: js.UndefOr[Boolean] = js.native
  /** Whether the option has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.native
  /** Whether the option icon is an image. */
  var hasImage: js.UndefOr[Boolean] = js.native
  /** Whether the image width or height are higher than `71`. */
  var imageIsLarge: js.UndefOr[Boolean] = js.native
  /**
    * Image sizes used when `hasImage` or `hasIcon` style props are enabled.
    * @defaultvalue \{height: 32, width: 32\}
    */
  var imageSize: js.UndefOr[HeightWidth] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}

object IChoiceGroupOptionStyleProps {
  @scala.inline
  def apply(theme: ITheme): IChoiceGroupOptionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionStyleProps]
  }
  @scala.inline
  implicit class IChoiceGroupOptionStylePropsOps[Self <: IChoiceGroupOptionStyleProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHasIcon(value: Boolean): Self = this.set("hasIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasIcon: Self = this.set("hasIcon", js.undefined)
    @scala.inline
    def setHasImage(value: Boolean): Self = this.set("hasImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasImage: Self = this.set("hasImage", js.undefined)
    @scala.inline
    def setImageIsLarge(value: Boolean): Self = this.set("imageIsLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIsLarge: Self = this.set("imageIsLarge", js.undefined)
    @scala.inline
    def setImageSize(value: HeightWidth): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
  }
  
}

