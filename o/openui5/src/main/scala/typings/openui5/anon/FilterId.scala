package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterId extends StObject {
  
  /**
    * The ID of the filter that has just been applied.
    */
  var filterId: js.UndefOr[String] = js.undefined
}
object FilterId {
  
  inline def apply(): FilterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterId]
  }
  
  extension [Self <: FilterId](x: Self) {
    
    inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
