package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksListSuitesForRefResponseData extends StObject {
  
  var check_suites: js.Array[After] = js.native
  
  var total_count: Double = js.native
}
object ChecksListSuitesForRefResponseData {
  
  @scala.inline
  def apply(check_suites: js.Array[After], total_count: Double): ChecksListSuitesForRefResponseData = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefResponseData]
  }
  
  @scala.inline
  implicit class ChecksListSuitesForRefResponseDataMutableBuilder[Self <: ChecksListSuitesForRefResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_suites(value: js.Array[After]): Self = StObject.set(x, "check_suites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_suitesVarargs(value: After*): Self = StObject.set(x, "check_suites", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
