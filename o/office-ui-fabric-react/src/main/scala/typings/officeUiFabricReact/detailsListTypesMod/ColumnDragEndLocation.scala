package typings.officeUiFabricReact.detailsListTypesMod

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
  /* 2 */ val header: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header & Double = js.native
  
  /** Drag ended outside of current list */
  @js.native
  sealed trait outside
    extends StObject
       with ColumnDragEndLocation
  /* 0 */ val outside: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside & Double = js.native
  
  /** Drag ended within current list */
  @js.native
  sealed trait surface
    extends StObject
       with ColumnDragEndLocation
  /* 1 */ val surface: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface & Double = js.native
}
