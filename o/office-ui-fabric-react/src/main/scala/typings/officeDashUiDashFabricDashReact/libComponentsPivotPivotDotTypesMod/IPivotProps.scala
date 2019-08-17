package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotBaseMod.PivotBase
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotItemMod.PivotItem
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivotProps
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[PivotBase] {
  /**
    * Optional callback to access the IPivot interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPivot]] = js.undefined
  /**
    * Default selected index for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedKey`.
    */
  var defaultSelectedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Default selected key for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedIndex`.
    */
  var defaultSelectedKey: js.UndefOr[String] = js.undefined
  /**
    * Callback to customize how IDs are generated for each tab header.
    * Useful if you're rendering content outside and need to connect aria-labelledby.
    */
  var getTabId: js.UndefOr[js.Function2[/* itemKey */ String, /* index */ Double, String]] = js.undefined
  /**
    * Whether to skip rendering the tabpanel with the content of the selected tab.
    * Use this prop if you plan to separately render the tab content
    * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
    */
  var headersOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Index of the pivot item initially selected. Mutually exclusive with `initialSelectedKey`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedIndex`
    */
  var initialSelectedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Key of the pivot item initially selected. Mutually exclusive with `initialSelectedIndex`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedKey`
    */
  var initialSelectedKey: js.UndefOr[String] = js.undefined
  /**
    * PivotLinkFormat to use (links, tabs)
    */
  var linkFormat: js.UndefOr[PivotLinkFormat] = js.undefined
  /**
    * PivotLinkSize to use (normal, large)
    */
  var linkSize: js.UndefOr[PivotLinkSize] = js.undefined
  /**
    * Callback for when the selected pivot item is changed.
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[PivotItem], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.undefined
  /**
    * Key of the selected pivot item. Updating this will override the Pivot's selected item state.
    * Only provide this if the pivot is a controlled component where you are maintaining the
    * current state; otherwise, use `defaultSelectedKey`.
    */
  var selectedKey: js.UndefOr[String | Null] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IPivotProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[PivotBase] = null,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    className: String = null,
    componentRef: IRefObject[IPivot] = null,
    defaultSelectedIndex: Int | Double = null,
    defaultSelectedKey: String = null,
    getTabId: (/* itemKey */ String, /* index */ Double) => String = null,
    headersOnly: js.UndefOr[Boolean] = js.undefined,
    initialSelectedIndex: Int | Double = null,
    initialSelectedKey: String = null,
    linkFormat: PivotLinkFormat = null,
    linkSize: PivotLinkSize = null,
    onLinkClick: (/* item */ js.UndefOr[PivotItem], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit = null,
    selectedKey: String = null,
    styles: IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles] = null,
    theme: ITheme = null
  ): IPivotProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultSelectedIndex != null) __obj.updateDynamic("defaultSelectedIndex")(defaultSelectedIndex.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey)
    if (getTabId != null) __obj.updateDynamic("getTabId")(js.Any.fromFunction2(getTabId))
    if (!js.isUndefined(headersOnly)) __obj.updateDynamic("headersOnly")(headersOnly)
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (initialSelectedKey != null) __obj.updateDynamic("initialSelectedKey")(initialSelectedKey)
    if (linkFormat != null) __obj.updateDynamic("linkFormat")(linkFormat)
    if (linkSize != null) __obj.updateDynamic("linkSize")(linkSize)
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(js.Any.fromFunction2(onLinkClick))
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IPivotProps]
  }
}

