package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSettings extends StObject {
  
  /**
    * Enables the developer to define the appearance of the content and configure conditions that dictate when the template
    * should be displayed. Maximum of 2 search result templates per connection.
    */
  var searchResultTemplates: js.UndefOr[NullableOption[js.Array[DisplayTemplate]]] = js.undefined
}
object SearchSettings {
  
  inline def apply(): SearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSettings] (val x: Self) extends AnyVal {
    
    inline def setSearchResultTemplates(value: NullableOption[js.Array[DisplayTemplate]]): Self = StObject.set(x, "searchResultTemplates", value.asInstanceOf[js.Any])
    
    inline def setSearchResultTemplatesNull: Self = StObject.set(x, "searchResultTemplates", null)
    
    inline def setSearchResultTemplatesUndefined: Self = StObject.set(x, "searchResultTemplates", js.undefined)
    
    inline def setSearchResultTemplatesVarargs(value: DisplayTemplate*): Self = StObject.set(x, "searchResultTemplates", js.Array(value*))
  }
}
