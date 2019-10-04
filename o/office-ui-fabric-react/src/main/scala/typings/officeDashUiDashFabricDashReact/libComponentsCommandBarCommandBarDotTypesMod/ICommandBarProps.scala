package typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotBaseMod.ICommandBarData
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Accessibility text to be read by the screen reader when the user's
    * focus enters the command bar. The screen reader will read this text
    * after reading information about the first focusable item in the command
    * bar.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Custom button to be used as near and far items
    */
  var buttonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.undefined
  /**
    * Optional callback to access the ICommandBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICommandBar]] = js.undefined
  /**
    * Function to be called every time data is rendered. It provides the data that was actually rendered.
    * A use case would be adding telemetry when a particular control is shown in an overflow well or
    * dropped as a result of onReduceData or to count the number of renders that an implementation of
    * onReduceData triggers.
    */
  var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, Unit]] = js.undefined
  /**
    * Items to render on the right side (or left, in RTL). ICommandBarItemProps extend IContextualMenuItem
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
  /**
    * Items to render. ICommandBarItemProps extend IContextualMenuItem
    */
  var items: js.Array[ICommandBarItemProps]
  /**
    * Function callback invoked when data has been grown.
    */
  var onDataGrown: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.undefined
  /**
    * Function callback invoked when data has been reduced.
    */
  var onDataReduced: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.undefined
  /**
    * Custom function to grow data if items are too small for the given space.
    * Return `undefined` if no more steps can be taken to avoid infinate loop.
    */
  var onGrowData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.undefined
  /**
    * Custom function to reduce data if items do not fit in given space. Return `undefined`
    * if no more steps can be taken to avoid infinate loop.
    */
  var onReduceData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.undefined
  /**
    * Custom button to be used as oveflow button
    */
  var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.undefined
  /**
    * Props to be passed to overflow button.
    * If menuProps are passed through this prop, any items provided will be prepended to the top of the existing menu.
    */
  var overflowButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Default items to have in the overflow menu. ICommandBarItemProps extend IContextualMenuItem
    */
  var overflowItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
  /**
    * When true, items will be 'shifted' off the front of the array when reduced, and unshifted during grow
    */
  var shiftOnReduce: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ICommandBarProps {
  @scala.inline
  def apply(
    items: js.Array[ICommandBarItemProps],
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    ariaLabel: String = null,
    buttonAs: IComponentAs[IButtonProps] = null,
    className: String = null,
    componentRef: IRefObject[ICommandBar] = null,
    dataDidRender: /* renderedData */ js.Any => Unit = null,
    farItems: js.Array[ICommandBarItemProps] = null,
    onDataGrown: /* movedItem */ ICommandBarItemProps => Unit = null,
    onDataReduced: /* movedItem */ ICommandBarItemProps => Unit = null,
    onGrowData: /* data */ ICommandBarData => js.UndefOr[ICommandBarData] = null,
    onReduceData: /* data */ ICommandBarData => js.UndefOr[ICommandBarData] = null,
    overflowButtonAs: IComponentAs[IButtonProps] = null,
    overflowButtonProps: IButtonProps = null,
    overflowItems: js.Array[ICommandBarItemProps] = null,
    shiftOnReduce: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles] = null,
    theme: ITheme = null
  ): ICommandBarProps = {
    val __obj = js.Dynamic.literal(items = items)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (buttonAs != null) __obj.updateDynamic("buttonAs")(buttonAs.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dataDidRender != null) __obj.updateDynamic("dataDidRender")(js.Any.fromFunction1(dataDidRender))
    if (farItems != null) __obj.updateDynamic("farItems")(farItems)
    if (onDataGrown != null) __obj.updateDynamic("onDataGrown")(js.Any.fromFunction1(onDataGrown))
    if (onDataReduced != null) __obj.updateDynamic("onDataReduced")(js.Any.fromFunction1(onDataReduced))
    if (onGrowData != null) __obj.updateDynamic("onGrowData")(js.Any.fromFunction1(onGrowData))
    if (onReduceData != null) __obj.updateDynamic("onReduceData")(js.Any.fromFunction1(onReduceData))
    if (overflowButtonAs != null) __obj.updateDynamic("overflowButtonAs")(overflowButtonAs.asInstanceOf[js.Any])
    if (overflowButtonProps != null) __obj.updateDynamic("overflowButtonProps")(overflowButtonProps)
    if (overflowItems != null) __obj.updateDynamic("overflowItems")(overflowItems)
    if (!js.isUndefined(shiftOnReduce)) __obj.updateDynamic("shiftOnReduce")(shiftOnReduce)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ICommandBarProps]
  }
}

