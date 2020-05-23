package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeScanningGetAlertEndpoint extends js.Object {
  var alert_id: Double
  var owner: String
  var repo: String
}

object CodeScanningGetAlertEndpoint {
  @scala.inline
  def apply(alert_id: Double, owner: String, repo: String): CodeScanningGetAlertEndpoint = {
    val __obj = js.Dynamic.literal(alert_id = alert_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningGetAlertEndpoint]
  }
}

