package typings.officeUiFabricReact

import typings.officeUiFabricReact.modalTypesMod.IModal
import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalBaseMod {
  
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
    @scala.inline
    def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(x: Double, y: Double): IDialogState = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogState]
    }
    
    @scala.inline
    implicit class IDialogStateMutableBuilder[Self <: IDialogState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasBeenOpened(value: Boolean): Self = StObject.set(x, "hasBeenOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBeenOpenedUndefined: Self = StObject.set(x, "hasBeenOpened", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsInKeyboardMoveMode(value: Boolean): Self = StObject.set(x, "isInKeyboardMoveMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInKeyboardMoveModeUndefined: Self = StObject.set(x, "isInKeyboardMoveMode", js.undefined)
      
      @scala.inline
      def setIsModalMenuOpen(value: Boolean): Self = StObject.set(x, "isModalMenuOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModalMenuOpenUndefined: Self = StObject.set(x, "isModalMenuOpen", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleClose(value: Boolean): Self = StObject.set(x, "isVisibleClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleCloseUndefined: Self = StObject.set(x, "isVisibleClose", js.undefined)
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setModalRectangleTop(value: Double): Self = StObject.set(x, "modalRectangleTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalRectangleTopUndefined: Self = StObject.set(x, "modalRectangleTop", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
