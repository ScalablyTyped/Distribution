package typings.officeUiFabricReact.dropdownBaseMod

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.dropdownTypesMod.IDropdown
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
@js.native
class DropdownBase protected ()
  extends Component[IDropdownInternalProps, IDropdownState, js.Any]
     with IDropdown {
  def this(props: IDropdownProps) = this()
  var _classNames: js.Any = js.native
  var _copyArray: js.Any = js.native
  var _dropDown: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _getAllSelectedIndices: js.Any = js.native
  var _getSelectedIndex: js.Any = js.native
  /** Get all selected indexes for multi-select mode */
  var _getSelectedIndexes: js.Any = js.native
  /** Flag for when we get the first mouseMove */
  var _gotMouseMove: js.Any = js.native
  var _host: js.Any = js.native
  var _id: js.Any = js.native
  /**
    * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
    */
  var _isAltOrMeta: js.Any = js.native
  /**
    * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
    * This helper method avoids all the repetition.
    */
  var _isDisabled: js.Any = js.native
  /** Flag for tracking whether focus is triggered by click (alternatively triggered by keyboard nav) */
  var _isFocusedByClick: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  var _labelId: js.Any = js.native
  /** True if the most recent keydown event was for alt (option) or meta (command). */
  var _lastKeyDownWasAltOrMeta: js.Any = js.native
  var _listId: js.Any = js.native
  /**
    * Finds the next valid Dropdown option and sets the selected index to it.
    * @param stepValue - Value of how many items the function should traverse.  Should be -1 or 1.
    * @param index - Index of where the search should start
    * @param selectedIndex - The selectedIndex Dropdown's state
    * @returns The next valid dropdown option's index
    */
  var _moveIndex: js.Any = js.native
  var _onChange: js.Any = js.native
  var _onDismiss: js.Any = js.native
  var _onDropdownBlur: js.Any = js.native
  var _onDropdownClick: js.Any = js.native
  var _onDropdownKeyDown: js.Any = js.native
  var _onDropdownKeyUp: js.Any = js.native
  var _onDropdownMouseDown: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onItemClick: js.Any = js.native
  var _onItemMouseEnter: js.Any = js.native
  var _onItemMouseMove: js.Any = js.native
  var _onMouseItemLeave: js.Any = js.native
  var _onPositioned: js.Any = js.native
  /** Render Caret Down Icon */
  var _onRenderCaretDown: js.Any = js.native
  /** Render Callout or Panel container and pass in list */
  var _onRenderContainer: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  /** Render custom label for drop down item */
  var _onRenderItemLabel: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  /** Render List of items */
  var _onRenderList: js.Any = js.native
  /** Render content of item (i.e. text/icon inside of button) */
  var _onRenderOption: js.Any = js.native
  /** Render placeholder text in dropdown input */
  var _onRenderPlaceholder: js.Any = js.native
  /** Render text in dropdown input */
  var _onRenderTitle: js.Any = js.native
  /**
    * Scroll handler for the callout to make sure the mouse events
    * for updating focus are not interacting during scroll
    */
  var _onScroll: js.Any = js.native
  var _onZoneKeyDown: js.Any = js.native
  var _onZoneKeyUp: js.Any = js.native
  var _optionId: js.Any = js.native
  /** Get either props.placeholder (new name) or props.placeHolder (old name) */
  val _placeholder: js.Any = js.native
  /** Wrap item list in a FocusZone */
  var _renderFocusableList: js.Any = js.native
  var _renderHeader: js.Any = js.native
  var _renderOption: js.Any = js.native
  var _renderSeparator: js.Any = js.native
  var _requestAnimationFrame: js.Any = js.native
  val _scrollIdleDelay: js.Any = js.native
  var _scrollIdleTimeoutId: js.Any = js.native
  /**
    * We close the menu on key up only if ALL of the following are true:
    * - Most recent key down was alt or meta (command)
    * - The alt/meta key down was NOT followed by some other key (such as down/up arrow to
    *   expand/collapse the menu)
    * - We're not on a Mac (or iOS)
    *
    * This is because on Windows, pressing alt moves focus to the application menu bar or similar,
    * closing any open context menus. There is not a similar behavior on Macs.
    */
  var _shouldHandleKeyUp: js.Any = js.native
  var _shouldIgnoreMouseEvent: js.Any = js.native
  /**
    * Returns true if dropdown should set to open on focus.
    * Otherwise, isOpen state should be toggled on click
    */
  var _shouldOpenOnFocus: js.Any = js.native
  var _sizePosCache: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MDropdownBase(newProps: IDropdownProps): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDropdownBase(prevProps: IDropdownProps, prevState: IDropdownState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDropdownBase(): Unit = js.native
  def setSelectedIndex(event: FormEvent[HTMLDivElement], index: Double): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
@js.native
object DropdownBase extends js.Object {
  var defaultProps: Options = js.native
}

