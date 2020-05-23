package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionEndpoint extends js.Object {
  /**
    * Determines if all notifications should be blocked from this repository.
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
  /**
    * Determines if notifications should be received from this repository.
    */
  var subscribed: js.UndefOr[Boolean] = js.undefined
}

object ActivitySetRepoSubscriptionEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    ignored: js.UndefOr[Boolean] = js.undefined,
    subscribed: js.UndefOr[Boolean] = js.undefined
  ): ActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subscribed)) __obj.updateDynamic("subscribed")(subscribed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetRepoSubscriptionEndpoint]
  }
}

