package typings.officeUiFabricReact.basePickerMod

import org.scalablytyped.runtime.Instantiable1
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZone
import typings.officeUiFabricReact.autofillMod.Autofill
import typings.officeUiFabricReact.autofillTypesMod.IAutofill
import typings.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.officeUiFabricReact.selectionMod.Selection
import typings.officeUiFabricReact.suggestionsControllerMod.SuggestionsController
import typings.officeUiFabricReact.suggestionsMod.Suggestions
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestions
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends Component[P, IBasePickerState, js.Any]
     with IBasePicker[T] {
  def this(basePickerProps: P) = this()
  /**
    * @deprecated this is no longer necessary as typescript now supports generic elements
    */
  var SuggestionOfProperType: Instantiable1[/* props */ ISuggestionsProps[T], Suggestions[T]] = js.native
  var _ariaMap: IPickerAriaIds = js.native
  var _async: js.Any = js.native
  var _completeGenericSuggestion: js.Any = js.native
  /**
    * Suggestions are normally shown after the user updates text and the text
    * is non-empty, but also when the user clicks on the input element.
    * @returns True if suggestions should be shown.
    */
  var _getShowSuggestions: js.Any = js.native
  var _getTextFromItem: js.Any = js.native
  var _id: js.Any = js.native
  var _onResolveSuggestions: js.Any = js.native
  var _onSelectedItemsUpdated: js.Any = js.native
  var _requestSuggestionsOnClick: js.Any = js.native
  var _styledSuggestions: js.Any = js.native
  /**
    * Takes in the current updated value and either resolves it with the new suggestions
    * or if updated value is undefined then it clears out currently suggested items
    */
  var _updateAndResolveValue: js.Any = js.native
  /**
    * Controls what happens whenever there is an action that impacts the selected items.
    * If `selectedItems` is provided, this will act as a controlled component and it will not update its own state.
    */
  var _updateSelectedItems: js.Any = js.native
  var currentPromise: js.UndefOr[js.Thenable[_]] = js.native
  var focusZone: RefObject[IFocusZone] = js.native
  var input: RefObject[IAutofill] = js.native
  @JSName("items")
  val items_BasePicker: js.Array[T] = js.native
  var root: RefObject[HTMLDivElement] = js.native
  var selection: Selection[IObjectWithKey] = js.native
  var suggestionElement: RefObject[ISuggestions[T]] = js.native
  var suggestionStore: SuggestionsController[T] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBasePicker(newProps: P): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MBasePicker(newProps: P, newState: IBasePickerState): Unit = js.native
  /* protected */ def _shouldFocusZoneEnterInnerZone(ev: KeyboardEvent[HTMLElement]): Boolean = js.native
  /* protected */ def addItem(item: T): Unit = js.native
  /* protected */ def addItemByIndex(index: Double): Unit = js.native
  /* protected */ def canAddItems(): Boolean = js.native
  /* protected */ def completeSelection(item: T): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBasePicker(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBasePicker(): Unit = js.native
  def dismissSuggestions(): Unit = js.native
  def dismissSuggestions(ev: js.Any): Unit = js.native
  /* protected */ def getActiveDescendant(): js.UndefOr[String] = js.native
  /* protected */ def getSuggestionsAlert(): js.UndefOr[Element] = js.native
  /* protected */ def getSuggestionsAlert(suggestionAlertClassName: String): js.UndefOr[Element] = js.native
  /* protected */ def onBackspace(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onBlur(ev: FocusEvent[HTMLElement | Autofill]): Unit = js.native
  /* protected */ def onChange(): Unit = js.native
  /* protected */ def onChange(items: js.Array[T]): Unit = js.native
  /**
    * Reveals suggestions any time the user clicks on the input element
    * without shifting focus.
    */
  /* protected */ def onClick(ev: typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent]): Unit = js.native
  /* protected */ def onEmptyInputFocus(): Unit = js.native
  /* protected */ def onGetMoreResults(): Unit = js.native
  /* protected */ def onInputBlur(ev: FocusEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onInputChange(value: String): Unit = js.native
  /* protected */ def onInputFocus(ev: FocusEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
  /* protected */ def onKeyDown(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def onSuggestionClick(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: js.Any, index: Double): Unit = js.native
  /* protected */ def onSuggestionRemove(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
  /* protected */ def onSuggestionSelect(): Unit = js.native
  def refocusSuggestions(keyCode: Double): Unit = js.native
  /* protected */ def removeItem(item: IPickerItemProps[T]): Unit = js.native
  /* protected */ def removeItem(item: IPickerItemProps[T], focusNextItem: Boolean): Unit = js.native
  /* protected */ def removeItems(itemsToRemove: js.Array[_]): Unit = js.native
  /* protected */ def renderItems(): js.Array[Element] = js.native
  /* protected */ def renderSuggestions(): Element | Null = js.native
  /* protected */ def resetFocus(): Unit = js.native
  /* protected */ def resetFocus(index: Double): Unit = js.native
  /* protected */ def resolveNewValue(updatedValue: String, suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestions(suggestions: js.Array[_]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T], updatedValue: String): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]], updatedValue: String): Unit = js.native
  /* protected */ def updateValue(updatedValue: String): Unit = js.native
}

