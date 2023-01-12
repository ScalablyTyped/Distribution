package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckrunsTotalcount extends StObject {
  
  var check_runs: js.Array[Deployment]
  
  var total_count: Double
}
object CheckrunsTotalcount {
  
  inline def apply(check_runs: js.Array[Deployment], total_count: Double): CheckrunsTotalcount = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckrunsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckrunsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setCheck_runs(value: js.Array[Deployment]): Self = StObject.set(x, "check_runs", value.asInstanceOf[js.Any])
    
    inline def setCheck_runsVarargs(value: Deployment*): Self = StObject.set(x, "check_runs", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
