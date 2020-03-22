package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typings.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/GroupedList", JSImport.Namespace)
@js.native
object groupedListMod extends js.Object {
  @js.native
  class GroupedListBase protected ()
    extends typings.officeUiFabricReact.groupedListBaseMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  
  @js.native
  class GroupedListSection protected ()
    extends typings.officeUiFabricReact.groupedListSectionMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
  
  val GroupFooter: FunctionComponent[IGroupFooterProps] = js.native
  val GroupHeader: FunctionComponent[IGroupHeaderProps] = js.native
  val GroupShowAll: FunctionComponent[IGroupShowAllProps] = js.native
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  val GroupedList: FunctionComponent[IGroupedListProps] = js.native
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    var defaultProps: AnonCompact = js.native
  }
  
}

