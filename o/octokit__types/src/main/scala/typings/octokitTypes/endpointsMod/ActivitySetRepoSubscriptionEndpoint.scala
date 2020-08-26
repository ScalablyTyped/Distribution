package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitySetRepoSubscriptionEndpoint extends js.Object {
  /**
    * Determines if all notifications should be blocked from this repository.
    */
  var ignored: js.UndefOr[Boolean] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Determines if notifications should be received from this repository.
    */
  var subscribed: js.UndefOr[Boolean] = js.native
}

object ActivitySetRepoSubscriptionEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetRepoSubscriptionEndpoint]
  }
  @scala.inline
  implicit class ActivitySetRepoSubscriptionEndpointOps[Self <: ActivitySetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
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
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribed: Self = this.set("subscribed", js.undefined)
  }
  
}

