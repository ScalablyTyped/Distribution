package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.OnRenderCell
import typings.officeUiFabricReact.listListMod.IListState
import typings.officeUiFabricReact.listTypesMod.IListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var defaultProps: OnRenderCell = js.native
  
  def getDerivedStateFromProps[T](nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = js.native
}
