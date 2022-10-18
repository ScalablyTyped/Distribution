package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPicker
import typings.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PromiseLike
import typings.std.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerBaseFloatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/BaseFloatingPicker", "BaseFloatingPicker")
  @js.native
  open class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends Component[P, IBaseFloatingPickerState, Any]
       with IBaseFloatingPicker {
    def this(basePickerProps: P) = this()
    
    /* protected */ var SuggestionsControlOfProperType: Instantiable1[/* props */ ISuggestionsControlProps[T], SuggestionsControl[T]] = js.native
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseFloatingPicker(newProps: IBaseFloatingPickerProps[T]): Unit = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _bindToInputElement: Any = js.native
    
    /* private */ var _onResolveSuggestions: Any = js.native
    
    /* private */ var _onValidateInput: Any = js.native
    
    /* private */ var _unbindFromInputElement: Any = js.native
    
    /* private */ var _updateActiveDescendant: Any = js.native
    
    /* private */ var _updateSuggestionsVisible: Any = js.native
    
    def completeSuggestion(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseFloatingPicker(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBaseFloatingPicker(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseFloatingPicker(): Unit = js.native
    
    /* protected */ var currentPromise: PromiseLike[js.Array[T]] = js.native
    
    val currentSelectedSuggestionIndex: Double = js.native
    
    def forceResolveSuggestion(): Unit = js.native
    
    /* protected */ var isComponentMounted: Boolean = js.native
    
    /* protected */ def onChange(item: T): Unit = js.native
    
    /* protected */ def onKeyDown(ev: MouseEvent): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def onSuggestionClick(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
    
    /* protected */ def onSuggestionRemove(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
    
    /* protected */ def renderSuggestions(): Element | Null = js.native
    
    /* protected */ var root: RefObject[HTMLDivElement] = js.native
    
    /* protected */ var selection: Selection = js.native
    
    /* protected */ var suggestionStore: SuggestionsStore[T] = js.native
    
    /* protected */ var suggestionsControl: RefObject[SuggestionsControl[T]] = js.native
    
    /* protected */ def updateSuggestionWithZeroState(): Unit = js.native
    
    def updateSuggestions(suggestions: js.Array[T]): Unit = js.native
    def updateSuggestions(suggestions: js.Array[T], forceUpdate: Boolean): Unit = js.native
    
    /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: PromiseLike[js.Array[T]]): Unit = js.native
    
    /* protected */ def updateValue(updatedValue: String): Unit = js.native
  }
  
  trait IBaseFloatingPickerState extends StObject {
    
    var didBind: Boolean
    
    var queryString: String
    
    var suggestionsVisible: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseFloatingPickerState {
    
    inline def apply(didBind: Boolean, queryString: String): IBaseFloatingPickerState = {
      val __obj = js.Dynamic.literal(didBind = didBind.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseFloatingPickerState]
    }
    
    extension [Self <: IBaseFloatingPickerState](x: Self) {
      
      inline def setDidBind(value: Boolean): Self = StObject.set(x, "didBind", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVisible(value: Boolean): Self = StObject.set(x, "suggestionsVisible", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVisibleUndefined: Self = StObject.set(x, "suggestionsVisible", js.undefined)
    }
  }
}
