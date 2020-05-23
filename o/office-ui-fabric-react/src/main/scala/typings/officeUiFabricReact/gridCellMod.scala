package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/grid/GridCell", JSImport.Namespace)
@js.native
object gridCellMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends Component[P, js.Object, js.Any] {
    var _onClick: js.Any = js.native
    var _onFocus: js.Any = js.native
    var _onMouseEnter: js.Any = js.native
    var _onMouseLeave: js.Any = js.native
    var _onMouseMove: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: Disabled = js.native
  }
  
}

