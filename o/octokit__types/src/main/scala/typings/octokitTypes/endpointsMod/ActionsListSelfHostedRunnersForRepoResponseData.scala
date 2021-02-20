package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Busy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListSelfHostedRunnersForRepoResponseData extends StObject {
  
  var runners: js.Array[Busy] = js.native
  
  var total_count: Double = js.native
}
object ActionsListSelfHostedRunnersForRepoResponseData {
  
  @scala.inline
  def apply(runners: js.Array[Busy], total_count: Double): ActionsListSelfHostedRunnersForRepoResponseData = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForRepoResponseData]
  }
  
  @scala.inline
  implicit class ActionsListSelfHostedRunnersForRepoResponseDataMutableBuilder[Self <: ActionsListSelfHostedRunnersForRepoResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunners(value: js.Array[Busy]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersVarargs(value: Busy*): Self = StObject.set(x, "runners", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
