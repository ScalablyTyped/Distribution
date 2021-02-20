package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.Compact
import typings.officeUiFabricReact.groupedListBaseMod.IGroupedListState
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends typings.officeUiFabricReact.mod.GroupedListBase {
  def this(props: IGroupedListProps) = this()
}
/* static members */
object GroupedListBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase.defaultProps")
  @js.native
  def defaultProps: Compact = js.native
  @scala.inline
  def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
}
