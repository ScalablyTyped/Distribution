package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotBaseMod

import typings.officeDashUiDashFabricDashReact.Anon_Compact
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedList
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends Component[IGroupedListProps, IGroupedListState, js.Any]
     with IGroupedList {
  def this(props: IGroupedListProps) = this()
  var _classNames: js.Any = js.native
  var _computeIsSomeGroupExpanded: js.Any = js.native
  var _forceListUpdates: js.Any = js.native
  var _getDefaultGroupItemLimit: js.Any = js.native
  var _getGroupHeight: js.Any = js.native
  var _getGroupItemLimit: js.Any = js.native
  var _getGroupKey: js.Any = js.native
  var _getGroupNestingDepth: js.Any = js.native
  var _getPageHeight: js.Any = js.native
  var _getPageSpecification: js.Any = js.native
  var _isSomeGroupExpanded: js.Any = js.native
  var _list: js.Any = js.native
  var _onToggleCollapse: js.Any = js.native
  var _onToggleSelectGroup: js.Any = js.native
  var _onToggleSummarize: js.Any = js.native
  var _renderGroup: js.Any = js.native
  var _returnOne: js.Any = js.native
  var _setGroupsCollapsedState: js.Any = js.native
  var _updateIsSomeGroupExpanded: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MGroupedListBase(newProps: IGroupedListProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGroupedListBase(): Unit = js.native
  /* InferMemberOverrides */
  override def forceUpdate(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
object GroupedListBase extends js.Object {
  var defaultProps: Anon_Compact = js.native
}

