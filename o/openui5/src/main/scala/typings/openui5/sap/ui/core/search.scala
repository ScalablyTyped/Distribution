package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object search {
  
  @js.native
  trait OpenSearchProvider extends SearchProvider {
    
    /**
      * Gets current value of property <code>suggestType</code>.The type of data which is provided by the
      * given suggestUrl: either 'json' or 'xml'.Default value is <code>json</code>.
      * @returns Value of property <code>suggestType</code>
      */
    def getSuggestType(): String = js.native
    
    /**
      * Gets current value of property <code>suggestUrl</code>.The URL for suggestions of the search
      * provider. As placeholder for the concrete search queries '{searchTerms}' must be used. For cross
      * domain requests maybe a proxy must be used.
      * @returns Value of property <code>suggestUrl</code>
      */
    def getSuggestUrl(): js.Any = js.native
    
    /**
      * Sets a new value for property <code>suggestType</code>.The type of data which is provided by the
      * given suggestUrl: either 'json' or 'xml'.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>json</code>.
      * @param sSuggestType New value for property <code>suggestType</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSuggestType(sSuggestType: String): OpenSearchProvider = js.native
    
    /**
      * Sets a new value for property <code>suggestUrl</code>.The URL for suggestions of the search
      * provider. As placeholder for the concrete search queries '{searchTerms}' must be used. For cross
      * domain requests maybe a proxy must be used.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.
      * @param sSuggestUrl New value for property <code>suggestUrl</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSuggestUrl(sSuggestUrl: js.Any): OpenSearchProvider = js.native
  }
  
  @js.native
  trait SearchProvider extends Element {
    
    /**
      * Gets current value of property <code>icon</code>.Icon of the Search Provider
      * @returns Value of property <code>icon</code>
      */
    def getIcon(): String = js.native
    
    /**
      * Sets a new value for property <code>icon</code>.Icon of the Search ProviderWhen called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sIcon New value for property <code>icon</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setIcon(sIcon: String): SearchProvider = js.native
    
    /**
      * Call this function to get suggest values from the search provider.The given callback function is
      * called with the suggest value (type 'string', 1st parameter)and an array of the suggestions (type
      * '[string]', 2nd parameter).
      * @param sValue The value for which suggestions are requested.
      * @param fnCallback The callback function which is called when the suggestions are available.
      */
    def suggest(sValue: String, fnCallback: js.Any): Unit = js.native
  }
}
