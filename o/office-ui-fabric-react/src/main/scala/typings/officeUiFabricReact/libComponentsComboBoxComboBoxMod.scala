package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsComboBoxComboBoxDottypesMod.IComboBoxOption
import typings.officeUiFabricReact.libComponentsComboBoxComboBoxDottypesMod.IComboBoxProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.focused
import typings.officeUiFabricReact.officeUiFabricReactStrings.focusing
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsComboBoxComboBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox", "ComboBox")
  @js.native
  open class ComboBox protected () extends Component[IComboBoxProps, IComboBoxState, Any] {
    def this(props: IComboBoxProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MComboBox(newProps: IComboBoxProps): Unit = js.native
    
    /* private */ var _async: Any = js.native
    
    /** The input aspect of the comboBox */
    /* private */ var _autofill: Any = js.native
    
    /**
      * Given default selected key(s) and selected key(s), return the selected keys(s).
      * When default selected key(s) are available, they take precedence and return them instead of selected key(s).
      *
      * @returns No matter what specific types the input parameters are, always return an array of
      *  either strings or numbers instead of premitive type.  This normlization makes caller's logic easier.
      */
    /* private */ var _buildDefaultSelectedKeys: Any = js.native
    
    /* private */ var _buildSelectedKeys: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /**
      * Clears the pending info state
      */
    /* private */ var _clearPendingInfo: Any = js.native
    
    /** The callout element */
    /* private */ var _comboBoxMenu: Any = js.native
    
    /** The wrapping div of the input and button */
    /* private */ var _comboBoxWrapper: Any = js.native
    
    /** Promise used when resolving the comboBox options */
    /* private */ var _currentPromise: Any = js.native
    
    /** The current visible value sent to the auto fill on render */
    /* private */ var _currentVisibleValue: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /**
      * Determines if we should be setting focus back to the input when the menu closes.
      * The general rule of thumb is if the menu was launched via the keyboard focus should go back
      * to the input, if it was dropped via the mouse focus should not be forced back to the input.
      */
    /* private */ var _focusInputAfterClose: Any = js.native
    
    /**
      * Get the aria-activedescendant value for the comboxbox.
      * @returns the id of the current focused combo item, otherwise the id of the currently selected element,
      * null otherwise
      */
    /* private */ var _getAriaActiveDescendantValue: Any = js.native
    
    /**
      * Get the aria autocomplete value for the Combobox
      * @returns 'inline' if auto-complete automatically dynamic, 'both' if we have a list of possible values to pick from
      * and can dynamically populate input, and 'none' if auto-complete is not enabled as we can't give user inputs.
      */
    /* private */ var _getAriaAutoCompleteValue: Any = js.native
    
    /**
      * Get the styles for the current option.
      * @param item - Item props for the current option
      */
    /* private */ var _getCaretButtonStyles: Any = js.native
    
    /**
      * Get the styles for the current option.
      * @param item - Item props for the current option
      */
    /* private */ var _getCurrentOptionStyles: Any = js.native
    
    /* private */ var _getFirstSelectedIndex: Any = js.native
    
    /**
      * Returns a string that concatenates all of the selected values
      * for multiselect combobox.
      */
    /* private */ var _getMultiselectDisplayString: Any = js.native
    
    /**
      * Walk along the options starting at the index, stepping by the delta (positive or negative)
      * looking for the next valid selectable index (e.g. skipping headings and dividers)
      * @param index - the index to get the next selectable index from
      * @param delta - optional delta to step by when finding the next index, defaults to 0
      * @returns - the next valid selectable index. If the new index is outside of the bounds,
      * it will snap to the edge of the options array. If delta == 0 and the given index is not selectable
      */
    /* private */ var _getNextSelectableIndex: Any = js.native
    
    /**
      * Gets the pending selected index taking into account hover, valueValidIndex, and selectedIndex
      * @param includeCurrentPendingValue - Should we include the currentPendingValue when
      * finding the index
      */
    /* private */ var _getPendingSelectedIndex: Any = js.native
    
    /* private */ var _getPendingString: Any = js.native
    
    /* private */ var _getPreviewText: Any = js.native
    
    /**
      * Get the indices of the options that are marked as selected
      * @param options - the comboBox options
      * @param selectedKeys - the known selected keys to find
      * @returns - an array of the indices of the selected options, empty array if nothing is selected
      */
    /* private */ var _getSelectedIndices: Any = js.native
    
    /**
      * Get the correct value to pass to the input
      * to show to the user based off of the current props and state
      * @returns the value to pass to the input
      */
    /* private */ var _getVisibleValue: Any = js.native
    
    /** Flag for when we get the first mouseMove */
    /* private */ var _gotMouseMove: Any = js.native
    
    /**
      * Handle dismissing the menu and
      * eating the required key event when disabled
      * @param ev - the keyboard event that was fired
      */
    /* private */ var _handleInputWhenDisabled: Any = js.native
    
    /* private */ var _handleTouchAndPointerEvent: Any = js.native
    
    /**
      * Returns true if the component has some kind of focus. If it's either focusing or if it's focused
      */
    /* private */ var _hasFocus: Any = js.native
    
    /* private */ var _hasPendingValue: Any = js.native
    
    /** The base id for the ComboBox */
    /* private */ var _id: Any = js.native
    
    /**
      * Is the index within the bounds of the array?
      * @param options - options to check if the index is valid for
      * @param index - the index to check
      * @returns - true if the index is valid for the given options, false otherwise
      */
    /* private */ var _indexWithinBounds: Any = js.native
    
    /**
      * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
      */
    /* private */ var _isAltOrMeta: Any = js.native
    
    /* private */ var _isOptionChecked: Any = js.native
    
    /**
      * If we are coming from a mouseOut:
      * there is no visible selected option.
      *
      * Else if We are hovering over an item:
      * that gets the selected look.
      *
      * Else:
      * Use the current valid pending index if it exists OR
      * we do not have a valid index and we currently have a pending input value,
      * otherwise use the selected index
      * */
    /* private */ var _isOptionSelected: Any = js.native
    
    /* private */ var _isPendingOption: Any = js.native
    
    /* private */ var _isScrollIdle: Any = js.native
    
    /** True if the most recent keydown event was for alt (option) or meta (command). */
    /* private */ var _lastKeyDownWasAltOrMeta: Any = js.native
    
    /**
      * After a character is inserted when autocomplete is true and allowFreeform is false,
      * remember the task that will clear the pending string of characters.
      */
    /* private */ var _lastReadOnlyAutoCompleteChangeTimeoutId: Any = js.native
    
    /* private */ var _lastTouchTimeoutId: Any = js.native
    
    /* private */ var _normalizeToString: Any = js.native
    
    /* private */ var _notifyPendingValueChanged: Any = js.native
    
    /* private */ var _onAfterClearPendingInfo: Any = js.native
    
    /**
      * Click handler for the autofill.
      */
    /* private */ var _onAutofillClick: Any = js.native
    
    /**
      * OnBlur handler. Set the focused state to false
      * and submit any pending value
      */
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onCalloutLayerMounted: Any = js.native
    
    /**
      * Mouse clicks to headers, dividers and scrollbar should not make input lose focus
      */
    /* private */ var _onCalloutMouseDown: Any = js.native
    
    /**
      * Click handler for the button of the comboBox
      * and the input when not allowing freeform. This
      * toggles the expand/collapse state of the comboBox (if enbled)
      */
    /* private */ var _onComboBoxClick: Any = js.native
    
    /**
      * Handles dismissing (cancelling) the menu
      */
    /* private */ var _onDismiss: Any = js.native
    
    /**
      * Focus (and select) the content of the input
      * and set the focused state
      */
    /* private */ var _onFocus: Any = js.native
    
    /**
      * Handler for typing changes on the input
      * @param updatedValue - the newly changed value
      */
    /* private */ var _onInputChange: Any = js.native
    
    /**
      * Handle keydown on the input
      * @param ev - The keyboard event that was fired
      */
    /* private */ var _onInputKeyDown: Any = js.native
    
    /**
      * Handle keyup on the input
      * @param ev - the keyboard event that was fired
      */
    /* private */ var _onInputKeyUp: Any = js.native
    
    /**
      * Click handler for the menu items
      * to select the item and also close the menu
      * @param index - the index of the item that was clicked
      */
    /* private */ var _onItemClick: Any = js.native
    
    /* private */ var _onLayerMounted: Any = js.native
    
    /* private */ var _onOptionMouseEnter: Any = js.native
    
    /* private */ var _onOptionMouseLeave: Any = js.native
    
    /* private */ var _onOptionMouseMove: Any = js.native
    
    /* private */ var _onPointerDown: Any = js.native
    
    /* private */ var _onRenderContainer: Any = js.native
    
    /* private */ var _onRenderItem: Any = js.native
    
    /* private */ var _onRenderLabel: Any = js.native
    
    /* private */ var _onRenderList: Any = js.native
    
    /* private */ var _onRenderLowerContent: Any = js.native
    
    /* private */ var _onRenderOptionContent: Any = js.native
    
    /* private */ var _onRenderUpperContent: Any = js.native
    
    /**
      * Callback issued when the options should be resolved, if they have been updated or
      * if they need to be passed in the first time. This only does work if an onResolveOptions
      * callback was passed in
      */
    /* private */ var _onResolveOptions: Any = js.native
    
    /**
      * Scroll handler for the callout to make sure the mouse events
      * for updating focus are not interacting during scroll
      */
    /* private */ var _onScroll: Any = js.native
    
    /**
      * componentDidUpdate handler for the auto fill component
      *
      * @param defaultVisibleValue - the current defaultVisibleValue in the auto fill's componentDidUpdate
      * @param suggestedDisplayValue - the current suggestedDisplayValue in the auto fill's componentDidUpdate
      * @returns - should the full value of the input be selected?
      * True if the defaultVisibleValue equals the suggestedDisplayValue, false otherwise
      */
    /* private */ var _onShouldSelectFullInputValueInAutofillComponentDidUpdate: Any = js.native
    
    /* private */ var _onTouchStart: Any = js.native
    
    /**
      * componentWillReceiveProps handler for the auto fill component
      * Checks/updates the iput value to set, if needed
      * @param defaultVisibleValue - the defaultVisibleValue that got passed
      *  in to the auto fill's componentWillReceiveProps
      * @returns - the updated value to set, if needed
      */
    /* private */ var _onUpdateValueInAutofillWillReceiveProps: Any = js.native
    
    /**
      * Process the new input's new value when the comboBox
      * allows freeform entry
      * @param updatedValue - the input's newly changed value
      */
    /* private */ var _processInputChangeWithFreeform: Any = js.native
    
    /**
      * Process the new input's new value when the comboBox
      * does not allow freeform entry
      * @param updatedValue - the input's newly changed value
      */
    /* private */ var _processInputChangeWithoutFreeform: Any = js.native
    
    /* private */ var _processingClearPendingInfo: Any = js.native
    
    /* private */ var _processingTouch: Any = js.native
    
    /* private */ var _renderComboBoxWrapper: Any = js.native
    
    /* private */ var _renderHeader: Any = js.native
    
    /* private */ var _renderOption: Any = js.native
    
    /* private */ var _renderSeparator: Any = js.native
    
    /**
      * Reset the selected index by clearing the
      * input (of any pending text), clearing the pending state,
      * and setting the suggested display value to the last
      * selected state text
      */
    /* private */ var _resetSelectedIndex: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _scrollIdleTimeoutId: Any = js.native
    
    /**
      * Scroll the selected element into view
      */
    /* private */ var _scrollIntoView: Any = js.native
    
    /** The menu item element that is currently selected */
    /* private */ var _selectedElement: Any = js.native
    
    /**
      * Sets the isOpen state and updates focusInputAfterClose
      */
    /* private */ var _setOpenStateAndFocusOnClose: Any = js.native
    
    /**
      * Set the pending info
      * @param currentPendingValue - new pending value to set
      * @param currentPendingValueValidIndex - new pending value index to set
      * @param suggestedDisplayValue - new suggest display value to set
      */
    /* private */ var _setPendingInfo: Any = js.native
    
    /**
      * Set the pending info from the given index
      * @param index - the index to set the pending info from
      */
    /* private */ var _setPendingInfoFromIndex: Any = js.native
    
    /**
      * Sets the pending info for the comboBox
      * @param index - the index to search from
      * @param searchDirection - the direction to search
      */
    /* private */ var _setPendingInfoFromIndexAndDirection: Any = js.native
    
    /**
      * Set the selected index. Note, this is
      * the "real" selected index, not the pending selected index
      * @param index - the index to set (or the index to set from if a search direction is provided)
      * @param searchDirection - the direction to search along the options from the given index
      */
    /* private */ var _setSelectedIndex: Any = js.native
    
    /* private */ var _shouldIgnoreMouseEvent: Any = js.native
    
    /**
      * Submit a pending value if there is one
      */
    /* private */ var _submitPendingValue: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MComboBox(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MComboBox(prevProps: IComboBoxProps, prevState: IComboBoxState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MComboBox(): Unit = js.native
    
    /**
      * Close menu callout if it is open
      */
    def dismissMenu(): Unit = js.native
    
    /**
      * {@inheritdoc}
      */
    def focus(): Unit = js.native
    def focus(shouldOpenOnFocus: Boolean): Unit = js.native
    def focus(shouldOpenOnFocus: Boolean, useFocusAsync: Boolean): Unit = js.native
    def focus(shouldOpenOnFocus: Unit, useFocusAsync: Boolean): Unit = js.native
    
    /**
      * All selected options
      */
    val selectedOptions: js.Array[IComboBoxOption] = js.native
  }
  /* static members */
  object ComboBox {
    
    @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox", "ComboBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox", "ComboBox.defaultProps")
    @js.native
    def defaultProps: IComboBoxProps = js.native
    inline def defaultProps_=(x: IComboBoxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IComboBoxState extends StObject {
    
    /** The options currently available for the callout */
    var currentOptions: js.Array[IComboBoxOption]
    
    /** When taking input, this will store the actual text that is being entered */
    var currentPendingValue: js.UndefOr[String] = js.undefined
    
    /**
      * When taking input, this will store the index that the options input matches
      * (-1 if no input or match)
      */
    var currentPendingValueValidIndex: Double
    
    /**
      * Stores the hovered over value in the dropdown
      * (used for styling the options without updating the input)
      */
    var currentPendingValueValidIndexOnHover: Double
    
    /** The focused state of the comboBox */
    var focusState: js.UndefOr[none | focused | focusing] = js.undefined
    
    /** The open state */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /** The currently selected indices */
    var selectedIndices: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** This value is used for the autocomplete hint value */
    var suggestedDisplayValue: js.UndefOr[String] = js.undefined
  }
  object IComboBoxState {
    
    inline def apply(
      currentOptions: js.Array[IComboBoxOption],
      currentPendingValueValidIndex: Double,
      currentPendingValueValidIndexOnHover: Double
    ): IComboBoxState = {
      val __obj = js.Dynamic.literal(currentOptions = currentOptions.asInstanceOf[js.Any], currentPendingValueValidIndex = currentPendingValueValidIndex.asInstanceOf[js.Any], currentPendingValueValidIndexOnHover = currentPendingValueValidIndexOnHover.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComboBoxState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IComboBoxState] (val x: Self) extends AnyVal {
      
      inline def setCurrentOptions(value: js.Array[IComboBoxOption]): Self = StObject.set(x, "currentOptions", value.asInstanceOf[js.Any])
      
      inline def setCurrentOptionsVarargs(value: IComboBoxOption*): Self = StObject.set(x, "currentOptions", js.Array(value*))
      
      inline def setCurrentPendingValue(value: String): Self = StObject.set(x, "currentPendingValue", value.asInstanceOf[js.Any])
      
      inline def setCurrentPendingValueUndefined: Self = StObject.set(x, "currentPendingValue", js.undefined)
      
      inline def setCurrentPendingValueValidIndex(value: Double): Self = StObject.set(x, "currentPendingValueValidIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentPendingValueValidIndexOnHover(value: Double): Self = StObject.set(x, "currentPendingValueValidIndexOnHover", value.asInstanceOf[js.Any])
      
      inline def setFocusState(value: none | focused | focusing): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
      
      inline def setFocusStateUndefined: Self = StObject.set(x, "focusState", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      inline def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setSuggestedDisplayValue(value: String): Self = StObject.set(x, "suggestedDisplayValue", value.asInstanceOf[js.Any])
      
      inline def setSuggestedDisplayValueUndefined: Self = StObject.set(x, "suggestedDisplayValue", js.undefined)
    }
  }
}
