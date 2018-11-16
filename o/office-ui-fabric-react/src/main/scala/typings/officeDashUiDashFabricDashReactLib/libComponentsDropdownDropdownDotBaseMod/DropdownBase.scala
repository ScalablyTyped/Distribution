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
  var _gotMouseMove: js.Any = js.native
  var _host: js.Any = js.native
  var _id: js.Any = js.native
  /**
       * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
       * This helper method avoids all the repetition.
       */
  var _isDisabled: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  var _onDismiss: js.Any = js.native
  var _onDropdownBlur: js.Any = js.native
  var _onDropdownClick: js.Any = js.native
  var _onDropdownKeyDown: js.Any = js.native
  var _onDropdownKeyUp: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onItemClick: js.Any = js.native
  var _onMouseItemLeave: js.Any = js.native
  var _onPositioned: js.Any = js.native
  var _onRenderCaretDown: js.Any = js.native
  var _onRenderContainer: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  var _onRenderList: js.Any = js.native
  var _onRenderOption: js.Any = js.native
  var _onRenderPlaceHolder: js.Any = js.native
  var _onRenderTitle: js.Any = js.native
  /**
       * Scroll handler for the callout to make sure the mouse events
       * for updating focus are not interacting during scroll
       */
  var _onScroll: js.Any = js.native
  var _onZoneKeyDown: js.Any = js.native
  var _onZoneKeyUp: js.Any = js.native
  var _processingExpandCollapseKeyOnly: js.Any = js.native
  var _renderOption: js.Any = js.native
  val _scrollIdleDelay: js.Any = js.native
  var _scrollIdleTimeoutId: js.Any = js.native
  var _sizePosCache: js.Any = js.native
  /* private */ def _copyArray(array: js.Any): js.Any = js.native
  /* private */ def _getAllSelectedIndices(options: js.Any): js.Any = js.native
  /* private */ def _getAllSelectedOptions(options: js.Any, selectedIndices: js.Any): js.Any = js.native
  /* private */ def _getSelectedIndex(options: js.Any, selectedKey: js.Any): js.Any = js.native
  /* private */ def _getSelectedIndexes(options: js.Any, selectedKey: js.Any): js.Any = js.native
  /* private */ def _isExpandCollapseKey(ev: js.Any): js.Any = js.native
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
  /* private */ def _renderHeader(item: js.Any): js.Any = js.native
  /* private */ def _renderSeparator(item: js.Any): js.Any = js.native
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

