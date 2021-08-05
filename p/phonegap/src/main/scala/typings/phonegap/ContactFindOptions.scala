package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFindOptions extends StObject {
  
  var filter: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object ContactFindOptions {
  
  inline def apply(): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFindOptions]
  }
  
  extension [Self <: ContactFindOptions](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
