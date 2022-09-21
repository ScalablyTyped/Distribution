package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnFilterIconProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn extends StObject {
  
  /**
    * Accessible label for the column. The column name will still be used as the primary label,
    * but this text (if specified) will be read after the column name.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  /** Internal only value. */
  var calculatedWidth: js.UndefOr[Double] = js.undefined
  
  /** Class name to apply to the column cell within each row. */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Defines how the column's header should render.
    * @defaultvalue ColumnActionsMode.clickable
    */
  var columnActionsMode: js.UndefOr[ColumnActionsMode] = js.undefined
  
  /**
    * Internal only value.
    * Remembers the actual width of the column in any case.
    * `calculatedWidth` is only saved when it's defined by user, not for justified calculations.
    */
  var currentWidth: js.UndefOr[Double] = js.undefined
  
  /** Arbitrary data passthrough which can be used by the caller. */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * The field to pull the text value from for the column.
    * Can be unset if a custom `onRender` method is provided.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the status of this column when filtered. */
  var filterAriaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, the width of the column is a portion of the available space equal to this value divided by the sum
    * of all proportional column widths in the list. For example, if there is a list with two proportional columns that
    * have widths of 1 and 3, they will respectively occupy (1/4) = 25% and (3/4) = 75% of the remaining space. Note that
    * this relies on viewport measures and will not work well with skipViewportMeasures.
    */
  var flexGrow: js.UndefOr[Double] = js.undefined
  
  /** Custom override for the parent list's `getCellValueKey`. */
  var getValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      String
    ]
  ] = js.undefined
  
  /** Accessible label for the status of this column when grouped. */
  var groupAriaLabel: js.UndefOr[String] = js.undefined
  
  /** Class name to apply to the column header cell. */
  var headerClassName: js.UndefOr[String] = js.undefined
  
  /** Class name for the icon within the header. */
  var iconClassName: js.UndefOr[String] = js.undefined
  
  /** Custom icon to use in the column header. */
  var iconName: js.UndefOr[String] = js.undefined
  
  /**
    * If true, allow the column to be collapsed when rendered in justified layout.
    * @deprecated Use `isCollapsible`
    */
  var isCollapsable: js.UndefOr[Boolean] = js.undefined
  
  /** If true, allow the column to be collapsed when rendered in justified layout. */
  var isCollapsible: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the list is filtered by this column. If true, shows a filter icon next to this column's name. */
  var isFiltered: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the list is grouped by this column. If true, shows a grouped icon next to this column's name. */
  var isGrouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether only the icon should be displayed in the column header.
    * If true, the column name and dropdown chevron will not be displayed.
    */
  var isIconOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Whether a dropdown menu is open so that the appropriate ARIA attributes are rendered. */
  var isMenuOpen: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if the column can render multi-line text. */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  
  /** If true, add additional LTR padding-right to column and cells. */
  var isPadded: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if the column can be resized. */
  var isResizable: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the column is a header for the given row. There should be only one column with this set to true. */
  var isRowHeader: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if the column is currently sorted. Renders a sort arrow in the column header. */
  var isSorted: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if the sort arrow is pointed down (descending) or up. */
  var isSortedDescending: js.UndefOr[Boolean] = js.undefined
  
  /** A unique key for identifying the column. */
  var key: String
  
  /** Maximum width for the column, if stretching is allowed in justified scenarios. */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /** Minimum width for the column. */
  var minWidth: Double
  
  /** Name to render on the column header. */
  var name: String
  
  /** Callback for when the user clicks on the column header. */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ this.type, Unit]
  ] = js.undefined
  
  /** Callback for when the user opens the column header context menu. */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[this.type], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Callback for when the column is resized (`width` is the current width).
    *
    * Prefer this over `DetailsList`'s `onColumnResize` if you require the `IColumn` to report its width
    * after every resize event. Consider debouncing the callback if resize events occur frequently.
    */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** Custom renderer for cell content, instead of the default text rendering. */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      Any
    ]
  ] = js.undefined
  
  /** Custom renderer for column header divider. */
  var onRenderDivider: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.undefined
  
  /** Custom renderer for filter icon. */
  var onRenderFilterIcon: js.UndefOr[IRenderFunction[IDetailsColumnFilterIconProps]] = js.undefined
  
  /** Custom renderer for column header content, instead of the default text rendering. */
  var onRenderHeader: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.undefined
  
  /**
    * Accessible label for indicating that the list is sorted by this column in ascending order.
    * This will be read after the main column header label.
    */
  var sortAscendingAriaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Accessible label for indicating that the list is sorted by this column in descending order.
    * This will be read after the main column header label.
    */
  var sortDescendingAriaLabel: js.UndefOr[String] = js.undefined
  
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.undefined
  
  /**
    * If specified, the width of the column is a portion of the available space equal to this value divided by the sum
    * of all proportional column widths in the list. For example, if there is a list with two proportional columns that
    * have widths of 1 and 3, they will respectively occupy (1/4) = 25% and (2/4) = 75% of the remaining space. Note that
    * this relies on viewport measures and will not work well with skipViewportMeasures.
    */
  var targetWidthProportion: js.UndefOr[Double] = js.undefined
}
object IColumn {
  
  inline def apply(key: String, minWidth: Double, name: String): IColumn = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  extension [Self <: IColumn](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setCalculatedWidth(value: Double): Self = StObject.set(x, "calculatedWidth", value.asInstanceOf[js.Any])
    
    inline def setCalculatedWidthUndefined: Self = StObject.set(x, "calculatedWidth", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnActionsMode(value: ColumnActionsMode): Self = StObject.set(x, "columnActionsMode", value.asInstanceOf[js.Any])
    
    inline def setColumnActionsModeUndefined: Self = StObject.set(x, "columnActionsMode", js.undefined)
    
    inline def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
    
    inline def setCurrentWidthUndefined: Self = StObject.set(x, "currentWidth", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setFilterAriaLabel(value: String): Self = StObject.set(x, "filterAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setFilterAriaLabelUndefined: Self = StObject.set(x, "filterAriaLabel", js.undefined)
    
    inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setGetValueKey(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = StObject.set(x, "getValueKey", js.Any.fromFunction3(value))
    
    inline def setGetValueKeyUndefined: Self = StObject.set(x, "getValueKey", js.undefined)
    
    inline def setGroupAriaLabel(value: String): Self = StObject.set(x, "groupAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setGroupAriaLabelUndefined: Self = StObject.set(x, "groupAriaLabel", js.undefined)
    
    inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    inline def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    inline def setIsCollapsable(value: Boolean): Self = StObject.set(x, "isCollapsable", value.asInstanceOf[js.Any])
    
    inline def setIsCollapsableUndefined: Self = StObject.set(x, "isCollapsable", js.undefined)
    
    inline def setIsCollapsible(value: Boolean): Self = StObject.set(x, "isCollapsible", value.asInstanceOf[js.Any])
    
    inline def setIsCollapsibleUndefined: Self = StObject.set(x, "isCollapsible", js.undefined)
    
    inline def setIsFiltered(value: Boolean): Self = StObject.set(x, "isFiltered", value.asInstanceOf[js.Any])
    
    inline def setIsFilteredUndefined: Self = StObject.set(x, "isFiltered", js.undefined)
    
    inline def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    inline def setIsGroupedUndefined: Self = StObject.set(x, "isGrouped", js.undefined)
    
    inline def setIsIconOnly(value: Boolean): Self = StObject.set(x, "isIconOnly", value.asInstanceOf[js.Any])
    
    inline def setIsIconOnlyUndefined: Self = StObject.set(x, "isIconOnly", js.undefined)
    
    inline def setIsMenuOpen(value: Boolean): Self = StObject.set(x, "isMenuOpen", value.asInstanceOf[js.Any])
    
    inline def setIsMenuOpenUndefined: Self = StObject.set(x, "isMenuOpen", js.undefined)
    
    inline def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
    
    inline def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
    
    inline def setIsPadded(value: Boolean): Self = StObject.set(x, "isPadded", value.asInstanceOf[js.Any])
    
    inline def setIsPaddedUndefined: Self = StObject.set(x, "isPadded", js.undefined)
    
    inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
    
    inline def setIsRowHeader(value: Boolean): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
    
    inline def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
    
    inline def setIsSorted(value: Boolean): Self = StObject.set(x, "isSorted", value.asInstanceOf[js.Any])
    
    inline def setIsSortedDescending(value: Boolean): Self = StObject.set(x, "isSortedDescending", value.asInstanceOf[js.Any])
    
    inline def setIsSortedDescendingUndefined: Self = StObject.set(x, "isSortedDescending", js.undefined)
    
    inline def setIsSortedUndefined: Self = StObject.set(x, "isSorted", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnColumnClick(value: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], IColumn) => Unit): Self = StObject.set(x, "onColumnClick", js.Any.fromFunction2(value))
    
    inline def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
    
    inline def setOnColumnContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onColumnContextMenu", js.Any.fromFunction2(value))
    
    inline def setOnColumnContextMenuUndefined: Self = StObject.set(x, "onColumnContextMenu", js.undefined)
    
    inline def setOnColumnResize(value: /* width */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction1(value))
    
    inline def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
    
    inline def setOnRender(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => Any
    ): Self = StObject.set(x, "onRender", js.Any.fromFunction3(value))
    
    inline def setOnRenderDivider(
      value: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderDivider", js.Any.fromFunction2(value))
    
    inline def setOnRenderDividerUndefined: Self = StObject.set(x, "onRenderDivider", js.undefined)
    
    inline def setOnRenderFilterIcon(
      value: (/* props */ js.UndefOr[IDetailsColumnFilterIconProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnFilterIconProps], Element | Null]
        ]) => Element | Null
    ): Self = StObject.set(x, "onRenderFilterIcon", js.Any.fromFunction2(value))
    
    inline def setOnRenderFilterIconUndefined: Self = StObject.set(x, "onRenderFilterIcon", js.undefined)
    
    inline def setOnRenderHeader(
      value: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction2(value))
    
    inline def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setSortAscendingAriaLabel(value: String): Self = StObject.set(x, "sortAscendingAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingAriaLabelUndefined: Self = StObject.set(x, "sortAscendingAriaLabel", js.undefined)
    
    inline def setSortDescendingAriaLabel(value: String): Self = StObject.set(x, "sortDescendingAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingAriaLabelUndefined: Self = StObject.set(x, "sortDescendingAriaLabel", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTargetWidthProportion(value: Double): Self = StObject.set(x, "targetWidthProportion", value.asInstanceOf[js.Any])
    
    inline def setTargetWidthProportionUndefined: Self = StObject.set(x, "targetWidthProportion", js.undefined)
  }
}
