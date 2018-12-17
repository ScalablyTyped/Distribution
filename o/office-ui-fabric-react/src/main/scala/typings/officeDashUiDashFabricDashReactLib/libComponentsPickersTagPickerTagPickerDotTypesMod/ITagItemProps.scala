package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersTagPickerTagPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITagItemProps
  extends officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps[ITag] {
  /**
       * Enable or not focus on TagItem when TagPicker is disabled.
       * @defaultvalue false
       */
  var enableTagFocusInDisabledPicker: js.UndefOr[scala.Boolean] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]
  ] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

