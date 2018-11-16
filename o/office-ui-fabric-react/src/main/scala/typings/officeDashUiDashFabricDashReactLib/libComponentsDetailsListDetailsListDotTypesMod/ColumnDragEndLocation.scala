package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

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
  sealed trait header
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation
  
  /**
       * Drag ended outside of current list
       */
  @js.native
  sealed trait outside
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation
  
  /**
       * Drag ended on current List
       */
  @js.native
  sealed trait surface
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation
  
  /* 2 */ val header: header with scala.Double = js.native
  /* 0 */ val outside: outside with scala.Double = js.native
  /* 1 */ val surface: surface with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation with scala.Double
  ] = js.native
}

