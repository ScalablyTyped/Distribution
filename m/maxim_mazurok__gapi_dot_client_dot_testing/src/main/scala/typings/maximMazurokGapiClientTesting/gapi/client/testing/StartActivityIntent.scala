package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartActivityIntent extends StObject {
  
  /** Action name. Required for START_ACTIVITY. */
  var action: js.UndefOr[String] = js.undefined
  
  /** Intent categories to set on the intent. */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URI for the action. */
  var uri: js.UndefOr[String] = js.undefined
}
object StartActivityIntent {
  
  inline def apply(): StartActivityIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityIntent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartActivityIntent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
