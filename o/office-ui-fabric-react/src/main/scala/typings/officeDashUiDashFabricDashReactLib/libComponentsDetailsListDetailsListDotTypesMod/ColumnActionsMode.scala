package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnActionsMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends js.Object {
  /**
    * Renders the column header is clickable.
    */
  @js.native
  sealed trait clickable
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode
  
  /**
    * Renders the column header as disabled.
    */
  @js.native
  sealed trait disabled
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode
  
  /**
    * Renders the column header ias clickable and displays the dropdown cheveron.
    */
  @js.native
  sealed trait hasDropdown
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode
  
  /* 1 */ val clickable: clickable with scala.Double = js.native
  /* 0 */ val disabled: disabled with scala.Double = js.native
  /* 2 */ val hasDropdown: hasDropdown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode with scala.Double
  ] = js.native
}

