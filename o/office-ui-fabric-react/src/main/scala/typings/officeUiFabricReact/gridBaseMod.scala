package typings.officeUiFabricReact

import typings.officeUiFabricReact.gridTypesMod.IGrid
import typings.officeUiFabricReact.gridTypesMod.IGridProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/grid/Grid.base", JSImport.Namespace)
@js.native
object gridBaseMod extends js.Object {
  @js.native
  class GridBase protected ()
    extends Component[IGridProps, js.Object, js.Any]
       with IGrid {
    def this(props: IGridProps) = this()
    var _id: js.Any = js.native
  }
  
}

