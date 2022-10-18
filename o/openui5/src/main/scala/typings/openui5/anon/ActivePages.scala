package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivePages extends StObject {
  
  /**
    * Indexes of all active pages after the page change.
    */
  var activePages: js.UndefOr[js.Array[Any]] = js.undefined
}
object ActivePages {
  
  inline def apply(): ActivePages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePages]
  }
  
  extension [Self <: ActivePages](x: Self) {
    
    inline def setActivePages(value: js.Array[Any]): Self = StObject.set(x, "activePages", value.asInstanceOf[js.Any])
    
    inline def setActivePagesUndefined: Self = StObject.set(x, "activePages", js.undefined)
    
    inline def setActivePagesVarargs(value: Any*): Self = StObject.set(x, "activePages", js.Array(value*))
  }
}
