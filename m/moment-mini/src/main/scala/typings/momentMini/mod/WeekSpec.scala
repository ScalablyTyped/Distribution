package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekSpec extends StObject {
  
  var dow: Double
  
  var doy: Double
}
object WeekSpec {
  
  inline def apply(dow: Double, doy: Double): WeekSpec = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any], doy = doy.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekSpec]
  }
  
  extension [Self <: WeekSpec](x: Self) {
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setDoy(value: Double): Self = StObject.set(x, "doy", value.asInstanceOf[js.Any])
  }
}
