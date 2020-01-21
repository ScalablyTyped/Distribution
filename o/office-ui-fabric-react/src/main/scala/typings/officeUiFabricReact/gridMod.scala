package typings.officeUiFabricReact

import typings.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typings.officeUiFabricReact.gridTypesMod.IGridProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typings.officeUiFabricReact.gridCellMod.GridCell[T, P]
  
  val Grid: StatelessComponent[IGridProps] = js.native
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: AnonDisabled = js.native
  }
  
}

