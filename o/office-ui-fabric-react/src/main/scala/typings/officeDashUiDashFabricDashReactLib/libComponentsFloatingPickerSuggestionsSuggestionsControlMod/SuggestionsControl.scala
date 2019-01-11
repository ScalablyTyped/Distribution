package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionsControl")
@js.native
class SuggestionsControl[T] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps[T], 
      ISuggestionsControlState[T]
    ] {
  def this(suggestionsProps: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps[T]) = this()
  var SuggestionsOfProperType: js.Any = js.native
  var _forceResolveButton: officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton = js.native
  var _searchForMoreButton: officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton = js.native
  var _selectedElement: reactLib.HTMLDivElement = js.native
  var _suggestions: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsCoreMod.SuggestionsCore[T] = js.native
  val currentSuggestion: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel[T] = js.native
  val currentSuggestionIndex: scala.Double = js.native
  val selectedElement: js.UndefOr[reactLib.HTMLDivElement] = js.native
  /* private */ def _getCurrentIndexForType(itemType: js.Any): js.Any = js.native
  /* private */ def _getNextItemSectionType(itemType: js.Any): js.Any = js.native
  /* private */ def _getPreviousItemSectionType(itemType: js.Any): js.Any = js.native
  /* protected */ def _renderSuggestions(): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * Selects the next item in the suggestion item type group, given the current index
    * If none is able to be selected, returns false, otherwise returns true
    * @param itemType - The suggestion item type
    * @param currentIndex - The current index, default is -1
    */
  /* private */ def _selectNextItemOfItemType(itemType: js.Any): js.Any = js.native
  /* private */ def _selectNextItemOfItemType(itemType: js.Any, currentIndex: js.Any): js.Any = js.native
  /**
    * Selects the previous item in the suggestion item type group, given the current index
    * If none is able to be selected, returns false, otherwise returns true
    * @param itemType - The suggestion item type
    * @param currentIndex - The current index. If none is provided, the default is the items length of specified type
    */
  /* private */ def _selectPreviousItemOfItemType(itemType: js.Any): js.Any = js.native
  /* private */ def _selectPreviousItemOfItemType(itemType: js.Any, currentIndex: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSuggestionsControl(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggestionsControl(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSuggestionsControl(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps[T]
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSuggestionsControl(): scala.Unit = js.native
  def executeSelectedAction(): scala.Unit = js.native
  /**
    * Handles the key down, returns true, if the event was handled, false otherwise
    * @param keyCode - The keyCode to handle
    */
  def handleKeyDown(keyCode: scala.Double): scala.Boolean = js.native
  def hasSelection(): scala.Boolean = js.native
  def hasSuggestionSelected(): scala.Boolean = js.native
  def removeSuggestion(): scala.Unit = js.native
  def removeSuggestion(index: scala.Double): scala.Unit = js.native
  /* protected */ def renderFooterItems(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /* protected */ def renderHeaderItems(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /**
    * Resets the selected state and selects the first selectable item
    */
  /* protected */ def resetSelectedItem(): scala.Unit = js.native
  def scrollSelected(): scala.Unit = js.native
  /**
    * Selects the first item
    */
  /* protected */ def selectFirstItem(): scala.Unit = js.native
  /**
    * Selects the last item
    */
  /* protected */ def selectLastItem(): scala.Unit = js.native
  /**
    * Selects the next selectable item
    */
  /* protected */ def selectNextItem(itemType: SuggestionItemType): scala.Unit = js.native
  /* protected */ def selectNextItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): scala.Unit = js.native
  /**
    * Selects the previous selectable item
    */
  /* protected */ def selectPreviousItem(itemType: SuggestionItemType): scala.Unit = js.native
  /* protected */ def selectPreviousItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): scala.Unit = js.native
}

