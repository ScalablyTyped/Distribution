package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionEndpoint extends js.Object {
  var ignored: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
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
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    if (!js.isUndefined(subscribed)) __obj.updateDynamic("subscribed")(subscribed)
    __obj.asInstanceOf[ActivitySetRepoSubscriptionEndpoint]
  }
}

