package typings.officeUiFabricReact.modalBaseMod

import typings.officeUiFabricReact.modalTypesMod.IModal
import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
class ModalBase protected ()
  extends Component[IModalProps, IDialogState, js.Any]
     with IModal {
  def this(props: IModalProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MModalBase(newProps: IModalProps): Unit = js.native
  
  var _allowScrollOnModal: js.Any = js.native
  
  var _allowTouchBodyScroll: js.Any = js.native
  
  var _async: js.Any = js.native
  
  var _events: js.Any = js.native
  
  var _focusTrapZone: js.Any = js.native
  
  /**
    * Clamps the position coordinates to the maximum/minimum value specified in props
    */
  var _getClampedPosition: js.Any = js.native
  
  var _getClampedPositionX: js.Any = js.native
  
  var _getClampedPositionY: js.Any = js.native
  
  var _getMoveDelta: js.Any = js.native
  
  var _hasRegisteredKeyUp: js.Any = js.native
  
  var _lastSetX: js.Any = js.native
  
  var _lastSetY: js.Any = js.native
  
  var _maxClampedPosition: js.Any = js.native
  
  var _minClampedPosition: js.Any = js.native
  
  var _onDrag: js.Any = js.native
  
  var _onDragStart: js.Any = js.native
  
  var _onDragStop: js.Any = js.native
  
  var _onEnterKeyboardMoveMode: js.Any = js.native
  
  var _onExitKeyboardMoveMode: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onKeyUp: js.Any = js.native
  
  var _onModalClose: js.Any = js.native
  
  var _onModalCloseTimer: js.Any = js.native
  
  var _onModalContextMenuClose: js.Any = js.native
  
  var _registerForKeyUp: js.Any = js.native
  
  var _registerInitialModalPosition: js.Any = js.native
  
  var _scrollableContent: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MModalBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MModalBase(prevProps: IModalProps, prevState: IDialogState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MModalBase(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
object ModalBase extends js.Object {
  
  var defaultProps: IModalProps = js.native
}
