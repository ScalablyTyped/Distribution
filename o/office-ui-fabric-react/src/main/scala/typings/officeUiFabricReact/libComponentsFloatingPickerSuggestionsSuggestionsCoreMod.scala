package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsCoreProps
import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerSuggestionsSuggestionsCoreMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsCore", "SuggestionsCore")
  @js.native
  open class SuggestionsCore[T] protected ()
    extends Component[ISuggestionsCoreProps[T], js.Object, Any] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
    
    /* private */ var SuggestionsItemOfProperType: Any = js.native
    
    /* private */ var _onClickTypedSuggestionsItem: Any = js.native
    
    /* private */ var _onRemoveTypedSuggestionsItem: Any = js.native
    
    /* protected */ var _selectedElement: RefObject[HTMLDivElement] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggestionsCore(): Unit = js.native
    
    var currentIndex: Double = js.native
    
    var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    
    def deselectAllSuggestions(): Unit = js.native
    
    def getCurrentItem(): ISuggestionModel[T] = js.native
    
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    
    def hasSuggestionSelected(): Boolean = js.native
    
    /**
      * Increments the selected suggestion index
      */
    def nextSuggestion(): Boolean = js.native
    
    /**
      * Decrements the selected suggestion index
      */
    def previousSuggestion(): Boolean = js.native
    
    def removeSuggestion(index: Double): Unit = js.native
    
    def scrollSelected(): Unit = js.native
    
    val selectedElement: js.UndefOr[HTMLDivElement] = js.native
    
    def setSelectedSuggestion(index: Double): Unit = js.native
  }
}
