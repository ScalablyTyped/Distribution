package typings
package officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
@js.native
class DropdownBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[IDropdownInternalProps, IDropdownState] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotTypesMod.IDropdownProps) = this()
  var _classNames: js.Any = js.native
  var _dropDown: js.Any = js.native
  var _focusZone: js.Any = js.native
  /** Flag for when we get the first mouseMove */
  var _gotMouseMove: js.Any = js.native
  var _host: js.Any = js.native
  var _id: js.Any = js.native
  /**
       * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
       * This helper method avoids all the repetition.
       */
  var _isDisabled: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  /** True if the most recent keydown event was for alt (option) or meta (command). */
  var _lastKeyDownWasAltOrMeta: js.Any = js.native
  var _onDismiss: js.Any = js.native
  var _onDropdownBlur: js.Any = js.native
  var _onDropdownClick: js.Any = js.native
  var _onDropdownKeyDown: js.Any = js.native
  var _onDropdownKeyUp: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onItemClick: js.Any = js.native
  var _onMouseItemLeave: js.Any = js.native
  var _onPositioned: js.Any = js.native
  /** Render Caret Down Icon */
  var _onRenderCaretDown: js.Any = js.native
  /** Render Callout or Panel container and pass in list */
  var _onRenderContainer: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  /** Render custom label for drop down item */
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
  /** Get either props.placeholder (new name) or props.placeHolder (old name) */
  val _placeholder: js.Any = js.native
  var _renderOption: js.Any = js.native
  val _scrollIdleDelay: js.Any = js.native
  var _scrollIdleTimeoutId: js.Any = js.native
  var _sizePosCache: js.Any = js.native
  /* private */ def _copyArray(array: js.Any): js.Any = js.native
  /* private */ def _getAllSelectedIndices(options: js.Any): js.Any = js.native
  /** Get all selected options for multi-select mode */
  /* private */ def _getAllSelectedOptions(options: js.Any, selectedIndices: js.Any): js.Any = js.native
  /* private */ def _getSelectedIndex(options: js.Any, selectedKey: js.Any): js.Any = js.native
  /** Get all selected indexes for multi-select mode */
  /* private */ def _getSelectedIndexes(options: js.Any, selectedKey: js.Any): js.Any = js.native
  /**
       * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
       */
  /* private */ def _isAltOrMeta(ev: js.Any): js.Any = js.native
  /**
       * Finds the next valid Dropdown option and sets the selected index to it.
       * @param stepValue Value of how many items the function should traverse.  Should be -1 or 1.
       * @param index Index of where the search should start
       * @param selectedIndex The selectedIndex Dropdown's state
       * @returns The next valid dropdown option's index
       */
  /* private */ def _moveIndex(event: js.Any, stepValue: js.Any, index: js.Any, selectedIndex: js.Any): js.Any = js.native
  /* private */ def _onItemMouseEnter(item: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onItemMouseMove(item: js.Any, ev: js.Any): js.Any = js.native
  /** Wrap item list in a FocusZone */
  /* private */ def _renderFocusableList(props: js.Any): js.Any = js.native
  /* private */ def _renderHeader(item: js.Any): js.Any = js.native
  /* private */ def _renderSeparator(item: js.Any): js.Any = js.native
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
  /* private */ def _shouldHandleKeyUp(ev: js.Any): js.Any = js.native
  /* private */ def _shouldIgnoreMouseEvent(): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDropdownBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotTypesMod.IDropdownProps,
    prevState: IDropdownState
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDropdownBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotTypesMod.IDropdownProps
  ): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def focus(shouldOpenOnFocus: scala.Boolean): scala.Unit = js.native
  def setSelectedIndex(event: reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLDivElement], index: scala.Double): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
@js.native
object DropdownBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_Options = js.native
}

