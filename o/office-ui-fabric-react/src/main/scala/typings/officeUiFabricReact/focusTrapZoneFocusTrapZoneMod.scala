package typings.officeUiFabricReact

import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZone
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", JSImport.Namespace)
@js.native
object focusTrapZoneFocusTrapZoneMod extends js.Object {
  @js.native
  class FocusTrapZone protected ()
    extends Component[IFocusTrapZoneProps, js.Object, js.Any]
       with IFocusTrapZone {
    def this(props: IFocusTrapZoneProps) = this()
    var _bringFocusIntoZone: js.Any = js.native
    var _disposeClickHandler: js.Any = js.native
    var _disposeFocusHandler: js.Any = js.native
    var _firstBumper: js.Any = js.native
    var _focusAsync: js.Any = js.native
    var _forceClickInTrap: js.Any = js.native
    var _forceFocusInTrap: js.Any = js.native
    var _getDocument: js.Any = js.native
    var _hasFocus: js.Any = js.native
    var _isBumper: js.Any = js.native
    var _lastBumper: js.Any = js.native
    var _onBumperFocus: js.Any = js.native
    var _onFirstBumperFocus: js.Any = js.native
    var _onFocusCapture: js.Any = js.native
    var _onLastBumperFocus: js.Any = js.native
    var _onRootBlur: js.Any = js.native
    var _onRootFocus: js.Any = js.native
    var _previouslyFocusedElementInTrapZone: js.UndefOr[js.Any] = js.native
    var _previouslyFocusedElementOutsideTrapZone: js.Any = js.native
    var _returnFocusToInitiator: js.Any = js.native
    var _root: js.Any = js.native
    var _updateEventHandlers: js.Any = js.native
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MFocusTrapZone(nextProps: IFocusTrapZoneProps): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFocusTrapZone(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFocusTrapZone(prevProps: IFocusTrapZoneProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFocusTrapZone(): Unit = js.native
    /**
      * Sets focus to a descendant in the Trap Zone.
      * See firstFocusableSelector and focusPreviouslyFocusedInnerElement for details.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object FocusTrapZone extends js.Object {
    var _focusStack: js.Any = js.native
  }
  
}

