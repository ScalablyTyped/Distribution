package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerSuggestionsSuggestionsStoreMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsStore", "SuggestionsStore")
  @js.native
  open class SuggestionsStore[T] () extends StObject {
    def this(options: SuggestionsStoreOptions[T]) = this()
    
    /* private */ var _ensureSuggestionModel: Any = js.native
    
    /* private */ var _isSuggestionModel: Any = js.native
    
    def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
    
    /* private */ var getAriaLabel: Any = js.native
    
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    
    def getSuggestions(): js.Array[ISuggestionModel[T]] = js.native
    
    def removeSuggestion(index: Double): Unit = js.native
    
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
    
    def updateSuggestions(newSuggestions: js.Array[T]): Unit = js.native
  }
  
  trait SuggestionsStoreOptions[T] extends StObject {
    
    var getAriaLabel: js.UndefOr[js.Function1[/* item */ T, String]] = js.undefined
  }
  object SuggestionsStoreOptions {
    
    inline def apply[T](): SuggestionsStoreOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuggestionsStoreOptions[T]]
    }
    
    extension [Self <: SuggestionsStoreOptions[?], T](x: Self & SuggestionsStoreOptions[T]) {
      
      inline def setGetAriaLabel(value: /* item */ T => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction1(value))
      
      inline def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
    }
  }
}
