package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`off-topic`
import typings.octokitTypes.octokitTypesStrings.`too heated`
import typings.octokitTypes.octokitTypesStrings.resolved
import typings.octokitTypes.octokitTypesStrings.spam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesLockEndpoint extends js.Object {
  var issue_number: Double = js.native
  /**
    * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    */
  var lock_reason: js.UndefOr[`off-topic` | (`too heated`) | resolved | spam] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object IssuesLockEndpoint {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockEndpoint]
  }
  @scala.inline
  implicit class IssuesLockEndpointOps[Self <: IssuesLockEndpoint] (val x: Self) extends AnyVal {
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
    def setIssue_number(value: Double): Self = this.set("issue_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLock_reason(value: `off-topic` | (`too heated`) | resolved | spam): Self = this.set("lock_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock_reason: Self = this.set("lock_reason", js.undefined)
  }
  
}

