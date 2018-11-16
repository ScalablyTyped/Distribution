package typings
package officeDashUiDashFabricDashReactLib.libComponentsModalModalDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
class ModalBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps, 
      IDialogState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModal {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps) = this()
  var _allowScrollOnModal: js.Any = js.native
  var _focusTrapZone: js.Any = js.native
  var _onModalCloseTimer: js.Any = js.native
  var _scrollableContent: js.Any = js.native
  /* private */ def _onModalClose(): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MModalBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps,
    prevState: IDialogState
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MModalBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps): scala.Unit = js.native
  /**
       * Sets focus on the first focusable, or configured, child in focus trap zone
       */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
object ModalBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps = js.native
}

