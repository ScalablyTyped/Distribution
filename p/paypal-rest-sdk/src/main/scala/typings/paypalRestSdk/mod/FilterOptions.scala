package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOptions extends StObject {
  
  var end_time: String
  
  var page_size: Double
  
  var start_time: String
}
object FilterOptions {
  
  inline def apply(end_time: String, page_size: Double, start_time: String): FilterOptions = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
