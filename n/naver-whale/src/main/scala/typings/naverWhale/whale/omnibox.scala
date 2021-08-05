package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Omnibox
////////////////////
/**
  * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
  * Manifest:  "omnibox": {...}
  * @since Chrome 9.
  */
object omnibox {
  
  type OmniboxInputCancelledEvent = Event[js.Function0[Unit]]
  
  type OmniboxInputChangedEvent = Event[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[typings.chrome.chrome.omnibox.SuggestResult], Unit], 
      Unit
    ]
  ]
  
  type OmniboxInputEnteredEvent = Event[
    js.Function2[
      /* text */ String, 
      /* disposition */ typings.chrome.chrome.omnibox.OnInputEnteredDisposition, 
      Unit
    ]
  ]
  
  type OmniboxInputStartedEvent = Event[js.Function0[Unit]]
  
  type OmniboxSuggestionDeletedEvent = Event[js.Function1[/* text */ String, Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.naverWhale.naverWhaleStrings.currentTab
    - typings.naverWhale.naverWhaleStrings.newForegroundTab
    - typings.naverWhale.naverWhaleStrings.newBackgroundTab
  */
  trait OnInputEnteredDisposition extends StObject
  object OnInputEnteredDisposition {
    
    inline def currentTab: typings.naverWhale.naverWhaleStrings.currentTab = "currentTab".asInstanceOf[typings.naverWhale.naverWhaleStrings.currentTab]
    
    inline def newBackgroundTab: typings.naverWhale.naverWhaleStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typings.naverWhale.naverWhaleStrings.newBackgroundTab]
    
    inline def newForegroundTab: typings.naverWhale.naverWhaleStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typings.naverWhale.naverWhaleStrings.newForegroundTab]
  }
  
  trait SuggestResult extends StObject {
    
    /** The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry. */
    var content: String
    
    /**
      * Whether the suggest result can be deleted by the user.
      * @since Chrome 63.
      */
    var deletable: js.UndefOr[Boolean] = js.undefined
    
    /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484 */
    var description: String
  }
  object SuggestResult {
    
    inline def apply(content: String, description: String): SuggestResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResult]
    }
    
    extension [Self <: SuggestResult](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait Suggestion extends StObject {
    
    /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. */
    var description: String
  }
  object Suggestion {
    
    inline def apply(description: String): Suggestion = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion]
    }
    
    extension [Self <: Suggestion](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
}
