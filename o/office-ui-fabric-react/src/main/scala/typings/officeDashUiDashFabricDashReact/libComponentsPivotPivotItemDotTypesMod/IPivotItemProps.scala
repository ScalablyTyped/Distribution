package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotItemDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivotItemProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The aria label of each pivot link which will read by screen reader instead of linkText.
    *
    * Note that unless you have compelling requirements you should not override aria-label.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  /**
    * Props for the header command button supporting native props - data-* and aria-* - for each pivot header/link element
    */
  var headerButtonProps: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  /**
    * The text displayed of each pivot link.
    */
  var headerText: js.UndefOr[String] = js.undefined
  /**
    * Defines an optional item count displayed in parentheses just after the `linkText`.
    *
    * Examples: completed (4), Unread (99+)
    */
  var itemCount: js.UndefOr[Double | String] = js.undefined
  /**
    * An optional icon to show next to the pivot link.
    */
  var itemIcon: js.UndefOr[String] = js.undefined
  /**
    * An required key to uniquely identify a pivot item.
    *
    * Note: The 'key' from react props cannot be used inside component.
    */
  var itemKey: js.UndefOr[String] = js.undefined
  /**
    * Optional keytip for this PivotItem
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * The text displayed of each pivot link - renaming to `headerText`.
    * @deprecated Use `headerText` instead.
    */
  var linkText: js.UndefOr[String] = js.undefined
  /**
    * Optional custom renderer for the pivot item link
    */
  var onRenderItemLink: js.UndefOr[IRenderFunction[IPivotItemProps]] = js.undefined
}

object IPivotItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    ariaLabel: String = null,
    componentRef: IRefObject[js.Object] = null,
    headerButtonProps: StringDictionary[String | Double | Boolean] = null,
    headerText: String = null,
    itemCount: Double | String = null,
    itemIcon: String = null,
    itemKey: String = null,
    keytipProps: IKeytipProps = null,
    linkText: String = null,
    onRenderItemLink: (/* props */ js.UndefOr[IPivotItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPivotItemProps], Element | Null]]) => Element | Null = null
  ): IPivotItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (headerButtonProps != null) __obj.updateDynamic("headerButtonProps")(headerButtonProps)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon)
    if (itemKey != null) __obj.updateDynamic("itemKey")(itemKey)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (linkText != null) __obj.updateDynamic("linkText")(linkText)
    if (onRenderItemLink != null) __obj.updateDynamic("onRenderItemLink")(js.Any.fromFunction2(onRenderItemLink))
    __obj.asInstanceOf[IPivotItemProps]
  }
}

