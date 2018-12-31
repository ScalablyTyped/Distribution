package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowCheckDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowCheckProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
    * Is any selected - also true for isSelectionModal
    */
  var anySelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Can this checkbox be selectable
    */
  var canSelect: scala.Boolean
  /**
    * The classname to be passed down to Check component
    */
  var checkClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is this in compact mode?
    */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is the check part of the header in a DetailsList
    */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Deprecated, use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this checkbox is visible
    */
  var isVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this check is selected
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Style override
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]
  ] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

