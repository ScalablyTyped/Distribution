package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.OnRenderCell
import typings.officeUiFabricReact.listListMod.IListState
import typings.officeUiFabricReact.listTypesMod.IListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "List")
@js.native
class List[T] protected ()
  extends typings.officeUiFabricReact.libListMod.List[T] {
  def this(props: IListProps[T]) = this()
}
/* static members */
object List {
  
  @JSImport("office-ui-fabric-react", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "List.defaultProps")
  @js.native
  def defaultProps: OnRenderCell = js.native
  inline def defaultProps_=(x: OnRenderCell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps[T](nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IListState[T]]
}
