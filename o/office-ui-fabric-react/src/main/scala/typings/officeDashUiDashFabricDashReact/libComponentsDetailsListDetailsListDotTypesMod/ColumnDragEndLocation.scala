package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnDragEndLocation extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnDragEndLocation")
@js.native
object ColumnDragEndLocation extends js.Object {
  /**
    * Drag ended on Header
    */
  @js.native
  sealed trait header extends ColumnDragEndLocation
  
  /**
    * Drag ended outside of current list
    */
  @js.native
  sealed trait outside extends ColumnDragEndLocation
  
  /**
    * Drag ended on current List
    */
  @js.native
  sealed trait surface extends ColumnDragEndLocation
  
  /* 2 */ val header: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.header with Double = js.native
  /* 0 */ val outside: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.outside with Double = js.native
  /* 1 */ val surface: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.surface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnDragEndLocation with Double] = js.native
}

