package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedReason extends StObject {
  
  /**
    * A non-standardized string that further classifies the change event. Model implementations should document
    * any value that they might provide as detailed reason, and describe under what circumstances each value
    * will be used.
    */
  var detailedReason: js.UndefOr[String] = js.undefined
}
object DetailedReason {
  
  inline def apply(): DetailedReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailedReason]
  }
  
  extension [Self <: DetailedReason](x: Self) {
    
    inline def setDetailedReason(value: String): Self = StObject.set(x, "detailedReason", value.asInstanceOf[js.Any])
    
    inline def setDetailedReasonUndefined: Self = StObject.set(x, "detailedReason", js.undefined)
  }
}
