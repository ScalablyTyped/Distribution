package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typings.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.libAutofillMod.Autofill
import typings.officeUiFabricReact.libFloatingPickerMod.BaseFloatingPicker
import typings.officeUiFabricReact.libSelectedItemsListMod.BaseSelectedItemsList
import typings.officeUiFabricReact.libSelectionMod.Selection
import typings.react.mod.ClipboardEvent
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
  @js.native
  open class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends Component[P, IBaseExtendedPickerState[T], Any]
       with IBaseExtendedPicker[T] {
    def this(basePickerProps: P) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
    
    /* private */ var _addProcessedItem: Any = js.native
    
    /* protected */ def _onSelectedItemsChanged(): Unit = js.native
    
    /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
    
    /**
      * The floating picker is the source of truth for if the menu has been opened or not.
      *
      * Because this isn't tracked inside the state of this component, we need to
      * force an update here to keep the rendered output that depends on the picker being open
      * in sync with the state
      *
      * Called when the suggestions is shown or closed
      */
    /* private */ var _onSuggestionsShownOrHidden: Any = js.native
    
    /* protected */ def canAddItems(): Boolean = js.native
    
    def clearInput(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseExtendedPicker(): Unit = js.native
    
    var floatingPicker: RefObject[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
    
    /* protected */ var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
    
    /** Sets focus to the input. */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    val highlightedItems: js.Array[T] = js.native
    
    /* protected */ var input: RefObject[Autofill] = js.native
    
    val inputElement: HTMLInputElement | Null = js.native
    
    /* protected */ def onBackspace(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onCopy(ev: ClipboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onInputChange(value: String): Unit = js.native
    /* protected */ def onInputChange(value: String, composing: Boolean): Unit = js.native
    
    /* protected */ def onInputClick(ev: typings.react.mod.MouseEvent[HTMLInputElement | Autofill, MouseEvent]): Unit = js.native
    
    /* protected */ def onInputFocus(ev: FocusEvent[HTMLInputElement | Autofill, Element]): Unit = js.native
    
    /* protected */ def onPaste(ev: ClipboardEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def renderFloatingPicker(): typings.react.mod.global.JSX.Element = js.native
    
    /* protected */ def renderSelectedItemsList(): typings.react.mod.global.JSX.Element = js.native
    
    /* protected */ var root: RefObject[HTMLDivElement] = js.native
    
    var selectedItemsList: RefObject[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
    
    /* protected */ var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
    
    /* protected */ var selection: Selection[IObjectWithKey] = js.native
  }
  
  trait IBaseExtendedPickerState[T] extends StObject {
    
    var queryString: String | Null
    
    var selectedItems: js.Array[T] | Null
    
    var suggestionItems: js.Array[T] | Null
  }
  object IBaseExtendedPickerState {
    
    inline def apply[T](): IBaseExtendedPickerState[T] = {
      val __obj = js.Dynamic.literal(queryString = null, selectedItems = null, suggestionItems = null)
      __obj.asInstanceOf[IBaseExtendedPickerState[T]]
    }
    
    extension [Self <: IBaseExtendedPickerState[?], T](x: Self & IBaseExtendedPickerState[T]) {
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringNull: Self = StObject.set(x, "queryString", null)
      
      inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsNull: Self = StObject.set(x, "selectedItems", null)
      
      inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSuggestionItems(value: js.Array[T]): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsNull: Self = StObject.set(x, "suggestionItems", null)
      
      inline def setSuggestionItemsVarargs(value: T*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
    }
  }
}
