package typings
package officeDashUiDashFabricDashReactLib.libComponentsDialogDialogDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDialogStyleProps extends js.Object {
  /**
       * Accept custom classNames
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional override for container class
       * @deprecated Pass through via `modalProps.className` instead.
       */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional override content class
       * @deprecated Pass through via `dialogContentProps` instead as `className`.
       */
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Default max-width for the dialog box.
       * @defaultvalue '340px'
       */
  var dialogDefaultMaxWidth: js.UndefOr[
    java.lang.String | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSRule | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSPixelUnitRule
  ] = js.undefined
  /**
       * Default min-width for the dialog box.
       * @defaultvalue '288px'
       */
  var dialogDefaultMinWidth: js.UndefOr[
    java.lang.String | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSRule | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSPixelUnitRule
  ] = js.undefined
  /**
       * Whether the dialog is hidden.
       * @defaultvalue false
       */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Accept theme prop.
       */
  var theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
}

