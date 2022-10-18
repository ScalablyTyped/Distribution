package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksuites extends StObject {
  
  var check_suites: js.Array[Checkrunsurl]
  
  var total_count: Double
}
object Checksuites {
  
  inline def apply(check_suites: js.Array[Checkrunsurl], total_count: Double): Checksuites = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksuites]
  }
  
  extension [Self <: Checksuites](x: Self) {
    
    inline def setCheck_suites(value: js.Array[Checkrunsurl]): Self = StObject.set(x, "check_suites", value.asInstanceOf[js.Any])
    
    inline def setCheck_suitesVarargs(value: Checkrunsurl*): Self = StObject.set(x, "check_suites", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
