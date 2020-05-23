package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRunnerApplicationsForOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object ActionsListRunnerApplicationsForOrgEndpoint {
  @scala.inline
  def apply(org_ : String): ActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRunnerApplicationsForOrgEndpoint]
  }
}

