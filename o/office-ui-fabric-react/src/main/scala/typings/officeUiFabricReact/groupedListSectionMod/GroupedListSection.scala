package typings.officeUiFabricReact.groupedListSectionMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListSection", "GroupedListSection")
@js.native
class GroupedListSection protected ()
  extends Component[IGroupedListSectionProps, IGroupedListSectionState, js.Any] {
  def this(props: IGroupedListSectionProps) = this()
  var _dragDropSubscription: js.Any = js.native
  var _events: js.Any = js.native
  /**
    * get the correct css class to reflect the dropping state for a given group
    *
    * If the group is the current drop target, return the default dropping class name
    * Otherwise, return '';
    *
    */
  var _getDroppingClassName: js.Any = js.native
  /**
    * collect all the data we need to enable drag/drop for a group
    */
  var _getGroupDragDropOptions: js.Any = js.native
  var _getGroupKey: js.Any = js.native
  var _id: js.Any = js.native
  var _list: js.Any = js.native
  var _onRenderGroup: js.Any = js.native
  var _onRenderGroupCell: js.Any = js.native
  var _onRenderGroupFooter: js.Any = js.native
  var _onRenderGroupHeader: js.Any = js.native
  var _onRenderGroupShowAll: js.Any = js.native
  var _onSelectionChange: js.Any = js.native
  var _renderSubGroup: js.Any = js.native
  var _returnOne: js.Any = js.native
  var _root: js.Any = js.native
  /**
    * update groupIsDropping state based on the input value, which is used to change style during drag and drop
    *
    * @param newValue - new isDropping state value
    * @param event - the event trigger dropping state change which can be dragenter, dragleave etc
    */
  var _updateDroppingState: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGroupedListSection(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MGroupedListSection(previousProps: IGroupedListSectionProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGroupedListSection(): Unit = js.native
  def forceListUpdate(): Unit = js.native
}

