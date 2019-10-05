package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase")
@js.native
class DetailsRowBase protected ()
  extends Component[IDetailsRowBaseProps, IDetailsRowState, js.Any] {
  def this(props: IDetailsRowBaseProps) = this()
  var _cellMeasurer: js.Any = js.native
  var _classNames: js.Any = js.native
  var _dragDropSubscription: js.Any = js.native
  var _droppingClassNames: js.Any = js.native
  var _events: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _getRowDragDropOptions: js.Any = js.native
  var _getSelectionState: js.Any = js.native
  /** Whether this.props.onDidMount has been called */
  var _onDidMountCalled: js.Any = js.native
  var _onRootRef: js.Any = js.native
  var _onSelectionChanged: js.Any = js.native
  var _root: js.Any = js.native
  var _rowClassNames: js.Any = js.native
  /**
    * update isDropping state based on the input value, which is used to change style during drag and drop
    *
    * when change to true, that means drag enter. we will add default dropping class name
    * or the custom dropping class name (return result from onDragEnter) to the root elemet.
    *
    * when change to false, that means drag leave. we will remove the dropping class name from root element.
    *
    * @param newValue - New isDropping state value
    * @param event - The event trigger dropping state change which can be dragenter, dragleave etc
    */
  var _updateDroppingState: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MDetailsRowBase(newProps: IDetailsRowBaseProps): Unit = js.native
  /* protected */ def _onRenderCheck(props: IDetailsRowCheckProps): Element = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDetailsRowBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDetailsRowBase(previousProps: IDetailsRowBaseProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDetailsRowBase(): Unit = js.native
  def focus(): Boolean = js.native
  def focus(forceIntoFirstElement: Boolean): Boolean = js.native
  /**
    * measure cell at index. and call the call back with the measured cell width when finish measure
    *
    * @param index - The cell index
    * @param onMeasureDone - The call back function when finish measure
    */
  def measureCell(index: Double, onMeasureDone: js.Function1[/* width */ Double, Unit]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDetailsRowBase(nextProps: IDetailsRowBaseProps, nextState: IDetailsRowState): Boolean = js.native
}

