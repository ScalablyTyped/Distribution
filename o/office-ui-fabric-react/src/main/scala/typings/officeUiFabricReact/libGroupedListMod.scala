package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Compact
import typings.officeUiFabricReact.libComponentsGroupedListGroupFooterDottypesMod.IGroupFooterProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupHeaderDottypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupShowAllDottypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupSpacerDottypesMod.IGroupSpacerProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDotbaseMod.IGroupedListState
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListSectionMod.IGroupedListSectionProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListV2DotbaseMod.IGroupedListV2State
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListV2DottypesMod.IGroupedListV2Props
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupedListMod {
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility & Double
      ] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.hidden & Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.visible & Double = js.native
  }
  
  inline def GetGroupCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetGroupCount")().asInstanceOf[Double]
  inline def GetGroupCount(groups: js.Array[IGroup]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetGroupCount")(groups.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupFooter")
  @js.native
  val GroupFooter: FunctionComponent[IGroupFooterProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupHeader")
  @js.native
  val GroupHeader: FunctionComponent[IGroupHeaderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupShowAll")
  @js.native
  val GroupShowAll: FunctionComponent[IGroupShowAllProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupSpacer")
  @js.native
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedList")
  @js.native
  val GroupedList: FunctionComponent[IGroupedListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase")
  @js.native
  open class GroupedListBase protected ()
    extends typings.officeUiFabricReact.libComponentsGroupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  /* static members */
  object GroupedListBase {
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase.defaultProps")
    @js.native
    def defaultProps: Compact = js.native
    inline def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListState]
  }
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListSection")
  @js.native
  open class GroupedListSection protected ()
    extends typings.officeUiFabricReact.libComponentsGroupedListMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListV2FC")
  @js.native
  val GroupedListV2FC: FC[IGroupedListV2Props] = js.native
  
  /**
    * NOTE: GroupedListV2 is "unstable" and meant for preview use. It passes
    * the same test suite as GroupedList but it is an entirely new implementation
    * so it may have bugs and implementation details may change without notice.
    *
    * GroupedListV2 is an API-compatible replacement for GroupedList with a new implementation
    * that addresses issues GroupedList has with virtualizing nested lists under certain
    * conditions.
    */
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListV2_unstable")
  @js.native
  val GroupedListV2Unstable: FunctionComponent[IGroupedListV2Props] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListV2Wrapper")
  @js.native
  open class GroupedListV2Wrapper protected ()
    extends typings.officeUiFabricReact.libComponentsGroupedListMod.GroupedListV2Wrapper {
    def this(props: IGroupedListV2Props) = this()
  }
  /* static members */
  object GroupedListV2Wrapper {
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListV2Wrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListV2Wrapper.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IGroupedListV2Props, previousState: IGroupedListV2State): IGroupedListV2State = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListV2State]
  }
}
