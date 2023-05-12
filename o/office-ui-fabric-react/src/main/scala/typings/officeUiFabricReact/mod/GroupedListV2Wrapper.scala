package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.libComponentsGroupedListGroupedListV2DotbaseMod.IGroupedListV2State
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListV2DottypesMod.IGroupedListV2Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "GroupedListV2Wrapper")
@js.native
open class GroupedListV2Wrapper protected ()
  extends typings.officeUiFabricReact.libGroupedListMod.GroupedListV2Wrapper {
  def this(props: IGroupedListV2Props) = this()
}
/* static members */
object GroupedListV2Wrapper {
  
  @JSImport("office-ui-fabric-react", "GroupedListV2Wrapper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "GroupedListV2Wrapper.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: IGroupedListV2Props, previousState: IGroupedListV2State): IGroupedListV2State = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListV2State]
}
