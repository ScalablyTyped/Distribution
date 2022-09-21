package typings.officeUiFabricReact

import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZone
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapZoneFocusTrapZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", "FocusTrapZone")
  @js.native
  open class FocusTrapZone protected ()
    extends Component[IFocusTrapZoneProps, js.Object, Any]
       with IFocusTrapZone {
    def this(props: IFocusTrapZoneProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MFocusTrapZone(nextProps: IFocusTrapZoneProps): Unit = js.native
    
    /* private */ var _bringFocusIntoZone: Any = js.native
    
    /* private */ var _disposeClickHandler: Any = js.native
    
    /* private */ var _disposeFocusHandler: Any = js.native
    
    /* private */ var _firstBumper: Any = js.native
    
    /* private */ var _focusAsync: Any = js.native
    
    /* private */ var _forceClickInTrap: Any = js.native
    
    /* private */ var _forceFocusInTrap: Any = js.native
    
    /* private */ var _getDocument: Any = js.native
    
    /* private */ var _hasFocus: Any = js.native
    
    /* private */ var _isBumper: Any = js.native
    
    /* private */ var _lastBumper: Any = js.native
    
    /* private */ var _onBumperFocus: Any = js.native
    
    /* private */ var _onFirstBumperFocus: Any = js.native
    
    /* private */ var _onFocusCapture: Any = js.native
    
    /* private */ var _onLastBumperFocus: Any = js.native
    
    /* private */ var _onRootBlur: Any = js.native
    
    /* private */ var _onRootFocus: Any = js.native
    
    /* private */ var _previouslyFocusedElementInTrapZone: Any = js.native
    
    /* private */ var _previouslyFocusedElementOutsideTrapZone: Any = js.native
    
    /* private */ var _returnFocusToInitiator: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _unmodalize: Any = js.native
    
    /* private */ var _updateEventHandlers: Any = js.native
    
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
  object FocusTrapZone {
    
    @JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", "FocusTrapZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", "FocusTrapZone._focusStack")
    @js.native
    def _focusStack: Any = js.native
    inline def _focusStack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_focusStack")(x.asInstanceOf[js.Any])
  }
}
