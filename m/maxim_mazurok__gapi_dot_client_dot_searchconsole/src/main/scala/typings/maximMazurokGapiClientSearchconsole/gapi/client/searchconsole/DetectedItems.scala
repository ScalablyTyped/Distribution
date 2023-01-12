package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedItems extends StObject {
  
  /** List of Rich Results items. */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /** Rich Results type */
  var richResultType: js.UndefOr[String] = js.undefined
}
object DetectedItems {
  
  inline def apply(): DetectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedItems] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRichResultType(value: String): Self = StObject.set(x, "richResultType", value.asInstanceOf[js.Any])
    
    inline def setRichResultTypeUndefined: Self = StObject.set(x, "richResultType", js.undefined)
  }
}
