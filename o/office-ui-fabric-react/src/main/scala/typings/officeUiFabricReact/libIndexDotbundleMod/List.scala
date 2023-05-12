package typings.officeUiFabricReact.libIndexDotbundleMod

import typings.officeUiFabricReact.anon.OnRenderCell
import typings.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typings.officeUiFabricReact.libComponentsListListMod.IListState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "List")
@js.native
open class List[T] protected ()
  extends typings.officeUiFabricReact.mod.List[T] {
  def this(props: IListProps[T]) = this()
}
/* static members */
object List {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "List.defaultProps")
  @js.native
  def defaultProps: OnRenderCell = js.native
  inline def defaultProps_=(x: OnRenderCell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps[U](nextProps: IListProps[U], previousState: IListState[U]): IListState[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IListState[U]]
}
