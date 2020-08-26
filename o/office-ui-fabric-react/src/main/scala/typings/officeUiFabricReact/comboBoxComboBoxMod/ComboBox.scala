package typings.officeUiFabricReact.comboBoxComboBoxMod

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox", "ComboBox")
@js.native
class ComboBox protected ()
  extends Component[IComboBoxProps, IComboBoxState, js.Any] {
  def this(props: IComboBoxProps) = this()
  var _async: js.Any = js.native
  /** The input aspect of the comboBox */
  var _autofill: js.Any = js.native
  /**
    * Given default selected key(s) and selected key(s), return the selected keys(s).
    * When default selected key(s) are available, they take precedence and return them instead of selected key(s).
    *
    * @returns No matter what specific types the input parameters are, always return an array of
    *  either strings or numbers instead of premitive type.  This normlization makes caller's logic easier.
    */
  var _buildDefaultSelectedKeys: js.Any = js.native
  var _buildSelectedKeys: js.Any = js.native
  var _classNames: js.Any = js.native
  /**
    * Clears the pending info state
    */
  var _clearPendingInfo: js.Any = js.native
  /** The callout element */
  var _comboBoxMenu: js.Any = js.native
  /** The wrapping div of the input and button */
  var _comboBoxWrapper: js.Any = js.native
  /** Promise used when resolving the comboBox options */
  var _currentPromise: js.Any = js.native
  /** The current visible value sent to the auto fill on render */
  var _currentVisibleValue: js.Any = js.native
  var _events: js.Any = js.native
  /**
    * Determines if we should be setting focus back to the input when the menu closes.
    * The general rule of thumb is if the menu was launched via the keyboard focus should go back
    * to the input, if it was dropped via the mouse focus should not be forced back to the input.
    */
  var _focusInputAfterClose: js.Any = js.native
  /**
    * Get the aria-activedescendant value for the comboxbox.
    * @returns the id of the current focused combo item, otherwise the id of the currently selected element,
    * null otherwise
    */
  var _getAriaActiveDescendantValue: js.Any = js.native
  /**
    * Get the aria autocomplete value for the Combobox
    * @returns 'inline' if auto-complete automatically dynamic, 'both' if we have a list of possible values to pick from
    * and can dynamically populate input, and 'none' if auto-complete is not enabled as we can't give user inputs.
    */
  var _getAriaAutoCompleteValue: js.Any = js.native
  /**
    * Get the styles for the current option.
    * @param item - Item props for the current option
    */
  var _getCaretButtonStyles: js.Any = js.native
  /**
    * Get the styles for the current option.
    * @param item - Item props for the current option
    */
  var _getCurrentOptionStyles: js.Any = js.native
  var _getFirstSelectedIndex: js.Any = js.native
  /**
    * Returns a string that concatenates all of the selected values
    * for multiselect combobox.
    */
  var _getMultiselectDisplayString: js.Any = js.native
  /**
    * Walk along the options starting at the index, stepping by the delta (positive or negative)
    * looking for the next valid selectable index (e.g. skipping headings and dividers)
    * @param index - the index to get the next selectable index from
    * @param delta - optional delta to step by when finding the next index, defaults to 0
    * @returns - the next valid selectable index. If the new index is outside of the bounds,
    * it will snap to the edge of the options array. If delta == 0 and the given index is not selectable
    */
  var _getNextSelectableIndex: js.Any = js.native
  /**
    * Gets the pending selected index taking into account hover, valueValidIndex, and selectedIndex
    * @param includeCurrentPendingValue - Should we include the currentPendingValue when
    * finding the index
    */
  var _getPendingSelectedIndex: js.Any = js.native
  var _getPendingString: js.Any = js.native
  var _getPreviewText: js.Any = js.native
  /**
    * Get the indices of the options that are marked as selected
    * @param options - the comboBox options
    * @param selectedKeys - the known selected keys to find
    * @returns - an array of the indices of the selected options, empty array if nothing is selected
    */
  var _getSelectedIndices: js.Any = js.native
  /**
    * Get the correct value to pass to the input
    * to show to the user based off of the current props and state
    * @returns the value to pass to the input
    */
  var _getVisibleValue: js.Any = js.native
  /** Flag for when we get the first mouseMove */
  var _gotMouseMove: js.Any = js.native
  /**
    * Handle dismissing the menu and
    * eating the required key event when disabled
    * @param ev - the keyboard event that was fired
    */
  var _handleInputWhenDisabled: js.Any = js.native
  var _handleTouchAndPointerEvent: js.Any = js.native
  /**
    * Returns true if the component has some kind of focus. If it's either focusing or if it's focused
    */
  var _hasFocus: js.Any = js.native
  var _hasPendingValue: js.Any = js.native
  /** The base id for the ComboBox */
  var _id: js.Any = js.native
  /**
    * Is the index within the bounds of the array?
    * @param options - options to check if the index is valid for
    * @param index - the index to check
    * @returns - true if the index is valid for the given options, false otherwise
    */
  var _indexWithinBounds: js.Any = js.native
  /**
    * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
    */
  var _isAltOrMeta: js.Any = js.native
  var _isOptionChecked: js.Any = js.native
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
  var _isOptionSelected: js.Any = js.native
  var _isPendingOption: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  /** True if the most recent keydown event was for alt (option) or meta (command). */
  var _lastKeyDownWasAltOrMeta: js.Any = js.native
  /**
    * After a character is inserted when autocomplete is true and allowFreeform is false,
    * remember the task that will clear the pending string of characters.
    */
  var _lastReadOnlyAutoCompleteChangeTimeoutId: js.Any = js.native
  var _lastTouchTimeoutId: js.Any = js.native
  var _normalizeToString: js.Any = js.native
  var _notifyPendingValueChanged: js.Any = js.native
  var _onAfterClearPendingInfo: js.Any = js.native
  /**
    * Click handler for the autofill.
    */
  var _onAutofillClick: js.Any = js.native
  /**
    * OnBlur handler. Set the focused state to false
    * and submit any pending value
    */
  var _onBlur: js.Any = js.native
  var _onCalloutLayerMounted: js.Any = js.native
  /**
    * Mouse clicks to headers, dividers and scrollbar should not make input lose focus
    */
  var _onCalloutMouseDown: js.Any = js.native
  /**
    * Click handler for the button of the comboBox
    * and the input when not allowing freeform. This
    * toggles the expand/collapse state of the comboBox (if enbled)
    */
  var _onComboBoxClick: js.Any = js.native
  /**
    * Handles dismissing (cancelling) the menu
    */
  var _onDismiss: js.Any = js.native
  /**
    * Focus (and select) the content of the input
    * and set the focused state
    */
  var _onFocus: js.Any = js.native
  /**
    * Handler for typing changes on the input
    * @param updatedValue - the newly changed value
    */
  var _onInputChange: js.Any = js.native
  /**
    * Handle keydown on the input
    * @param ev - The keyboard event that was fired
    */
  var _onInputKeyDown: js.Any = js.native
  /**
    * Handle keyup on the input
    * @param ev - the keyboard event that was fired
    */
  var _onInputKeyUp: js.Any = js.native
  /**
    * Click handler for the menu items
    * to select the item and also close the menu
    * @param index - the index of the item that was clicked
    */
  var _onItemClick: js.Any = js.native
  var _onLayerMounted: js.Any = js.native
  var _onOptionMouseEnter: js.Any = js.native
  var _onOptionMouseLeave: js.Any = js.native
  var _onOptionMouseMove: js.Any = js.native
  var _onPointerDown: js.Any = js.native
  var _onRenderContainer: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  var _onRenderList: js.Any = js.native
  var _onRenderLowerContent: js.Any = js.native
  var _onRenderOptionContent: js.Any = js.native
  var _onRenderUpperContent: js.Any = js.native
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time. This only does work if an onResolveOptions
    * callback was passed in
    */
  var _onResolveOptions: js.Any = js.native
  /**
    * Scroll handler for the callout to make sure the mouse events
    * for updating focus are not interacting during scroll
    */
  var _onScroll: js.Any = js.native
  /**
    * componentDidUpdate handler for the auto fill component
    *
    * @param defaultVisibleValue - the current defaultVisibleValue in the auto fill's componentDidUpdate
    * @param suggestedDisplayValue - the current suggestedDisplayValue in the auto fill's componentDidUpdate
    * @returns - should the full value of the input be selected?
    * True if the defaultVisibleValue equals the suggestedDisplayValue, false otherwise
    */
  var _onShouldSelectFullInputValueInAutofillComponentDidUpdate: js.Any = js.native
  var _onTouchStart: js.Any = js.native
  /**
    * componentWillReceiveProps handler for the auto fill component
    * Checks/updates the iput value to set, if needed
    * @param defaultVisibleValue - the defaultVisibleValue that got passed
    *  in to the auto fill's componentWillReceiveProps
    * @returns - the updated value to set, if needed
    */
  var _onUpdateValueInAutofillWillReceiveProps: js.Any = js.native
  /**
    * Process the new input's new value when the comboBox
    * allows freeform entry
    * @param updatedValue - the input's newly changed value
    */
  var _processInputChangeWithFreeform: js.Any = js.native
  /**
    * Process the new input's new value when the comboBox
    * does not allow freeform entry
    * @param updatedValue - the input's newly changed value
    */
  var _processInputChangeWithoutFreeform: js.Any = js.native
  var _processingClearPendingInfo: js.Any = js.native
  var _processingTouch: js.Any = js.native
  var _renderComboBoxWrapper: js.Any = js.native
  var _renderHeader: js.Any = js.native
  var _renderOption: js.Any = js.native
  var _renderSeparator: js.Any = js.native
  /**
    * Reset the selected index by clearing the
    * input (of any pending text), clearing the pending state,
    * and setting the suggested display value to the last
    * selected state text
    */
  var _resetSelectedIndex: js.Any = js.native
  var _root: js.Any = js.native
  var _scrollIdleTimeoutId: js.Any = js.native
  /**
    * Scroll the selected element into view
    */
  var _scrollIntoView: js.Any = js.native
  /** The menu item element that is currently selected */
  var _selectedElement: js.Any = js.native
  /**
    * Sets the isOpen state and updates focusInputAfterClose
    */
  var _setOpenStateAndFocusOnClose: js.Any = js.native
  /**
    * Set the pending info
    * @param currentPendingValue - new pending value to set
    * @param currentPendingValueValidIndex - new pending value index to set
    * @param suggestedDisplayValue - new suggest display value to set
    */
  var _setPendingInfo: js.Any = js.native
  /**
    * Set the pending info from the given index
    * @param index - the index to set the pending info from
    */
  var _setPendingInfoFromIndex: js.Any = js.native
  /**
    * Sets the pending info for the comboBox
    * @param index - the index to search from
    * @param searchDirection - the direction to search
    */
  var _setPendingInfoFromIndexAndDirection: js.Any = js.native
  /**
    * Set the selected index. Note, this is
    * the "real" selected index, not the pending selected index
    * @param index - the index to set (or the index to set from if a search direction is provided)
    * @param searchDirection - the direction to search along the options from the given index
    */
  var _setSelectedIndex: js.Any = js.native
  var _shouldIgnoreMouseEvent: js.Any = js.native
  /**
    * Submit a pending value if there is one
    */
  var _submitPendingValue: js.Any = js.native
  /**
    * All selected options
    */
  val selectedOptions: js.Array[IComboBoxOption] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MComboBox(newProps: IComboBoxProps): Unit = js.native
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
  def focus(shouldOpenOnFocus: js.UndefOr[scala.Nothing], useFocusAsync: Boolean): Unit = js.native
  def focus(shouldOpenOnFocus: Boolean): Unit = js.native
  def focus(shouldOpenOnFocus: Boolean, useFocusAsync: Boolean): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox", "ComboBox")
@js.native
object ComboBox extends js.Object {
  var defaultProps: IComboBoxProps = js.native
}

