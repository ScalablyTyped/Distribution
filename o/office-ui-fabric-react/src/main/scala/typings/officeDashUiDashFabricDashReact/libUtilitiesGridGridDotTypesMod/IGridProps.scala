package typings.officeDashUiDashFabricDashReact.libUtilitiesGridGridDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridProps extends js.Object {
  /**
    * The number of columns
    */
  var columnCount: Double
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IGrid]] = js.undefined
  /**
    * Optional, class name for the FocusZone container for the grid
    * @deprecated Use `styles` and `IGridStyles` to define a styling for the focus zone container with
    * focusedContainer property.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * If true do not contain the grid inside of a FocusZone.
    * If false contain the grid inside of a FocusZone.
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
  /**
    * The items to turn into a grid
    */
  var items: js.Array[_]
  /**
    * Optional, handler for when the grid should blur
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The optional position this grid is in the parent set (index in a parent menu, for example)
    */
  var positionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The optional size of the parent set (size of parent menu, for example)
    */
  var setSize: js.UndefOr[Double] = js.undefined
  /**
    * Boolean indicating if the focus should support circular navigation.
    * This prop is only relevant if doNotcontainWithinFocusZone is not true
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGridStyleProps, IGridStyles]] = js.undefined
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Custom renderer for the individual items
    */
  def onRenderItem(item: js.Any, index: Double): Element
}

object IGridProps {
  @scala.inline
  def apply(
    columnCount: Double,
    items: js.Array[_],
    onRenderItem: (js.Any, Double) => Element,
    componentRef: IRefObject[IGrid] = null,
    containerClassName: String = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    onBlur: () => Unit = null,
    positionInSet: Int | Double = null,
    setSize: Int | Double = null,
    shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IGridStyleProps, IGridStyles] = null,
    theme: ITheme = null
  ): IGridProps = {
    val __obj = js.Dynamic.literal(columnCount = columnCount, items = items, onRenderItem = js.Any.fromFunction2(onRenderItem))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (positionInSet != null) __obj.updateDynamic("positionInSet")(positionInSet.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusCircularNavigate)) __obj.updateDynamic("shouldFocusCircularNavigate")(shouldFocusCircularNavigate)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IGridProps]
  }
}

