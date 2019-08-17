package typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod

import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSPixelUnitRule
import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSRule
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
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
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (dialogDefaultMaxWidth != null) __obj.updateDynamic("dialogDefaultMaxWidth")(dialogDefaultMaxWidth.asInstanceOf[js.Any])
    if (dialogDefaultMinWidth != null) __obj.updateDynamic("dialogDefaultMinWidth")(dialogDefaultMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[IDialogStyleProps]
  }
}

