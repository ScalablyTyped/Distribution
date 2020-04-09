package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSelfHostedRunnersForRepoResponse extends js.Object {
  var runners: js.Array[ActionsListSelfHostedRunnersForRepoResponseRunnersItem]
  var total_count: Double
}

object ActionsListSelfHostedRunnersForRepoResponse {
  @scala.inline
  def apply(runners: js.Array[ActionsListSelfHostedRunnersForRepoResponseRunnersItem], total_count: Double): ActionsListSelfHostedRunnersForRepoResponse = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForRepoResponse]
  }
}

