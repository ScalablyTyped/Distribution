package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowFieldsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDetailsRowFieldsProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IDetailsRowFields] {
  var cellStyleProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
  ] = js.undefined
  /**
       * Index to start for the column
       */
  var columnStartIndex: scala.Double
  /**
       * Columns metadata
       */
  var columns: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
  ]
  /**
       * whether to render as a compact field
       */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Data source for this component
       */
  var item: js.Any
  /**
       * The item index of the collection for the DetailsList
       */
  var itemIndex: scala.Double
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
       * Required prop to be passed in from the parent DetailsRow a map of classNames and its mergestyle-created classNames
       */
  var rowClassNames: officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.IDetailsRowFieldsProps with js.Any
  /**
       * Whether to show shimmer
       */
  var shimmer: js.UndefOr[scala.Boolean] = js.undefined
}

