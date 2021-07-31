package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPropertiesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields on the corresponding NestingLevel in nesting_levels have been changed in this suggestion. The nesting level suggestion states are returned
    * in ascending order of the nesting level with the least nested returned first.
    */
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[NestingLevelSuggestionState]] = js.undefined
}
object ListPropertiesSuggestionState {
  
  @scala.inline
  def apply(): ListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class ListPropertiesSuggestionStateMutableBuilder[Self <: ListPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNestingLevelsSuggestionStates(value: js.Array[NestingLevelSuggestionState]): Self = StObject.set(x, "nestingLevelsSuggestionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelsSuggestionStatesUndefined: Self = StObject.set(x, "nestingLevelsSuggestionStates", js.undefined)
    
    @scala.inline
    def setNestingLevelsSuggestionStatesVarargs(value: NestingLevelSuggestionState*): Self = StObject.set(x, "nestingLevelsSuggestionStates", js.Array(value :_*))
  }
}
