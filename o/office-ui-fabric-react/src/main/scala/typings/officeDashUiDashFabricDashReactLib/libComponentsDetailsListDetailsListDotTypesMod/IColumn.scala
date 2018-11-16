package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumn extends js.Object {
  /**
       * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
       * If none is specified, the arai-label attribute will contain the column name
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Internal only value.
       */
  var calculatedWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * An optional class name to stick on the column cell within each row.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
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
  var currentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Arbitrary data passthrough which can be used by the caller.
       */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
       * The field to pull the text value from for the column. This can be null if a custom
       * onRender method is provided.
       */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ARIA label for the status of this column when filtered.
       */
  var filterAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ARIA label for the status of this column when grouped.
       */
  var groupAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An optional class name to stick on the column cell within each header.
       */
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Class name to add to the Icon component.
       */
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional iconName to use for the column header.
       */
  var iconName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If specified will allow the column to be collapsed when rendered in justified layout.
       */
  var isCollapsable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if the column is filtered, and if so shows a filter icon.
       */
  var isFiltered: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set will show a grouped icon next to the column header name.
       */
  var isGrouped: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not only the icon is used in the column header.
       * Set this to true so the column name and dropdown chevron are not displayed.
       */
  var isIconOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if the column can render multi-line text.
       */
  var isMultiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set, will add additional LTR padding-right to column and cells.
       */
  var isPadded: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if the column can be resized.
       */
  var isResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional flag on whether the column is a header for the given row. There should be only one column with
       * row header set to true.
       * @defaultvalue false
       */
  var isRowHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if the column is currently sorted. Renders a sort arrow in the column header.
       */
  var isSorted: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if the arrow is pointed down (descending) or up.
       */
  var isSortedDescending: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A unique key for identifying the column.
       */
  var key: java.lang.String
  /**
       * Maximum width for the column, if stretching is allowed in justified scenarios.
       */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Minimum width for the column.
       */
  var minWidth: scala.Double
  /**
       * Name to render on the column header.
       */
  var name: java.lang.String
  /**
       * If provided, will be executed when the user clicks on the column header.
       */
  var onColumnClick: js.UndefOr[
    js.Function2[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* column */ IColumn, 
      _
    ]
  ] = js.undefined
  /**
       * If provided, will be executed when the user accesses the contextmenu on a column header.
       */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      _
    ]
  ] = js.undefined
  /**
       * If provided, will be executed when the column is resized with the column's current width.
       * Prefer this callback over `DetailsList` `onColumnResize` if you require the `IColumn` to
       * report its width after every resize event. Consider debouncing the callback if resize events
       * occur frequently.
       */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /**
       * If provided uses this method to render custom cell content, rather than the default text rendering.
       */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* column */ js.UndefOr[IColumn], 
      _
    ]
  ] = js.undefined
  /**
       * If provider, can be used to render a custom column header divider
       */
  var onRenderDivider: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnProps
    ]
  ] = js.undefined
  /**
       * ARIA label for the sort order of this column when sorted ascending.
       */
  var sortAscendingAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ARIA label for the sort order of this column when sorted descending.
       */
  var sortDescendingAriaLabel: js.UndefOr[java.lang.String] = js.undefined
}

