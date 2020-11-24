package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Compact
import typings.officeUiFabricReact.groupedListBaseMod.IGroupedListState
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends typings.officeUiFabricReact.libGroupedListMod.GroupedListBase {
  def this(props: IGroupedListProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react", "GroupedListBase")
@js.native
object GroupedListBase extends js.Object {
  
  var defaultProps: Compact = js.native
  
  def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
}
