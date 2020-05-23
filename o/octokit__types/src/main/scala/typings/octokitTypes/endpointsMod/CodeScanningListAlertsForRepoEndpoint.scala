package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeScanningListAlertsForRepoEndpoint extends js.Object {
  var owner: String
  /**
    * Returns a list of code scanning alerts for a specific brach reference. The `ref` must be formatted as `heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
  /**
    * Set to `closed` to list only closed code scanning alerts.
    */
  var state: js.UndefOr[String] = js.undefined
}

object CodeScanningListAlertsForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, ref: String = null, state: String = null): CodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListAlertsForRepoEndpoint]
  }
}

