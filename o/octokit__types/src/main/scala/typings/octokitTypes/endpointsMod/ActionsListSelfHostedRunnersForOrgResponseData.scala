package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSelfHostedRunnersForOrgResponseData extends js.Object {
  var runners: js.Array[Os]
  var total_count: Double
}

object ActionsListSelfHostedRunnersForOrgResponseData {
  @scala.inline
  def apply(runners: js.Array[Os], total_count: Double): ActionsListSelfHostedRunnersForOrgResponseData = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForOrgResponseData]
  }
}

