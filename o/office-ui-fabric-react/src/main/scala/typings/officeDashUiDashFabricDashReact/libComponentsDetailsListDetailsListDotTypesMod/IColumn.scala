package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnStyles
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the arai-label attribute will contain the column name
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Internal only value.
    */
  var calculatedWidth: js.UndefOr[Double] = js.undefined
  /**
    * An optional class name to stick on the column cell within each row.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Defines how the column's header should render.
    * @defaultvalue ColumnActionsMode.clickable
    */
  var columnActionsMode: js.UndefOr[ColumnActionsMode] = js.undefined
  /**
    * Internal only value.
    * Remembers the actual witdh of the column on any case.
    * On the other hand, calculatedWidth is only saved when it's defined by user, not for justified calculations.
    */
  var currentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Arbitrary data passthrough which can be used by the caller.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The field to pull the text value from for the column. This can be null if a custom
    * onRender method is provided.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /**
    * ARIA label for the status of this column when filtered.
    */
  var filterAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * If set, parent getCellValueKey will return this value.
    */
  var getValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.undefined
  /**
    * ARIA label for the status of this column when grouped.
    */
  var groupAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * An optional class name to stick on the column cell within each header.
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  /**
    * Class name to add to the Icon component.
    */
  var iconClassName: js.UndefOr[String] = js.undefined
  /**
    * Optional iconName to use for the column header.
    */
  var iconName: js.UndefOr[String] = js.undefined
  /**
    * If specified will allow the column to be collapsed when rendered in justified layout.
    * @deprecated Use `isCollapsible`
    */
  var isCollapsable: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified will allow the column to be collapsed when rendered in justified layout.
    */
  var isCollapsible: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the column is filtered, and if so shows a filter icon.
    */
  var isFiltered: js.UndefOr[Boolean] = js.undefined
  /**
    * If set will show a grouped icon next to the column header name.
    */
  var isGrouped: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not only the icon is used in the column header.
    * Set this to true so the column name and dropdown chevron are not displayed.
    */
  var isIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a dropdown menu is open so that the appropriate ARIA attributes are rendered.
    */
  var isMenuOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the column can render multi-line text.
    */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, will add additional LTR padding-right to column and cells.
    */
  var isPadded: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the column can be resized.
    */
  var isResizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional flag on whether the column is a header for the given row. There should be only one column with
    * row header set to true.
    * @defaultvalue false
    */
  var isRowHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the column is currently sorted. Renders a sort arrow in the column header.
    */
  var isSorted: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the arrow is pointed down (descending) or up.
    */
  var isSortedDescending: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique key for identifying the column.
    */
  var key: String
  /**
    * Maximum width for the column, if stretching is allowed in justified scenarios.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Minimum width for the column.
    */
  var minWidth: Double
  /**
    * Name to render on the column header.
    */
  var name: String
  /**
    * If provided, will be executed when the user clicks on the column header.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.undefined
  /**
    * If provided, will be executed when the user accesses the contextmenu on a column header.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.undefined
  /**
    * If provided, will be executed when the column is resized with the column's current width.
    * Prefer this callback over `DetailsList` `onColumnResize` if you require the `IColumn` to
    * report its width after every resize event. Consider debouncing the callback if resize events
    * occur frequently.
    */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * If provided uses this method to render custom cell content, rather than the default text rendering.
    */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      _
    ]
  ] = js.undefined
  /**
    * If provider, can be used to render a custom column header divider
    */
  var onRenderDivider: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.undefined
  /**
    * ARIA label for the sort order of this column when sorted ascending.
    */
  var sortAscendingAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * ARIA label for the sort order of this column when sorted descending.
    */
  var sortDescendingAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.undefined
}

object IColumn {
  @scala.inline
  def apply(
    key: String,
    minWidth: Double,
    name: String,
    ariaLabel: String = null,
    calculatedWidth: Int | Double = null,
    className: String = null,
    columnActionsMode: ColumnActionsMode = null,
    currentWidth: Int | Double = null,
    data: js.Any = null,
    fieldName: String = null,
    filterAriaLabel: String = null,
    getValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String = null,
    groupAriaLabel: String = null,
    headerClassName: String = null,
    iconClassName: String = null,
    iconName: String = null,
    isCollapsable: js.UndefOr[Boolean] = js.undefined,
    isCollapsible: js.UndefOr[Boolean] = js.undefined,
    isFiltered: js.UndefOr[Boolean] = js.undefined,
    isGrouped: js.UndefOr[Boolean] = js.undefined,
    isIconOnly: js.UndefOr[Boolean] = js.undefined,
    isMenuOpen: js.UndefOr[Boolean] = js.undefined,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    isPadded: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    isRowHeader: js.UndefOr[Boolean] = js.undefined,
    isSorted: js.UndefOr[Boolean] = js.undefined,
    isSortedDescending: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    onColumnClick: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit = null,
    onColumnResize: /* width */ js.UndefOr[Double] => Unit = null,
    onRender: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => _ = null,
    onRenderDivider: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], Element | Null]]) => Element | Null = null,
    sortAscendingAriaLabel: String = null,
    sortDescendingAriaLabel: String = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null
  ): IColumn = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (calculatedWidth != null) __obj.updateDynamic("calculatedWidth")(calculatedWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnActionsMode != null) __obj.updateDynamic("columnActionsMode")(columnActionsMode.asInstanceOf[js.Any])
    if (currentWidth != null) __obj.updateDynamic("currentWidth")(currentWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (filterAriaLabel != null) __obj.updateDynamic("filterAriaLabel")(filterAriaLabel.asInstanceOf[js.Any])
    if (getValueKey != null) __obj.updateDynamic("getValueKey")(js.Any.fromFunction3(getValueKey))
    if (groupAriaLabel != null) __obj.updateDynamic("groupAriaLabel")(groupAriaLabel.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (iconName != null) __obj.updateDynamic("iconName")(iconName.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsable)) __obj.updateDynamic("isCollapsable")(isCollapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsible)) __obj.updateDynamic("isCollapsible")(isCollapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(isFiltered)) __obj.updateDynamic("isFiltered")(isFiltered.asInstanceOf[js.Any])
    if (!js.isUndefined(isGrouped)) __obj.updateDynamic("isGrouped")(isGrouped.asInstanceOf[js.Any])
    if (!js.isUndefined(isIconOnly)) __obj.updateDynamic("isIconOnly")(isIconOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpen)) __obj.updateDynamic("isMenuOpen")(isMenuOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (!js.isUndefined(isPadded)) __obj.updateDynamic("isPadded")(isPadded.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowHeader)) __obj.updateDynamic("isRowHeader")(isRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(isSorted)) __obj.updateDynamic("isSorted")(isSorted.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortedDescending)) __obj.updateDynamic("isSortedDescending")(isSortedDescending.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction1(onColumnResize))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction3(onRender))
    if (onRenderDivider != null) __obj.updateDynamic("onRenderDivider")(js.Any.fromFunction2(onRenderDivider))
    if (sortAscendingAriaLabel != null) __obj.updateDynamic("sortAscendingAriaLabel")(sortAscendingAriaLabel.asInstanceOf[js.Any])
    if (sortDescendingAriaLabel != null) __obj.updateDynamic("sortDescendingAriaLabel")(sortDescendingAriaLabel.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
}

