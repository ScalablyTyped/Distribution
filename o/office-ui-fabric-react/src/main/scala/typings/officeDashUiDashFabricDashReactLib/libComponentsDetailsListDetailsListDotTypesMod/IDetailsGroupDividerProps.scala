package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps */ trait IDetailsGroupDividerProps
  extends officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupDividerProps {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
  ] = js.undefined
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection] = js.undefined
}

