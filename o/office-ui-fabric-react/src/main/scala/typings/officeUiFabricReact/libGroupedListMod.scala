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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/GroupedList", JSImport.Namespace)
@js.native
object libGroupedListMod extends js.Object {
  
  val GroupFooter: FunctionComponent[IGroupFooterProps] = js.native
  
  val GroupHeader: FunctionComponent[IGroupHeaderProps] = js.native
  
  val GroupShowAll: FunctionComponent[IGroupShowAllProps] = js.native
  
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  
  val GroupedList: FunctionComponent[IGroupedListProps] = js.native
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @js.native
  class GroupedListBase protected ()
    extends typings.officeUiFabricReact.groupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    
    var defaultProps: Compact = js.native
    
    def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
  }
  
  @js.native
  class GroupedListSection protected ()
    extends typings.officeUiFabricReact.groupedListMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
}
