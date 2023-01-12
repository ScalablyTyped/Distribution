package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.BeakWidth
import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.ICalloutPositionedInfo
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalloutCalloutContentDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
  @js.native
  open class CalloutContentBase protected () extends Component[ICalloutProps, ICalloutState, Any] {
    def this(props: ICalloutProps) = this()
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MCalloutContentBase(): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MCalloutContentBase(newProps: ICalloutProps): Unit = js.native
    
    /* private */ var _addListeners: Any = js.native
    
    /* private */ var _arePositionsEqual: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _blockResetHeight: Any = js.native
    
    /* private */ var _bounds: Any = js.native
    
    /* private */ var _calloutElement: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _comparePositions: Any = js.native
    
    /* private */ var _didPositionPropsChange: Any = js.native
    
    /* private */ var _didSetInitialFocus: Any = js.native
    
    /* private */ var _dismissOnClickOrScroll: Any = js.native
    
    /* protected */ def _dismissOnLostFocus(ev: Event): Unit = js.native
    
    /* protected */ def _dismissOnResize(ev: Event): Unit = js.native
    
    /* protected */ def _dismissOnScroll(ev: Event): Unit = js.native
    
    /* private */ var _dismissOnTargetWindowBlur: Any = js.native
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _getBeakPosition: Any = js.native
    
    /* private */ var _getBounds: Any = js.native
    
    /* private */ var _getMaxHeight: Any = js.native
    
    /* private */ var _getTarget: Any = js.native
    
    /* private */ var _hasListeners: Any = js.native
    
    /* private */ var _hostElement: Any = js.native
    
    /* private */ var _isMouseDownOnPopup: Any = js.native
    
    /* private */ var _maxHeight: Any = js.native
    
    /* private */ var _mouseDownOnPopup: Any = js.native
    
    /* private */ var _mouseUpOnPopup: Any = js.native
    
    /* protected */ def _onComponentDidMount(): Unit = js.native
    
    /* private */ var _positionAttempts: Any = js.native
    
    /* private */ var _removeListeners: Any = js.native
    
    /* private */ var _setHeightOffsetEveryFrame: Any = js.native
    
    /* private */ var _setHeightOffsetTimer: Any = js.native
    
    /* protected */ def _setInitialFocus(): Unit = js.native
    
    /* private */ var _setTargetWindowAndElement: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /* private */ var _targetWindow: Any = js.native
    
    /* private */ var _updateAsyncPosition: Any = js.native
    
    /* private */ var _updatePosition: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCalloutContentBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalloutContentBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCalloutContentBase(): Unit = js.native
    
    def dismiss(): Unit = js.native
    def dismiss(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    def dismiss(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    def dismiss(ev: Event): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCalloutContentBase(newProps: ICalloutProps, newState: ICalloutState): Boolean = js.native
  }
  /* static members */
  object CalloutContentBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase.defaultProps")
    @js.native
    def defaultProps: BeakWidth = js.native
    inline def defaultProps_=(x: BeakWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ICalloutState extends StObject {
    
    var calloutElementRect: js.UndefOr[ClientRect] = js.undefined
    
    var heightOffset: js.UndefOr[Double] = js.undefined
    
    var positions: js.UndefOr[ICalloutPositionedInfo] = js.undefined
    
    var slideDirectionalClassName: js.UndefOr[String] = js.undefined
  }
  object ICalloutState {
    
    inline def apply(): ICalloutState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalloutState] (val x: Self) extends AnyVal {
      
      inline def setCalloutElementRect(value: ClientRect): Self = StObject.set(x, "calloutElementRect", value.asInstanceOf[js.Any])
      
      inline def setCalloutElementRectUndefined: Self = StObject.set(x, "calloutElementRect", js.undefined)
      
      inline def setHeightOffset(value: Double): Self = StObject.set(x, "heightOffset", value.asInstanceOf[js.Any])
      
      inline def setHeightOffsetUndefined: Self = StObject.set(x, "heightOffset", js.undefined)
      
      inline def setPositions(value: ICalloutPositionedInfo): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setSlideDirectionalClassName(value: String): Self = StObject.set(x, "slideDirectionalClassName", value.asInstanceOf[js.Any])
      
      inline def setSlideDirectionalClassNameUndefined: Self = StObject.set(x, "slideDirectionalClassName", js.undefined)
    }
  }
}
