package typings
package officeDashUiDashFabricDashReactLib.libComponentsPivotPivotItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivotItemProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * The aria label of each pivot link which will read by screen reader instead of linkText.
    *
    * Note that unless you have compelling requirements you should not override aria-label.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /**
    * Props for the header command button supporting native props - data-* and aria-* - for each pivot header/link element
    */
  var headerButtonProps: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  ] = js.undefined
  /**
    * The text displayed of each pivot link.
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional item count that gets displayed just after the linkText(itemCount)
    *
    * Example: completed(4)
    */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional icon to show next to the pivot link.
    */
  var itemIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An required key to uniquely identify a pivot item.
    *
    * Note: The 'key' from react props cannot be used inside component.
    */
  var itemKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional keytip for this PivotItem
    */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
    * The text displayed of each pivot link - renaming to `headerText`.
    * @deprecated Use `headerText` instead.
    */
  var linkText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional custom renderer for the pivot item link
    */
  var onRenderItemLink: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPivotItemProps]] = js.undefined
}

