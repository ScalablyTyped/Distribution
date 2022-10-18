package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnDragEndLocation extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnDragEndLocation")
@js.native
object ColumnDragEndLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnDragEndLocation & Double] = js.native
  
  /** Drag ended on header */
  @js.native
  sealed trait header
    extends StObject
       with ColumnDragEndLocation
  /* 2 */ val header: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.header & Double = js.native
  
  /** Drag ended outside of current list */
  @js.native
  sealed trait outside
    extends StObject
       with ColumnDragEndLocation
  /* 0 */ val outside: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.outside & Double = js.native
  
  /** Drag ended within current list */
  @js.native
  sealed trait surface
    extends StObject
       with ColumnDragEndLocation
  /* 1 */ val surface: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.surface & Double = js.native
}
