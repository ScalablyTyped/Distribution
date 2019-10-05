package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupFooterDotTypesMod.IGroupFooterProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupSpacerDotTypesMod.IGroupSpacerProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/GroupedList", JSImport.Namespace)
@js.native
object libGroupedListMod extends js.Object {
  @js.native
  class GroupedListBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsGroupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  
  val GroupFooter: StatelessComponent[IGroupFooterProps] = js.native
  val GroupHeader: StatelessComponent[IGroupHeaderProps] = js.native
  val GroupShowAll: StatelessComponent[IGroupShowAllProps] = js.native
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  val GroupedList: StatelessComponent[IGroupedListProps] = js.native
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    var defaultProps: Anon_Compact = js.native
  }
  
}

