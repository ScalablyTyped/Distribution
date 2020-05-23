package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typings.officeUiFabricReact.gridTypesMod.IGridProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typings.officeUiFabricReact.gridMod.GridCell[T, P]
  
  val Grid: FunctionComponent[IGridProps] = js.native
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: Disabled = js.native
  }
  
}

