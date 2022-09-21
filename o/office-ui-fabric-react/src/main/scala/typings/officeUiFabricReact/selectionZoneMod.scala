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
  open class SelectionZone protected () extends Component[ISelectionZoneProps, ISelectionZoneState, Any] {
    def this(props: ISelectionZoneProps) = this()
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _clearAndSelectIndex: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _findItemRoot: Any = js.native
    
    /**
      * To avoid high startup cost of traversing the DOM on component mount,
      * defer finding the scrollable parent until a click interaction.
      *
      * The styles will probably already calculated since we're running in a click handler,
      * so this is less likely to cause layout thrashing then doing it in mount.
      */
    /* private */ var _findScrollParentAndTryClearOnEmptyClick: Any = js.native
    
    /* private */ var _getItemIndex: Any = js.native
    
    /* private */ var _getItemSpan: Any = js.native
    
    /* private */ var _getSelectionMode: Any = js.native
    
    /* private */ var _handleNextFocus: Any = js.native
    
    /* private */ var _hasAttribute: Any = js.native
    
    /* private */ var _isCtrlPressed: Any = js.native
    
    /* private */ var _isInputElement: Any = js.native
    
    /* private */ var _isMetaPressed: Any = js.native
    
    /* private */ var _isNonHandledClick: Any = js.native
    
    /* private */ var _isSelectionDisabled: Any = js.native
    
    /* private */ var _isShiftPressed: Any = js.native
    
    /* private */ var _isTabPressed: Any = js.native
    
    /* private */ var _isTouch: Any = js.native
    
    /* private */ var _isTouchTimeoutId: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onContextMenu: Any = js.native
    
    /**
      * In multi selection, if you double click within an item's root (but not within the invoke element or
      * input elements), we should execute the invoke handler.
      */
    /* private */ var _onDoubleClick: Any = js.native
    
    /**
      * When we focus an item, for single/multi select scenarios, we should try to select it immediately
      * as long as the focus did not originate from a mouse down/touch event. For those cases, we handle them
      * specially.
      */
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onInvokeClick: Any = js.native
    
    /* private */ var _onInvokeMouseDown: Any = js.native
    
    /* private */ var _onItemSurfaceClick: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyDownCapture: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseDownCapture: Any = js.native
    
    /* private */ var _onSelectionChange: Any = js.native
    
    /* private */ var _onToggleAllClick: Any = js.native
    
    /* private */ var _onToggleClick: Any = js.native
    
    /* private */ var _onTouchStartCapture: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _setIsTouch: Any = js.native
    
    /* private */ var _shouldAutoSelect: Any = js.native
    
    /* private */ var _shouldHandleFocus: Any = js.native
    
    /* private */ var _shouldHandleFocusTimeoutId: Any = js.native
    
    /* private */ var _tryClearOnEmptyClick: Any = js.native
    
    /**
      * We need to track the modifier key states so that when focus events occur, which do not contain
      * modifier states in the Event object, we know how to behave.
      */
    /* private */ var _updateModifiers: Any = js.native
    
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
    inline def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
  
  trait ISelectionZone extends StObject {
    
    /**
      * Method to ignore subsequent focus.
      */
    def ignoreNextFocus(): Unit
  }
  object ISelectionZone {
    
    inline def apply(ignoreNextFocus: () => Unit): ISelectionZone = {
      val __obj = js.Dynamic.literal(ignoreNextFocus = js.Any.fromFunction0(ignoreNextFocus))
      __obj.asInstanceOf[ISelectionZone]
    }
    
    extension [Self <: ISelectionZone](x: Self) {
      
      inline def setIgnoreNextFocus(value: () => Unit): Self = StObject.set(x, "ignoreNextFocus", js.Any.fromFunction0(value))
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
          /* item */ js.UndefOr[Any], 
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
      * Determines if pressing the Escape clears the selection.
      *
      * @defaultvalue true
      */
    var selectionClearedOnEscapePress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines if elements within the selection zone that DO NOT have the 'data-selection-toggle' or
      * 'data-selection-all-toggle' attribute are clickable and can alter the selection.
      *
      * @defaultvalue true
      */
    var selectionClearedOnSurfaceClick: js.UndefOr[Boolean] = js.undefined
    
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
    
    /**
      * Allows the default toggle behavior to be overridden.
      * When set to `true` users do not have press a modifier key (e.g., ctrl or meta)
      * to toggle values.
      *
      * @default false
      */
    var toggleWithoutModifierPressed: js.UndefOr[Boolean] = js.undefined
  }
  object ISelectionZoneProps {
    
    inline def apply(selection: ISelection[IObjectWithKey]): ISelectionZoneProps = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectionZoneProps]
    }
    
    extension [Self <: ISelectionZoneProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: () => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction0(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDisableAutoSelectOnInputElements(value: Boolean): Self = StObject.set(x, "disableAutoSelectOnInputElements", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoSelectOnInputElementsUndefined: Self = StObject.set(x, "disableAutoSelectOnInputElements", js.undefined)
      
      inline def setEnableTouchInvocationTarget(value: Boolean): Self = StObject.set(x, "enableTouchInvocationTarget", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchInvocationTargetUndefined: Self = StObject.set(x, "enableTouchInvocationTarget", js.undefined)
      
      inline def setEnterModalOnTouch(value: Boolean): Self = StObject.set(x, "enterModalOnTouch", value.asInstanceOf[js.Any])
      
      inline def setEnterModalOnTouchUndefined: Self = StObject.set(x, "enterModalOnTouch", js.undefined)
      
      inline def setIsSelectedOnFocus(value: Boolean): Self = StObject.set(x, "isSelectedOnFocus", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedOnFocusUndefined: Self = StObject.set(x, "isSelectedOnFocus", js.undefined)
      
      inline def setLayout(value: js.Object): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOnItemContextMenu(
        value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
      ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3(value))
      
      inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
      
      inline def setOnItemInvoked(
        value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onItemInvoked", js.Any.fromFunction3(value))
      
      inline def setOnItemInvokedUndefined: Self = StObject.set(x, "onItemInvoked", js.undefined)
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionClearedOnEscapePress(value: Boolean): Self = StObject.set(x, "selectionClearedOnEscapePress", value.asInstanceOf[js.Any])
      
      inline def setSelectionClearedOnEscapePressUndefined: Self = StObject.set(x, "selectionClearedOnEscapePress", js.undefined)
      
      inline def setSelectionClearedOnSurfaceClick(value: Boolean): Self = StObject.set(x, "selectionClearedOnSurfaceClick", value.asInstanceOf[js.Any])
      
      inline def setSelectionClearedOnSurfaceClickUndefined: Self = StObject.set(x, "selectionClearedOnSurfaceClick", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionPreservedOnEmptyClick(value: Boolean): Self = StObject.set(x, "selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
      
      inline def setSelectionPreservedOnEmptyClickUndefined: Self = StObject.set(x, "selectionPreservedOnEmptyClick", js.undefined)
      
      inline def setToggleWithoutModifierPressed(value: Boolean): Self = StObject.set(x, "toggleWithoutModifierPressed", value.asInstanceOf[js.Any])
      
      inline def setToggleWithoutModifierPressedUndefined: Self = StObject.set(x, "toggleWithoutModifierPressed", js.undefined)
    }
  }
  
  trait ISelectionZoneState extends StObject {
    
    var isModal: js.UndefOr[Boolean] = js.undefined
  }
  object ISelectionZoneState {
    
    inline def apply(): ISelectionZoneState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectionZoneState]
    }
    
    extension [Self <: ISelectionZoneState](x: Self) {
      
      inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      inline def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
    }
  }
}
