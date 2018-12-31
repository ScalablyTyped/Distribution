package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps, 
      IGroupedListState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupedList {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps) = this()
  var _classNames: js.Any = js.native
  var _getPageHeight: js.Any = js.native
  var _getPageSpecification: js.Any = js.native
  var _isSomeGroupExpanded: js.Any = js.native
  var _list: js.Any = js.native
  var _onToggleCollapse: js.Any = js.native
  var _onToggleSelectGroup: js.Any = js.native
  var _onToggleSummarize: js.Any = js.native
  var _renderGroup: js.Any = js.native
  /* private */ def _computeIsSomeGroupExpanded(groups: js.Any): js.Any = js.native
  /* private */ def _forceListUpdates(): js.Any = js.native
  /* private */ def _forceListUpdates(groups: js.Any): js.Any = js.native
  /* private */ def _getGroupKey(group: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _getGroupNestingDepth(): js.Any = js.native
  /* private */ def _returnOne(): js.Any = js.native
  /* private */ def _updateIsSomeGroupExpanded(): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MGroupedListBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps
  ): scala.Unit = js.native
  /**
    * Force the component to update.
    */
  /* InferMemberOverrides */
  override def forceUpdate(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
object GroupedListBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_IsHeaderVisible = js.native
}

