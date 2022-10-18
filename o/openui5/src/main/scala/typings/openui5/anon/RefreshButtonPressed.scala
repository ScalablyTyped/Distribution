package typings.openui5.anon

import typings.openui5.sapMSuggestionItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshButtonPressed extends StObject {
  
  /**
    * Indicates if the user pressed the clear icon.
    */
  var clearButtonPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The search query string.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the user pressed the refresh icon.
    */
  var refreshButtonPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Suggestion list item in case if the user has selected an item from the suggestions list.
    */
  var suggestionItem: js.UndefOr[default] = js.undefined
}
object RefreshButtonPressed {
  
  inline def apply(): RefreshButtonPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshButtonPressed]
  }
  
  extension [Self <: RefreshButtonPressed](x: Self) {
    
    inline def setClearButtonPressed(value: Boolean): Self = StObject.set(x, "clearButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setClearButtonPressedUndefined: Self = StObject.set(x, "clearButtonPressed", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRefreshButtonPressed(value: Boolean): Self = StObject.set(x, "refreshButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setRefreshButtonPressedUndefined: Self = StObject.set(x, "refreshButtonPressed", js.undefined)
    
    inline def setSuggestionItem(value: default): Self = StObject.set(x, "suggestionItem", value.asInstanceOf[js.Any])
    
    inline def setSuggestionItemUndefined: Self = StObject.set(x, "suggestionItem", js.undefined)
  }
}
