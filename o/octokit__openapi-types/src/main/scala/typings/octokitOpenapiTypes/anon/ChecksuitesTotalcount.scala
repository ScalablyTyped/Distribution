package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksuitesTotalcount extends StObject {
  
  var check_suites: js.Array[Headcommit]
  
  var total_count: Double
}
object ChecksuitesTotalcount {
  
  inline def apply(check_suites: js.Array[Headcommit], total_count: Double): ChecksuitesTotalcount = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksuitesTotalcount]
  }
  
  extension [Self <: ChecksuitesTotalcount](x: Self) {
    
    inline def setCheck_suites(value: js.Array[Headcommit]): Self = StObject.set(x, "check_suites", value.asInstanceOf[js.Any])
    
    inline def setCheck_suitesVarargs(value: Headcommit*): Self = StObject.set(x, "check_suites", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
