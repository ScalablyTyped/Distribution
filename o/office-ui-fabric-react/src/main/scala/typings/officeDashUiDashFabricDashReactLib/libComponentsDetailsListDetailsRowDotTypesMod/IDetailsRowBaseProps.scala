package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowBaseProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IDetailsRow]
     with IDetailsItemProps {
  /**
    * Check button's aria label
    */
  var checkButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class name for the checkbox cell
    */
  var checkboxCellClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overriding class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Collapse all visibility
    */
  var collapseAllVisibility: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
  ] = js.undefined
  /**
    * Whether to render in compact mode
    */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Handling drag and drop events
    */
  var dragDropEvents: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropEvents
  ] = js.undefined
  /**
    * Helper for the drag and drop
    */
  var dragDropHelper: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropHelper
  ] = js.undefined
  /**
    * A list of events to register
    */
  var eventsToRegister: js.UndefOr[js.Array[officeDashUiDashFabricDashReactLib.Anon_CallbackEvent]] = js.undefined
  /**
    * Callback for getting the row aria-describedby
    */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  /**
    * Callback for getting the row aria label
    */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  /**
    * Data source for this component
    */
  var item: js.Any
  /**
    * Index of the collection of items of the DetailsList
    */
  var itemIndex: scala.Double
  /**
    * Callback for did mount for parent
    */
  var onDidMount: js.UndefOr[
    js.Function1[
      /* row */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotBaseMod.DetailsRowBase
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback for rendering a checkbox
    */
  var onRenderCheck: js.UndefOr[
    js.Function1[
      /* props */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  /**
    * Callback for rendering an item column
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* column */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
      ], 
      _
    ]
  ] = js.undefined
  /**
    * Callback for will mount for parent
    */
  var onWillUnmount: js.UndefOr[
    js.Function1[
      /* row */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotBaseMod.DetailsRowBase
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * DOM element into which to render row field
    */
  var rowFieldsAs: js.UndefOr[
    (reactLib.reactMod.ReactNs.StatelessComponent[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowFieldsDotTypesMod.IDetailsRowFieldsProps
    ]) | (reactLib.reactMod.ReactNs.ComponentClass[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowFieldsDotTypesMod.IDetailsRowFieldsProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ])
  ] = js.undefined
  /**
    * Whether to render shimmer
    */
  var shimmer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overriding styles to this row
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]
  ] = js.undefined
  /**
    * Theme provided by styled() function
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[scala.Boolean] = js.undefined
}

