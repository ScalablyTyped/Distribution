package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Busy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListSelfHostedRunnersForOrgResponseData extends StObject {
  
  var runners: js.Array[Busy]
  
  var total_count: Double
}
object ActionsListSelfHostedRunnersForOrgResponseData {
  
  inline def apply(runners: js.Array[Busy], total_count: Double): ActionsListSelfHostedRunnersForOrgResponseData = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForOrgResponseData]
  }
  
  extension [Self <: ActionsListSelfHostedRunnersForOrgResponseData](x: Self) {
    
    inline def setRunners(value: js.Array[Busy]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersVarargs(value: Busy*): Self = StObject.set(x, "runners", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
