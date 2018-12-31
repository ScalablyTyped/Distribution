package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsItemProps extends js.Object {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
  ] = js.undefined
  /**
    * Column metadata
    */
  var columns: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
    ]
  ] = js.undefined
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[scala.Double] = js.undefined
  /**
    * How much to indent
    */
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection] = js.undefined
  /**
    * Selection mode
    */
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.undefined
  /**
    * View port of the virtualized list
    */
  var viewport: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithViewportMod.IViewport
  ] = js.undefined
}

