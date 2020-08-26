package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeScanningListAlertsForRepoEndpoint extends js.Object {
  var owner: String = js.native
  /**
    * Returns a list of code scanning alerts for a specific brach reference. The `ref` must be formatted as `heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.native
  var repo: String = js.native
  /**
    * Set to `closed` to list only closed code scanning alerts.
    */
  var state: js.UndefOr[String] = js.native
}

object CodeScanningListAlertsForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): CodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListAlertsForRepoEndpoint]
  }
  @scala.inline
  implicit class CodeScanningListAlertsForRepoEndpointOps[Self <: CodeScanningListAlertsForRepoEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

