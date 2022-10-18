package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsModalModalDottypesMod.IModal
import typings.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsModalModalDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
  @js.native
  open class ModalBase protected ()
    extends Component[IModalProps, IDialogState, Any]
       with IModal {
    def this(props: IModalProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MModalBase(newProps: IModalProps): Unit = js.native
    
    /* private */ var _allowScrollOnModal: Any = js.native
    
    /* private */ var _allowTouchBodyScroll: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _focusTrapZone: Any = js.native
    
    /* private */ var _focusTrapZoneMergedRef: Any = js.native
    
    /**
      * Clamps the position coordinates to the maximum/minimum value specified in props
      */
    /* private */ var _getClampedPosition: Any = js.native
    
    /* private */ var _getClampedPositionX: Any = js.native
    
    /* private */ var _getClampedPositionY: Any = js.native
    
    /* private */ var _getMoveDelta: Any = js.native
    
    /* private */ var _hasRegisteredKeyUp: Any = js.native
    
    /* private */ var _lastSetX: Any = js.native
    
    /* private */ var _lastSetY: Any = js.native
    
    /* private */ var _maxClampedPosition: Any = js.native
    
    /* private */ var _minClampedPosition: Any = js.native
    
    /* private */ var _onDrag: Any = js.native
    
    /* private */ var _onDragStart: Any = js.native
    
    /* private */ var _onDragStop: Any = js.native
    
    /* private */ var _onEnterKeyboardMoveMode: Any = js.native
    
    /* private */ var _onExitKeyboardMoveMode: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyUp: Any = js.native
    
    /* private */ var _onModalClose: Any = js.native
    
    /* private */ var _onModalCloseTimer: Any = js.native
    
    /* private */ var _onModalContextMenuClose: Any = js.native
    
    /* private */ var _registerForKeyUp: Any = js.native
    
    /* private */ var _registerInitialModalPosition: Any = js.native
    
    /* private */ var _scrollableContent: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MModalBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MModalBase(prevProps: IModalProps, prevState: IDialogState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModalBase(): Unit = js.native
    
    /**
      * Sets focus on the first focusable, or configured, child in focus trap zone
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object ModalBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase.defaultProps")
    @js.native
    def defaultProps: IModalProps = js.native
    inline def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDialogState extends StObject {
    
    var hasBeenOpened: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isInKeyboardMoveMode: js.UndefOr[Boolean] = js.undefined
    
    var isModalMenuOpen: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var isVisibleClose: js.UndefOr[Boolean] = js.undefined
    
    var modalRectangleTop: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object IDialogState {
    
    inline def apply(x: Double, y: Double): IDialogState = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogState]
    }
    
    extension [Self <: IDialogState](x: Self) {
      
      inline def setHasBeenOpened(value: Boolean): Self = StObject.set(x, "hasBeenOpened", value.asInstanceOf[js.Any])
      
      inline def setHasBeenOpenedUndefined: Self = StObject.set(x, "hasBeenOpened", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsInKeyboardMoveMode(value: Boolean): Self = StObject.set(x, "isInKeyboardMoveMode", value.asInstanceOf[js.Any])
      
      inline def setIsInKeyboardMoveModeUndefined: Self = StObject.set(x, "isInKeyboardMoveMode", js.undefined)
      
      inline def setIsModalMenuOpen(value: Boolean): Self = StObject.set(x, "isModalMenuOpen", value.asInstanceOf[js.Any])
      
      inline def setIsModalMenuOpenUndefined: Self = StObject.set(x, "isModalMenuOpen", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleClose(value: Boolean): Self = StObject.set(x, "isVisibleClose", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleCloseUndefined: Self = StObject.set(x, "isVisibleClose", js.undefined)
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setModalRectangleTop(value: Double): Self = StObject.set(x, "modalRectangleTop", value.asInstanceOf[js.Any])
      
      inline def setModalRectangleTopUndefined: Self = StObject.set(x, "modalRectangleTop", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
