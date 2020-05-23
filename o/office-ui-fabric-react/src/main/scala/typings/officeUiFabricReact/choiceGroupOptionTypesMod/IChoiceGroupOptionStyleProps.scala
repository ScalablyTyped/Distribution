package typings.officeUiFabricReact.choiceGroupOptionTypesMod

import typings.officeUiFabricReact.anon.HeightWidth
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOptionStyleProps extends js.Object {
  /** Whether the option is checked or not. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** Whether the option is disabled or not. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the option is in focus or not. */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** Whether the option has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.undefined
  /** Whether the option icon is an image. */
  var hasImage: js.UndefOr[Boolean] = js.undefined
  /** Whether the image width or height are higher than `71`. */
  var imageIsLarge: js.UndefOr[Boolean] = js.undefined
  /**
    * Image sizes used when `hasImage` or `hasIcon` style props are enabled.
    * @defaultvalue \{height: 32, width: 32\}
    */
  var imageSize: js.UndefOr[HeightWidth] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: ITheme
}

object IChoiceGroupOptionStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    hasIcon: js.UndefOr[Boolean] = js.undefined,
    hasImage: js.UndefOr[Boolean] = js.undefined,
    imageIsLarge: js.UndefOr[Boolean] = js.undefined,
    imageSize: HeightWidth = null
  ): IChoiceGroupOptionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcon)) __obj.updateDynamic("hasIcon")(hasIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasImage)) __obj.updateDynamic("hasImage")(hasImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageIsLarge)) __obj.updateDynamic("imageIsLarge")(imageIsLarge.get.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionStyleProps]
  }
}

