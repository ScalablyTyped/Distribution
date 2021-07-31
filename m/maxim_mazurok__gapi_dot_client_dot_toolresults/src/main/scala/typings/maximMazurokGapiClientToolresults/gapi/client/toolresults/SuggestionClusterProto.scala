package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionClusterProto extends StObject {
  
  /** Category in which these types of suggestions should appear. Always set. */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * A sequence of suggestions. All of the suggestions within a cluster must have the same SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same
    * screenshot URL should be adjacent.
    */
  var suggestions: js.UndefOr[js.Array[SuggestionProto]] = js.undefined
}
object SuggestionClusterProto {
  
  @scala.inline
  def apply(): SuggestionClusterProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionClusterProto]
  }
  
  @scala.inline
  implicit class SuggestionClusterProtoMutableBuilder[Self <: SuggestionClusterProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setSuggestions(value: js.Array[SuggestionProto]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: SuggestionProto*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
