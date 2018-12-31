package typings
package officeDashUiDashFabricDashReactLib.libComponentsCheckCheckDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[officeDashUiDashFabricDashReactLib.libComponentsCheckCheckDotBaseMod.CheckBase] {
  /**
    * Flag to always show the check icon. Not currently working.
    */
  var alwaysShowCheck: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional css class to apply to the Check
    * @defaultvalue undefined
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ICheckProps]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

