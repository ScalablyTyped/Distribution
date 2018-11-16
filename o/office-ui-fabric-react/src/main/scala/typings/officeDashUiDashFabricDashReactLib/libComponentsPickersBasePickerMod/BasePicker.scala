package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
@js.native
class BasePicker[T, P /* <: officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps[T] */] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[P, IBasePickerState]
     with officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IBasePicker[T] {
  def this(basePickerProps: P) = this()
  var SuggestionOfProperType: ScalablyTyped.runtime.Instantiable1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps[T], 
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsMod.Suggestions[T]
  ] = js.native
  var _ariaMap: IPickerAriaIds = js.native
  var _id: js.Any = js.native
  var currentPromise: js.UndefOr[stdLib.PromiseLike[_]] = js.native
  @JSName("focusZone")
  var focusZone_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrent = js.native
  @JSName("input")
  var input_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentIAutofill = js.native
  /** Gets the current value of the input. */
  /* CompleteClass */
  override var items: js.UndefOr[js.Array[T]] = js.native
  @JSName("items")
  val items_BasePicker: js.Array[T] = js.native
  @JSName("root")
  var root_Original: officeDashUiDashFabricDashReactLib.Anon_Component = js.native
  var selection: officeDashUiDashFabricDashReactLib.libUtilitiesSelectionMod.Selection = js.native
  @JSName("suggestionElement")
  var suggestionElement_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValue[T] = js.native
  var suggestionStore: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.SuggestionsController[T] = js.native
  /* private */ def _getTextFromItem(item: js.Any): js.Any = js.native
  /* private */ def _getTextFromItem(item: js.Any, currentValue: js.Any): js.Any = js.native
  /* protected */ def _isFocusZoneInnerKeystroke(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Boolean = js.native
  /* private */ def _onResolveSuggestions(updatedValue: js.Any): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(items: js.Any): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(items: js.Any, focusIndex: js.Any): js.Any = js.native
  /* private */ def _onValidateInput(): js.Any = js.native
  /**
       * Takes in the current updated value and either resolves it with the new suggestions
       * or if updated value is undefined then it clears out currently suggested items
       */
  /* private */ def _updateAndResolveValue(updatedValue: js.Any, newSuggestions: js.Any): js.Any = js.native
  /**
       * Controls what happens whenever there is an action that impacts the selected items.
       * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
       */
  /* private */ def _updateSelectedItems(items: js.Any): js.Any = js.native
  /**
       * Controls what happens whenever there is an action that impacts the selected items.
       * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
       */
  /* private */ def _updateSelectedItems(items: js.Any, focusIndex: js.Any): js.Any = js.native
  /* protected */ def addItem(item: T): scala.Unit = js.native
  /* protected */ def addItemByIndex(index: scala.Double): scala.Unit = js.native
  /* protected */ def canAddItems(): scala.Boolean = js.native
  def completeSuggestion(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBasePicker(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBasePicker(newProps: P): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBasePicker(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MBasePicker(newProps: P, newState: IBasePickerState): scala.Unit = js.native
  def dismissSuggestions(): scala.Unit = js.native
  def dismissSuggestions(ev: js.Any): scala.Unit = js.native
  /** Sets focus to the focus zone. */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
  /** Set focus to the input */
  /* CompleteClass */
  override def focusInput(): scala.Unit = js.native
  /* protected */ def focusZone(): scala.Unit = js.native
  /* protected */ def focusZone(
    component: officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZone
  ): scala.Unit = js.native
  /* protected */ def getActiveDescendant(): js.UndefOr[java.lang.String] = js.native
  /* protected */ def getSuggestionsAlert(): js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.native
  /* protected */ def input(): scala.Unit = js.native
  /* protected */ def input(component: officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod.IAutofill): scala.Unit = js.native
  /* protected */ def onBackspace(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /* protected */ def onChange(): scala.Unit = js.native
  /* protected */ def onChange(items: js.Array[T]): scala.Unit = js.native
  /* protected */ def onEmptyInputFocus(): scala.Unit = js.native
  /* protected */ def onGetMoreResults(): scala.Unit = js.native
  /* protected */ def onInputBlur(
    ev: reactLib.reactMod.ReactNs.FocusEvent[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libComponentsAutofillMod.Autofill
    ]
  ): scala.Unit = js.native
  /* protected */ def onInputChange(value: java.lang.String): scala.Unit = js.native
  /* protected */ def onInputFocus(
    ev: reactLib.reactMod.ReactNs.FocusEvent[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libComponentsAutofillMod.Autofill
    ]
  ): scala.Unit = js.native
  /* protected */ def onItemChange(changedItem: T, index: scala.Double): scala.Unit = js.native
  /* protected */ def onKeyDown(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /* protected */ def onSelectionChange(): scala.Unit = js.native
  /* protected */ def onSuggestionClick(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], item: js.Any, index: scala.Double): scala.Unit = js.native
  /* protected */ def onSuggestionRemove(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement],
    item: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps,
    index: scala.Double
  ): scala.Unit = js.native
  /* protected */ def onSuggestionSelect(): scala.Unit = js.native
  def refocusSuggestions(keyCode: atUifabricUtilitiesLib.libKeyCodesMod.KeyCodes): scala.Unit = js.native
  /* protected */ def removeItem(
    item: officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps[T]
  ): scala.Unit = js.native
  /* protected */ def removeItem(
    item: officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps[T],
    focusNextItem: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def removeItems(itemsToRemove: js.Array[_]): scala.Unit = js.native
  /* protected */ def renderItems(): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  /* protected */ def renderSuggestions(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /* protected */ def resetFocus(): scala.Unit = js.native
  /* protected */ def resetFocus(index: scala.Double): scala.Unit = js.native
  /* protected */ def resolveNewValue(updatedValue: java.lang.String, suggestions: js.Array[T]): scala.Unit = js.native
  /* protected */ def root(): scala.Unit = js.native
  /* protected */ def root(component: reactLib.HTMLDivElement): scala.Unit = js.native
  /* protected */ def suggestionElement(): scala.Unit = js.native
  /* protected */ def suggestionElement(
    component: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsMod.Suggestions[T]
  ): scala.Unit = js.native
  /* protected */ def updateSuggestions(suggestions: js.Array[_]): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T], updatedValue: java.lang.String): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: stdLib.PromiseLike[js.Array[T]]): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: stdLib.PromiseLike[js.Array[T]], updatedValue: java.lang.String): scala.Unit = js.native
  /* protected */ def updateValue(updatedValue: java.lang.String): scala.Unit = js.native
}

