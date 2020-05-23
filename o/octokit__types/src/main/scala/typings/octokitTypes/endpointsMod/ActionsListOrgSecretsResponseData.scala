package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Selectedrepositoriesurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListOrgSecretsResponseData extends js.Object {
  var secrets: js.Array[Selectedrepositoriesurl]
  var total_count: Double
}

object ActionsListOrgSecretsResponseData {
  @scala.inline
  def apply(secrets: js.Array[Selectedrepositoriesurl], total_count: Double): ActionsListOrgSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListOrgSecretsResponseData]
  }
}

