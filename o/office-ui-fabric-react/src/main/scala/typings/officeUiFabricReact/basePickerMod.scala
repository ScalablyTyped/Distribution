package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZone
import typings.officeUiFabricReact.anon.Items
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
import typings.std.PromiseLike
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
  @js.native
  open class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends Component[P, IBasePickerState, Any]
       with IBasePicker[T] {
    def this(basePickerProps: P) = this()
    
    /**
      * @deprecated this is no longer necessary as typescript now supports generic elements
      */
    /* protected */ var SuggestionOfProperType: Instantiable1[/* props */ ISuggestionsProps[T], Suggestions[T]] = js.native
    
    /* protected */ var _ariaMap: IPickerAriaIds = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _completeGenericSuggestion: Any = js.native
    
    /**
      * Suggestions are normally shown after the user updates text and the text
      * is non-empty, but also when the user clicks on the input element.
      * @returns True if suggestions should be shown.
      */
    /* private */ var _getShowSuggestions: Any = js.native
    
    /* private */ var _getTextFromItem: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _onResolveSuggestions: Any = js.native
    
    /* private */ var _onSelectedItemsUpdated: Any = js.native
    
    /* protected */ def _shouldFocusZoneEnterInnerZone(ev: KeyboardEvent[HTMLElement]): Boolean = js.native
    
    /* private */ var _styledSuggestions: Any = js.native
    
    /**
      * Takes in the current updated value and either resolves it with the new suggestions
      * or if updated value is undefined then it clears out currently suggested items
      */
    /* private */ var _updateAndResolveValue: Any = js.native
    
    /**
      * Controls what happens whenever there is an action that impacts the selected items.
      * If `selectedItems` is provided, this will act as a controlled component and it will not update its own state.
      */
    /* private */ var _updateSelectedItems: Any = js.native
    
    /**
      * This should be called when the user does something other than use text entry to trigger suggestions.
      *
      */
    /* private */ var _userTriggeredSuggestions: Any = js.native
    
    /* protected */ def addItem(item: T): Unit = js.native
    
    /* protected */ def addItemByIndex(index: Double): Unit = js.native
    
    /* protected */ def canAddItems(): Boolean = js.native
    
    /* protected */ def completeSelection(item: T): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBasePicker(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBasePicker(oldProps: P, oldState: IBasePickerState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBasePicker(): Unit = js.native
    
    /* protected */ var currentPromise: js.UndefOr[PromiseLike[Any]] = js.native
    
    def dismissSuggestions(): Unit = js.native
    def dismissSuggestions(ev: Any): Unit = js.native
    
    /* protected */ var focusZone: RefObject[IFocusZone] = js.native
    
    /* protected */ def getActiveDescendant(): js.UndefOr[String] = js.native
    
    /* protected */ def getSuggestionsAlert(): js.UndefOr[Element] = js.native
    /* protected */ def getSuggestionsAlert(suggestionAlertClassName: String): js.UndefOr[Element] = js.native
    
    /* protected */ var input: RefObject[IAutofill] = js.native
    
    @JSName("items")
    val items_BasePicker: js.Array[T] = js.native
    
    /* protected */ def onBackspace(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onBlur(ev: FocusEvent[HTMLElement | Autofill, typings.std.Element]): Unit = js.native
    
    /* protected */ def onChange(): Unit = js.native
    /* protected */ def onChange(items: js.Array[T]): Unit = js.native
    
    /**
      * Reveals suggestions any time the user clicks on the input element
      * without shifting focus.
      */
    /* protected */ def onClick(ev: typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent]): Unit = js.native
    
    /**
      * Only to be called when there is nothing in the input. Checks to see if the consumer has
      * provided a function to resolve suggestions
      */
    /* protected */ def onEmptyInputFocus(): Unit = js.native
    
    /* protected */ def onGetMoreResults(): Unit = js.native
    
    /* protected */ def onInputBlur(ev: FocusEvent[HTMLInputElement | Autofill, typings.std.Element]): Unit = js.native
    
    /* protected */ def onInputChange(value: String): Unit = js.native
    
    /* protected */ def onInputFocus(ev: FocusEvent[HTMLInputElement | Autofill, typings.std.Element]): Unit = js.native
    
    /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
    
    /* protected */ def onKeyDown(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def onSuggestionClick(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: Any, index: Double): Unit = js.native
    
    /* protected */ def onSuggestionRemove(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
    
    /* protected */ def onSuggestionSelect(): Unit = js.native
    
    def refocusSuggestions(keyCode: Double): Unit = js.native
    
    /* protected */ def removeItem(item: IPickerItemProps[T]): Unit = js.native
    /* protected */ def removeItem(item: IPickerItemProps[T], focusNextItem: Boolean): Unit = js.native
    
    /* protected */ def removeItems(itemsToRemove: js.Array[Any]): Unit = js.native
    
    /* protected */ def renderItems(): js.Array[Element] = js.native
    
    /* protected */ def renderSuggestions(): Element | Null = js.native
    
    /* protected */ def resetFocus(): Unit = js.native
    /* protected */ def resetFocus(index: Double): Unit = js.native
    
    /* protected */ def resolveNewValue(updatedValue: String, suggestions: js.Array[T]): Unit = js.native
    
    /* protected */ var root: RefObject[HTMLDivElement] = js.native
    
    /* protected */ var selection: Selection[IObjectWithKey] = js.native
    
    /* protected */ var suggestionElement: RefObject[ISuggestions[T]] = js.native
    
    /* protected */ var suggestionStore: SuggestionsController[T] = js.native
    
    /* protected */ def updateSuggestions(suggestions: js.Array[Any]): Unit = js.native
    
    /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: js.Array[T], updatedValue: String): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: PromiseLike[js.Array[T]]): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: PromiseLike[js.Array[T]], updatedValue: String): Unit = js.native
    
    /* protected */ def updateValue(updatedValue: String): Unit = js.native
  }
  /* static members */
  object BasePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(newProps: IBasePickerProps[Any]): Items | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any]).asInstanceOf[Items | Null]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePickerListBelow")
  @js.native
  open class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] protected () extends BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  trait IBasePickerState extends StObject {
    
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.undefined
    
    var isResultsFooterVisible: js.UndefOr[Boolean] = js.undefined
    
    var isSearching: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[Any] = js.undefined
    
    var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.undefined
    
    var selectedIndices: js.UndefOr[js.Array[Double]] = js.undefined
    
    var suggestedDisplayValue: js.UndefOr[String] = js.undefined
    
    var suggestionsLoading: js.UndefOr[Boolean] = js.undefined
    
    var suggestionsVisible: js.UndefOr[Boolean] = js.undefined
  }
  object IBasePickerState {
    
    inline def apply(): IBasePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBasePickerState]
    }
    
    extension [Self <: IBasePickerState](x: Self) {
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setIsMostRecentlyUsedVisible(value: Boolean): Self = StObject.set(x, "isMostRecentlyUsedVisible", value.asInstanceOf[js.Any])
      
      inline def setIsMostRecentlyUsedVisibleUndefined: Self = StObject.set(x, "isMostRecentlyUsedVisible", js.undefined)
      
      inline def setIsResultsFooterVisible(value: Boolean): Self = StObject.set(x, "isResultsFooterVisible", value.asInstanceOf[js.Any])
      
      inline def setIsResultsFooterVisibleUndefined: Self = StObject.set(x, "isResultsFooterVisible", js.undefined)
      
      inline def setIsSearching(value: Boolean): Self = StObject.set(x, "isSearching", value.asInstanceOf[js.Any])
      
      inline def setIsSearchingUndefined: Self = StObject.set(x, "isSearching", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMoreSuggestionsAvailable(value: Boolean): Self = StObject.set(x, "moreSuggestionsAvailable", value.asInstanceOf[js.Any])
      
      inline def setMoreSuggestionsAvailableUndefined: Self = StObject.set(x, "moreSuggestionsAvailable", js.undefined)
      
      inline def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      inline def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setSuggestedDisplayValue(value: String): Self = StObject.set(x, "suggestedDisplayValue", value.asInstanceOf[js.Any])
      
      inline def setSuggestedDisplayValueUndefined: Self = StObject.set(x, "suggestedDisplayValue", js.undefined)
      
      inline def setSuggestionsLoading(value: Boolean): Self = StObject.set(x, "suggestionsLoading", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsLoadingUndefined: Self = StObject.set(x, "suggestionsLoading", js.undefined)
      
      inline def setSuggestionsVisible(value: Boolean): Self = StObject.set(x, "suggestionsVisible", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVisibleUndefined: Self = StObject.set(x, "suggestionsVisible", js.undefined)
    }
  }
  
  trait IPickerAriaIds extends StObject {
    
    /**
      * Aria id for the component that has role=combobox
      */
    var combobox: String
    
    /**
      * Aria id for selected items container component
      */
    var selectedItems: String
    
    /**
      * Aria id for selected suggestion alert component
      */
    var selectedSuggestionAlert: String
    
    /**
      * Aria id for suggestions list component
      */
    var suggestionList: String
  }
  object IPickerAriaIds {
    
    inline def apply(combobox: String, selectedItems: String, selectedSuggestionAlert: String, suggestionList: String): IPickerAriaIds = {
      val __obj = js.Dynamic.literal(combobox = combobox.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectedSuggestionAlert = selectedSuggestionAlert.asInstanceOf[js.Any], suggestionList = suggestionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerAriaIds]
    }
    
    extension [Self <: IPickerAriaIds](x: Self) {
      
      inline def setCombobox(value: String): Self = StObject.set(x, "combobox", value.asInstanceOf[js.Any])
      
      inline def setSelectedItems(value: String): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedSuggestionAlert(value: String): Self = StObject.set(x, "selectedSuggestionAlert", value.asInstanceOf[js.Any])
      
      inline def setSuggestionList(value: String): Self = StObject.set(x, "suggestionList", value.asInstanceOf[js.Any])
    }
  }
}
