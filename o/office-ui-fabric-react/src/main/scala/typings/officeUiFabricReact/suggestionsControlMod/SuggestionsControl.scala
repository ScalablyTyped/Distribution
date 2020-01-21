package typings.officeUiFabricReact.suggestionsControlMod

import typings.officeUiFabricReact.buttonTypesMod.IButton
import typings.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionsControl")
@js.native
class SuggestionsControl[T] protected () extends BaseComponent[ISuggestionsControlProps[T], ISuggestionsControlState[T]] {
  def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  var SuggestionsOfProperType: js.Any = js.native
  var _forceResolveButton: IButton = js.native
  var _getCurrentIndexForType: js.Any = js.native
  var _getNextItemSectionType: js.Any = js.native
  var _getPreviousItemSectionType: js.Any = js.native
  var _searchForMoreButton: IButton = js.native
  /**
    * Selects the next item in the suggestion item type group, given the current index
    * If none is able to be selected, returns false, otherwise returns true
    * @param itemType - The suggestion item type
    * @param currentIndex - The current index, default is -1
    */
  var _selectNextItemOfItemType: js.Any = js.native
  /**
    * Selects the previous item in the suggestion item type group, given the current index
    * If none is able to be selected, returns false, otherwise returns true
    * @param itemType - The suggestion item type
    * @param currentIndex - The current index. If none is provided, the default is the items length of specified type
    */
  var _selectPreviousItemOfItemType: js.Any = js.native
  var _selectedElement: HTMLDivElement = js.native
  var _suggestions: SuggestionsCore[T] = js.native
  val currentSuggestion: ISuggestionModel[T] = js.native
  val currentSuggestionIndex: Double = js.native
  val selectedElement: js.UndefOr[HTMLDivElement] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSuggestionsControl(newProps: ISuggestionsControlProps[T]): Unit = js.native
  /* protected */ def _renderSuggestions(): Element = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSuggestionsControl(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggestionsControl(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSuggestionsControl(): Unit = js.native
  def executeSelectedAction(): Unit = js.native
  /**
    * Handles the key down, returns true, if the event was handled, false otherwise
    * @param keyCode - The keyCode to handle
    */
  def handleKeyDown(keyCode: Double): Boolean = js.native
  def hasSelection(): Boolean = js.native
  def hasSuggestionSelected(): Boolean = js.native
  def removeSuggestion(): Unit = js.native
  def removeSuggestion(index: Double): Unit = js.native
  /* protected */ def renderFooterItems(): Element | Null = js.native
  /* protected */ def renderHeaderItems(): Element | Null = js.native
  /**
    * Resets the selected state and selects the first selectable item
    */
  /* protected */ def resetSelectedItem(): Unit = js.native
  def scrollSelected(): Unit = js.native
  /**
    * Selects the first item
    */
  /* protected */ def selectFirstItem(): Unit = js.native
  /**
    * Selects the last item
    */
  /* protected */ def selectLastItem(): Unit = js.native
  /**
    * Selects the next selectable item
    */
  /* protected */ def selectNextItem(itemType: SuggestionItemType): Unit = js.native
  /* protected */ def selectNextItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): Unit = js.native
  /**
    * Selects the previous selectable item
    */
  /* protected */ def selectPreviousItem(itemType: SuggestionItemType): Unit = js.native
  /* protected */ def selectPreviousItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): Unit = js.native
}

