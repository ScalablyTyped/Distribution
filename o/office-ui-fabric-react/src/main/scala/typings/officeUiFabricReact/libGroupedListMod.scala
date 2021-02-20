package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Compact
import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typings.officeUiFabricReact.groupedListBaseMod.IGroupedListState
import typings.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupedListMod {
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
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
  class GroupedListBase protected ()
    extends typings.officeUiFabricReact.groupedListMod.GroupedListBase {
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
    @scala.inline
    def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListSection")
  @js.native
  class GroupedListSection protected ()
    extends typings.officeUiFabricReact.groupedListMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
}
