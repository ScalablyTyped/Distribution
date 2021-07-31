package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.std.Event
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
  @js.native
  class SelectionZone protected ()
    extends Component[ISelectionZoneProps, ISelectionZoneState, js.Any] {
    def this(props: ISelectionZoneProps) = this()
    
    var _async: js.Any = js.native
    
    var _clearAndSelectIndex: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _findItemRoot: js.Any = js.native
    
    /**
      * To avoid high startup cost of traversing the DOM on component mount,
      * defer finding the scrollable parent until a click interaction.
      *
      * The styles will probably already calculated since we're running in a click handler,
      * so this is less likely to cause layout thrashing then doing it in mount.
      */
    var _findScrollParentAndTryClearOnEmptyClick: js.Any = js.native
    
    var _getItemIndex: js.Any = js.native
    
    var _getSelectionMode: js.Any = js.native
    
    var _handleNextFocus: js.Any = js.native
    
    var _hasAttribute: js.Any = js.native
    
    var _isCtrlPressed: js.Any = js.native
    
    var _isInputElement: js.Any = js.native
    
    var _isMetaPressed: js.Any = js.native
    
    var _isNonHandledClick: js.Any = js.native
    
    var _isSelectionDisabled: js.Any = js.native
    
    var _isShiftPressed: js.Any = js.native
    
    var _isTabPressed: js.Any = js.native
    
    var _isTouch: js.Any = js.native
    
    var _isTouchTimeoutId: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _onContextMenu: js.Any = js.native
    
    /**
      * In multi selection, if you double click within an item's root (but not within the invoke element or
      * input elements), we should execute the invoke handler.
      */
    var _onDoubleClick: js.Any = js.native
    
    /**
      * When we focus an item, for single/multi select scenarios, we should try to select it immediately
      * as long as the focus did not originate from a mouse down/touch event. For those cases, we handle them
      * specially.
      */
    var _onFocus: js.Any = js.native
    
    var _onInvokeClick: js.Any = js.native
    
    var _onInvokeMouseDown: js.Any = js.native
    
    var _onItemSurfaceClick: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onKeyDownCapture: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseDownCapture: js.Any = js.native
    
    var _onSelectionChange: js.Any = js.native
    
    var _onToggleAllClick: js.Any = js.native
    
    var _onToggleClick: js.Any = js.native
    
    var _onTouchStartCapture: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _setIsTouch: js.Any = js.native
    
    var _shouldAutoSelect: js.Any = js.native
    
    var _shouldHandleFocus: js.Any = js.native
    
    var _shouldHandleFocusTimeoutId: js.Any = js.native
    
    var _tryClearOnEmptyClick: js.Any = js.native
    
    /**
      * We need to track the modifier key states so that when focus events occur, which do not contain
      * modifier states in the Event object, we know how to behave.
      */
    var _updateModifiers: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSelectionZone(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelectionZone(previousProps: ISelectionZoneProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSelectionZone(): Unit = js.native
    
    /**
      * In some cases, the consuming scenario requires to set focus on a row without having SelectionZone
      * react to the event. Note that focus events in IE \<= 11 will occur asynchronously after .focus() has
      * been called on an element, so we need a flag to store the idea that we will bypass the "next"
      * focus event that occurs. This method does that.
      */
    def ignoreNextFocus(): Unit = js.native
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    @scala.inline
    def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
  
  trait ISelectionZone extends StObject {
    
    /**
      * Method to ignore subsequent focus.
      */
    def ignoreNextFocus(): Unit
  }
  object ISelectionZone {
    
    @scala.inline
    def apply(ignoreNextFocus: () => Unit): ISelectionZone = {
      val __obj = js.Dynamic.literal(ignoreNextFocus = js.Any.fromFunction0(ignoreNextFocus))
      __obj.asInstanceOf[ISelectionZone]
    }
    
    @scala.inline
    implicit class ISelectionZoneMutableBuilder[Self <: ISelectionZone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreNextFocus(value: () => Unit): Self = StObject.set(x, "ignoreNextFocus", js.Any.fromFunction0(value))
    }
  }
  
  trait ISelectionZoneProps
    extends StObject
       with ClassAttributes[SelectionZone] {
    
    /**
      * Additional CSS class(es) to apply to the SelectionZone.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Reference to the component interface.
      */
    var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If true, disables automatic selection on input elements.
      */
    var disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether elements with the attribute `data-selection-touch-invoke` should be used as invocation targets
      * for an item if the user is using touch.
      *
      * @defaultvalue false
      */
    var enableTouchInvocationTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, modal selection is enabled on touch event.
      */
    var enterModalOnTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines if an item is selected on focus.
      *
      * @defaultvalue true
      */
    var isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated No longer in use, focus is now managed by {@link FocusZone}.
      */
    var layout: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional callback for when an
      * item's contextual menu action occurs.
      */
    var onItemContextMenu: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          /* ev */ js.UndefOr[Event], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    /**
      * Optional callback for when an item is
      * invoked via ENTER or double-click.
      */
    var onItemInvoked: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[IObjectWithKey], 
          /* index */ js.UndefOr[Double], 
          /* ev */ js.UndefOr[Event], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Required {@link ISelection} instance bound to the {@link SelectionZone}.
      */
    var selection: ISelection[IObjectWithKey]
    
    /**
      * The mode of Selection, where the value is one of
      * 'none', 'single', or 'multiple'.
      *
      * @defaultvalue {@link SelectionMode.multiple}
      */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    /**
      * If true, selection is preserved on outer click.
      */
    var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
  }
  object ISelectionZoneProps {
    
    @scala.inline
    def apply(selection: ISelection[IObjectWithKey]): ISelectionZoneProps = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectionZoneProps]
    }
    
    @scala.inline
    implicit class ISelectionZonePropsMutableBuilder[Self <: ISelectionZoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: () => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDisableAutoSelectOnInputElements(value: Boolean): Self = StObject.set(x, "disableAutoSelectOnInputElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoSelectOnInputElementsUndefined: Self = StObject.set(x, "disableAutoSelectOnInputElements", js.undefined)
      
      @scala.inline
      def setEnableTouchInvocationTarget(value: Boolean): Self = StObject.set(x, "enableTouchInvocationTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchInvocationTargetUndefined: Self = StObject.set(x, "enableTouchInvocationTarget", js.undefined)
      
      @scala.inline
      def setEnterModalOnTouch(value: Boolean): Self = StObject.set(x, "enterModalOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterModalOnTouchUndefined: Self = StObject.set(x, "enterModalOnTouch", js.undefined)
      
      @scala.inline
      def setIsSelectedOnFocus(value: Boolean): Self = StObject.set(x, "isSelectedOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedOnFocusUndefined: Self = StObject.set(x, "isSelectedOnFocus", js.undefined)
      
      @scala.inline
      def setLayout(value: js.Object): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOnItemContextMenu(
        value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
      ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
      
      @scala.inline
      def setOnItemInvoked(
        value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onItemInvoked", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemInvokedUndefined: Self = StObject.set(x, "onItemInvoked", js.undefined)
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionPreservedOnEmptyClick(value: Boolean): Self = StObject.set(x, "selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPreservedOnEmptyClickUndefined: Self = StObject.set(x, "selectionPreservedOnEmptyClick", js.undefined)
    }
  }
  
  trait ISelectionZoneState extends StObject {
    
    var isModal: js.UndefOr[Boolean] = js.undefined
  }
  object ISelectionZoneState {
    
    @scala.inline
    def apply(): ISelectionZoneState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectionZoneState]
    }
    
    @scala.inline
    implicit class ISelectionZoneStateMutableBuilder[Self <: ISelectionZoneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
    }
  }
}
