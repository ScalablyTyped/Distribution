package typings.officeUiFabricReact.dialogTypesMod

import typings.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typings.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.undefined
  /**
    * Default max-width for the dialog box.
    * @defaultvalue '340px'
    */
  var dialogDefaultMaxWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Default min-width for the dialog box.
    * @defaultvalue '288px'
    */
  var dialogDefaultMinWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Whether the dialog is hidden.
    * @defaultvalue false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDialogStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    containerClassName: String = null,
    contentClassName: String = null,
    dialogDefaultMaxWidth: String | ICSSRule | ICSSPixelUnitRule = null,
    dialogDefaultMinWidth: String | ICSSRule | ICSSPixelUnitRule = null,
    hidden: js.UndefOr[Boolean] = js.undefined
  ): IDialogStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (dialogDefaultMaxWidth != null) __obj.updateDynamic("dialogDefaultMaxWidth")(dialogDefaultMaxWidth.asInstanceOf[js.Any])
    if (dialogDefaultMinWidth != null) __obj.updateDynamic("dialogDefaultMinWidth")(dialogDefaultMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogStyleProps]
  }
}

