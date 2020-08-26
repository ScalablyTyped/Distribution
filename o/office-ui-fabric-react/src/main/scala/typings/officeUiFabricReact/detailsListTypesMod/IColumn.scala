package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends js.Object {
  /**
    * Accessible label for the column. The column name will still be used as the primary label,
    * but this text (if specified) will be read after the column name.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /** Internal only value. */
  var calculatedWidth: js.UndefOr[Double] = js.native
  /** Class name to apply to the column cell within each row. */
  var className: js.UndefOr[String] = js.native
  /**
    * Defines how the column's header should render.
    * @defaultvalue ColumnActionsMode.clickable
    */
  var columnActionsMode: js.UndefOr[ColumnActionsMode] = js.native
  /**
    * Internal only value.
    * Remembers the actual width of the column in any case.
    * `calculatedWidth` is only saved when it's defined by user, not for justified calculations.
    */
  var currentWidth: js.UndefOr[Double] = js.native
  /** Arbitrary data passthrough which can be used by the caller. */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The field to pull the text value from for the column.
    * Can be unset if a custom `onRender` method is provided.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Accessible label for the status of this column when filtered. */
  var filterAriaLabel: js.UndefOr[String] = js.native
  /** Custom override for the parent list's `getCellValueKey`. */
  var getValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      String
    ]
  ] = js.native
  /** Accessible label for the status of this column when grouped. */
  var groupAriaLabel: js.UndefOr[String] = js.native
  /** Class name to apply to the column header cell. */
  var headerClassName: js.UndefOr[String] = js.native
  /** Class name for the icon within the header. */
  var iconClassName: js.UndefOr[String] = js.native
  /** Custom icon to use in the column header. */
  var iconName: js.UndefOr[String] = js.native
  /**
    * If true, allow the column to be collapsed when rendered in justified layout.
    * @deprecated Use `isCollapsible`
    */
  var isCollapsable: js.UndefOr[Boolean] = js.native
  /** If true, allow the column to be collapsed when rendered in justified layout. */
  var isCollapsible: js.UndefOr[Boolean] = js.native
  /** Whether the list is filtered by this column. If true, shows a filter icon next to this column's name. */
  var isFiltered: js.UndefOr[Boolean] = js.native
  /** Whether the list is grouped by this column. If true, shows a grouped icon next to this column's name. */
  var isGrouped: js.UndefOr[Boolean] = js.native
  /**
    * Whether only the icon should be displayed in the column header.
    * If true, the column name and dropdown chevron will not be displayed.
    */
  var isIconOnly: js.UndefOr[Boolean] = js.native
  /** Whether a dropdown menu is open so that the appropriate ARIA attributes are rendered. */
  var isMenuOpen: js.UndefOr[Boolean] = js.native
  /** Determines if the column can render multi-line text. */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /** If true, add additional LTR padding-right to column and cells. */
  var isPadded: js.UndefOr[Boolean] = js.native
  /** Determines if the column can be resized. */
  var isResizable: js.UndefOr[Boolean] = js.native
  /** Whether the column is a header for the given row. There should be only one column with this set to true. */
  var isRowHeader: js.UndefOr[Boolean] = js.native
  /** Determines if the column is currently sorted. Renders a sort arrow in the column header. */
  var isSorted: js.UndefOr[Boolean] = js.native
  /** Determines if the sort arrow is pointed down (descending) or up. */
  var isSortedDescending: js.UndefOr[Boolean] = js.native
  /** A unique key for identifying the column. */
  var key: String = js.native
  /** Maximum width for the column, if stretching is allowed in justified scenarios. */
  var maxWidth: js.UndefOr[Double] = js.native
  /** Minimum width for the column. */
  var minWidth: Double = js.native
  /** Name to render on the column header. */
  var name: String = js.native
  /** Callback for when the user clicks on the column header. */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ this.type, Unit]
  ] = js.native
  /** Callback for when the user opens the column header context menu. */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[this.type], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.native
  /**
    * Callback for when the column is resized (`width` is the current width).
    *
    * Prefer this over `DetailsList`'s `onColumnResize` if you require the `IColumn` to report its width
    * after every resize event. Consider debouncing the callback if resize events occur frequently.
    */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
  /** Custom renderer for cell content, instead of the default text rendering. */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      _
    ]
  ] = js.native
  /** Custom renderer for column header divider. */
  var onRenderDivider: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.native
  /**
    * Accessible label for indicating that the list is sorted by this column in ascending order.
    * This will be read after the main column header label.
    */
  var sortAscendingAriaLabel: js.UndefOr[String] = js.native
  /**
    * Accessible label for indicating that the list is sorted by this column in descending order.
    * This will be read after the main column header label.
    */
  var sortDescendingAriaLabel: js.UndefOr[String] = js.native
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
}

object IColumn {
  @scala.inline
  def apply(key: String, minWidth: Double, name: String): IColumn = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setCalculatedWidth(value: Double): Self = this.set("calculatedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedWidth: Self = this.set("calculatedWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColumnActionsMode(value: ColumnActionsMode): Self = this.set("columnActionsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnActionsMode: Self = this.set("columnActionsMode", js.undefined)
    @scala.inline
    def setCurrentWidth(value: Double): Self = this.set("currentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentWidth: Self = this.set("currentWidth", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFilterAriaLabel(value: String): Self = this.set("filterAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterAriaLabel: Self = this.set("filterAriaLabel", js.undefined)
    @scala.inline
    def setGetValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = this.set("getValueKey", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetValueKey: Self = this.set("getValueKey", js.undefined)
    @scala.inline
    def setGroupAriaLabel(value: String): Self = this.set("groupAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupAriaLabel: Self = this.set("groupAriaLabel", js.undefined)
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    @scala.inline
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
    @scala.inline
    def setIsCollapsable(value: Boolean): Self = this.set("isCollapsable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCollapsable: Self = this.set("isCollapsable", js.undefined)
    @scala.inline
    def setIsCollapsible(value: Boolean): Self = this.set("isCollapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCollapsible: Self = this.set("isCollapsible", js.undefined)
    @scala.inline
    def setIsFiltered(value: Boolean): Self = this.set("isFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFiltered: Self = this.set("isFiltered", js.undefined)
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGrouped: Self = this.set("isGrouped", js.undefined)
    @scala.inline
    def setIsIconOnly(value: Boolean): Self = this.set("isIconOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIconOnly: Self = this.set("isIconOnly", js.undefined)
    @scala.inline
    def setIsMenuOpen(value: Boolean): Self = this.set("isMenuOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMenuOpen: Self = this.set("isMenuOpen", js.undefined)
    @scala.inline
    def setIsMultiline(value: Boolean): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
    @scala.inline
    def setIsPadded(value: Boolean): Self = this.set("isPadded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPadded: Self = this.set("isPadded", js.undefined)
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResizable: Self = this.set("isResizable", js.undefined)
    @scala.inline
    def setIsRowHeader(value: Boolean): Self = this.set("isRowHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRowHeader: Self = this.set("isRowHeader", js.undefined)
    @scala.inline
    def setIsSorted(value: Boolean): Self = this.set("isSorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSorted: Self = this.set("isSorted", js.undefined)
    @scala.inline
    def setIsSortedDescending(value: Boolean): Self = this.set("isSortedDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortedDescending: Self = this.set("isSortedDescending", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setOnColumnClick(value: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], IColumn) => Unit): Self = this.set("onColumnClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnClick: Self = this.set("onColumnClick", js.undefined)
    @scala.inline
    def setOnColumnContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onColumnContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnContextMenu: Self = this.set("onColumnContextMenu", js.undefined)
    @scala.inline
    def setOnColumnResize(value: /* width */ js.UndefOr[Double] => Unit): Self = this.set("onColumnResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnResize: Self = this.set("onColumnResize", js.undefined)
    @scala.inline
    def setOnRender(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => _
    ): Self = this.set("onRender", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setOnRenderDivider(
      value: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDivider", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderDivider: Self = this.set("onRenderDivider", js.undefined)
    @scala.inline
    def setSortAscendingAriaLabel(value: String): Self = this.set("sortAscendingAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAscendingAriaLabel: Self = this.set("sortAscendingAriaLabel", js.undefined)
    @scala.inline
    def setSortDescendingAriaLabel(value: String): Self = this.set("sortDescendingAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDescendingAriaLabel: Self = this.set("sortDescendingAriaLabel", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

