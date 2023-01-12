package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButton
import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionsProps
import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersSuggestionsSuggestionsMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions", "Suggestions")
  @js.native
  open class Suggestions[T] protected () extends Component[ISuggestionsProps[T], ISuggestionsState, Any] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _forceResolve: Any = js.native
    
    /* protected */ var _forceResolveButton: RefObject[IButton] = js.native
    
    /* private */ var _getAlertText: Any = js.native
    
    /* private */ var _getMoreResults: Any = js.native
    
    /* private */ var _onClickTypedSuggestionsItem: Any = js.native
    
    /* private */ var _onRemoveTypedSuggestionsItem: Any = js.native
    
    /* private */ var _refocusOnSuggestions: Any = js.native
    
    /* private */ var _renderSuggestions: Any = js.native
    
    /* protected */ var _searchForMoreButton: RefObject[IButton] = js.native
    
    /* protected */ var _selectedElement: RefObject[HTMLDivElement] = js.native
    
    /* private */ var _shouldShowForceResolve: Any = js.native
    
    /* private */ var activeSelectedElement: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSuggestions(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggestions(): Unit = js.native
    
    def executeSelectedAction(): Unit = js.native
    
    def focusAboveSuggestions(): Unit = js.native
    
    def focusBelowSuggestions(): Unit = js.native
    
    def focusSearchForMoreButton(): Unit = js.native
    
    def hasSuggestedAction(): Boolean = js.native
    
    def hasSuggestedActionSelected(): Boolean = js.native
    
    def scrollSelected(): Unit = js.native
    
    /**
      * Returns true if the event was handled, false otherwise
      */
    def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean = js.native
  }
  
  trait ISuggestionsState extends StObject {
    
    var selectedActionType: SuggestionActionType
  }
  object ISuggestionsState {
    
    inline def apply(selectedActionType: SuggestionActionType): ISuggestionsState = {
      val __obj = js.Dynamic.literal(selectedActionType = selectedActionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISuggestionsState] (val x: Self) extends AnyVal {
      
      inline def setSelectedActionType(value: SuggestionActionType): Self = StObject.set(x, "selectedActionType", value.asInstanceOf[js.Any])
    }
  }
}
