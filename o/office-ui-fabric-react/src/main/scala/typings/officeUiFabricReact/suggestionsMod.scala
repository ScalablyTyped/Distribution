package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButton
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions", "Suggestions")
  @js.native
  class Suggestions[T] protected ()
    extends Component[ISuggestionsProps[T], ISuggestionsState, js.Any] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _forceResolve: js.Any = js.native
    
    /* protected */ var _forceResolveButton: RefObject[IButton] = js.native
    
    /* private */ var _getAlertText: js.Any = js.native
    
    /* private */ var _getMoreResults: js.Any = js.native
    
    /* private */ var _onClickTypedSuggestionsItem: js.Any = js.native
    
    /* private */ var _onRemoveTypedSuggestionsItem: js.Any = js.native
    
    /* private */ var _refocusOnSuggestions: js.Any = js.native
    
    /* private */ var _renderSuggestions: js.Any = js.native
    
    /* protected */ var _searchForMoreButton: RefObject[IButton] = js.native
    
    /* protected */ var _selectedElement: RefObject[HTMLDivElement] = js.native
    
    /* private */ var _shouldShowForceResolve: js.Any = js.native
    
    /* private */ var activeSelectedElement: js.Any = js.native
    
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
    
    extension [Self <: ISuggestionsState](x: Self) {
      
      inline def setSelectedActionType(value: SuggestionActionType): Self = StObject.set(x, "selectedActionType", value.asInstanceOf[js.Any])
    }
  }
}
