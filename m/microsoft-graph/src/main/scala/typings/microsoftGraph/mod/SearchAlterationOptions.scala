package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAlterationOptions extends StObject {
  
  /**
    * Indicates whether spelling modifications are enabled. If enabled, the user will get the search results for the
    * corrected query in case of no results for the original query with typos. The response will also include the spelling
    * modification information in the queryAlterationResponse property. Optional.
    */
  var enableModification: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether spelling suggestions are enabled. If enabled, the user will get the search results for the original
    * search query and suggestions for spelling correction in the queryAlterationResponse property of the response for the
    * typos in the query. Optional.
    */
  var enableSuggestion: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object SearchAlterationOptions {
  
  inline def apply(): SearchAlterationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAlterationOptions]
  }
  
  extension [Self <: SearchAlterationOptions](x: Self) {
    
    inline def setEnableModification(value: NullableOption[Boolean]): Self = StObject.set(x, "enableModification", value.asInstanceOf[js.Any])
    
    inline def setEnableModificationNull: Self = StObject.set(x, "enableModification", null)
    
    inline def setEnableModificationUndefined: Self = StObject.set(x, "enableModification", js.undefined)
    
    inline def setEnableSuggestion(value: NullableOption[Boolean]): Self = StObject.set(x, "enableSuggestion", value.asInstanceOf[js.Any])
    
    inline def setEnableSuggestionNull: Self = StObject.set(x, "enableSuggestion", null)
    
    inline def setEnableSuggestionUndefined: Self = StObject.set(x, "enableSuggestion", js.undefined)
  }
}
