package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedListProperties extends StObject {
  
  /**
    * A ListProperties that only includes the changes made in this suggestion. This can be used along with the list_properties_suggestion_state to see which fields have changed and their
    * new values.
    */
  var listProperties: js.UndefOr[ListProperties] = js.native
  
  /** A mask that indicates which of the fields on the base ListProperties have been changed in this suggestion. */
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.native
}
object SuggestedListProperties {
  
  @scala.inline
  def apply(): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedListProperties]
  }
  
  @scala.inline
  implicit class SuggestedListPropertiesMutableBuilder[Self <: SuggestedListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListProperties(value: ListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesSuggestionState(value: ListPropertiesSuggestionState): Self = StObject.set(x, "listPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesSuggestionStateUndefined: Self = StObject.set(x, "listPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
  }
}
