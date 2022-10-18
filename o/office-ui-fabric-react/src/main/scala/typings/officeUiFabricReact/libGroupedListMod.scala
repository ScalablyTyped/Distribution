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
}
