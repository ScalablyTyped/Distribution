package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartActivityIntent extends StObject {
  
  /** Action name. Required for START_ACTIVITY. */
  var action: js.UndefOr[String] = js.native
  
  /** Intent categories to set on the intent. */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /** URI for the action. */
  var uri: js.UndefOr[String] = js.native
}
object StartActivityIntent {
  
  @scala.inline
  def apply(): StartActivityIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityIntent]
  }
  
  @scala.inline
  implicit class StartActivityIntentMutableBuilder[Self <: StartActivityIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
