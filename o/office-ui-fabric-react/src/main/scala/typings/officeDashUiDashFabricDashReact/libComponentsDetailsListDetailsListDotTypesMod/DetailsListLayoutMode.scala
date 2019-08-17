package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DetailsListLayoutMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "DetailsListLayoutMode")
@js.native
object DetailsListLayoutMode extends js.Object {
  /**
    * Lets the user resize columns and makes not attempt to fit them.
    */
  @js.native
  sealed trait fixedColumns extends DetailsListLayoutMode
  
  /**
    * Manages which columns are visible, tries to size them according to their min/max rules and drops
    * off columns that can't fit and have isCollapsible set.
    */
  @js.native
  sealed trait justified extends DetailsListLayoutMode
  
  /* 0 */ val fixedColumns: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
  /* 1 */ val justified: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.justified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DetailsListLayoutMode with Double] = js.native
}

