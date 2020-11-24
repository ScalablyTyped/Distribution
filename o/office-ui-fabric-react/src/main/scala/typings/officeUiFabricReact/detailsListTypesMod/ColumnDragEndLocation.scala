package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnDragEndLocation extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnDragEndLocation")
@js.native
object ColumnDragEndLocation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnDragEndLocation with Double] = js.native
  
  /** Drag ended on header */
  @js.native
  sealed trait header extends ColumnDragEndLocation
  /* 2 */ @js.native
  object header extends TopLevel[header with Double]
  
  /** Drag ended outside of current list */
  @js.native
  sealed trait outside extends ColumnDragEndLocation
  /* 0 */ @js.native
  object outside extends TopLevel[outside with Double]
  
  /** Drag ended within current list */
  @js.native
  sealed trait surface extends ColumnDragEndLocation
  /* 1 */ @js.native
  object surface extends TopLevel[surface with Double]
}
