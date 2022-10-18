package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewActivePageId extends StObject {
  
  /**
    * Indexes of all active pages after the page change.
    */
  var activePages: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * ID of the page which will be active after the page change.
    */
  var newActivePageId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the page which was active before the page change.
    */
  var oldActivePageId: js.UndefOr[String] = js.undefined
}
object NewActivePageId {
  
  inline def apply(): NewActivePageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewActivePageId]
  }
  
  extension [Self <: NewActivePageId](x: Self) {
    
    inline def setActivePages(value: js.Array[Any]): Self = StObject.set(x, "activePages", value.asInstanceOf[js.Any])
    
    inline def setActivePagesUndefined: Self = StObject.set(x, "activePages", js.undefined)
    
    inline def setActivePagesVarargs(value: Any*): Self = StObject.set(x, "activePages", js.Array(value*))
    
    inline def setNewActivePageId(value: String): Self = StObject.set(x, "newActivePageId", value.asInstanceOf[js.Any])
    
    inline def setNewActivePageIdUndefined: Self = StObject.set(x, "newActivePageId", js.undefined)
    
    inline def setOldActivePageId(value: String): Self = StObject.set(x, "oldActivePageId", value.asInstanceOf[js.Any])
    
    inline def setOldActivePageIdUndefined: Self = StObject.set(x, "oldActivePageId", js.undefined)
  }
}
