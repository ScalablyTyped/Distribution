package typings.officeUiFabricReact

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsStoreMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsStore", "SuggestionsStore")
  @js.native
  class SuggestionsStore[T] () extends StObject {
    def this(options: SuggestionsStoreOptions[T]) = this()
    
    var _ensureSuggestionModel: js.Any = js.native
    
    var _isSuggestionModel: js.Any = js.native
    
    def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
    
    var getAriaLabel: js.Any = js.native
    
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
    
    @scala.inline
    def apply[T](): SuggestionsStoreOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuggestionsStoreOptions[T]]
    }
    
    @scala.inline
    implicit class SuggestionsStoreOptionsMutableBuilder[Self <: SuggestionsStoreOptions[?], T] (val x: Self & SuggestionsStoreOptions[T]) extends AnyVal {
      
      @scala.inline
      def setGetAriaLabel(value: /* item */ T => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
    }
  }
}
