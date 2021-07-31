package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListForRefResponseData extends StObject {
  
  var check_runs: js.Array[App]
  
  var total_count: Double
}
object ChecksListForRefResponseData {
  
  @scala.inline
  def apply(check_runs: js.Array[App], total_count: Double): ChecksListForRefResponseData = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefResponseData]
  }
  
  @scala.inline
  implicit class ChecksListForRefResponseDataMutableBuilder[Self <: ChecksListForRefResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_runs(value: js.Array[App]): Self = StObject.set(x, "check_runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_runsVarargs(value: App*): Self = StObject.set(x, "check_runs", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
