package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFilter extends StObject {
  
  /** The android:name value of the tag. */
  var actionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The android:name value of the tag. */
  var categoryNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The android:mimeType value of the tag. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object IntentFilter {
  
  inline def apply(): IntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentFilter]
  }
  
  extension [Self <: IntentFilter](x: Self) {
    
    inline def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    inline def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    inline def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value*))
    
    inline def setCategoryNames(value: js.Array[String]): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    inline def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
    
    inline def setCategoryNamesVarargs(value: String*): Self = StObject.set(x, "categoryNames", js.Array(value*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
