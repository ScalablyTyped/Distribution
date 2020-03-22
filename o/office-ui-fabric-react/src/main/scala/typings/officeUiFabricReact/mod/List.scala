package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.AnonOnRenderCell
import typings.officeUiFabricReact.listTypesMod.IListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "List")
@js.native
class List[T] protected ()
  extends typings.officeUiFabricReact.libListMod.List[T] {
  def this(props: IListProps[T]) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "List")
@js.native
object List extends js.Object {
  var defaultProps: AnonOnRenderCell = js.native
}

