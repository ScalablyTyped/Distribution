package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionEndpoint extends js.Object {
  var ignored: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var subscribed: js.UndefOr[scala.Boolean] = js.undefined
}

object ActivitySetRepoSubscriptionEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    ignored: js.UndefOr[scala.Boolean] = js.undefined,
    subscribed: js.UndefOr[scala.Boolean] = js.undefined
  ): ActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    if (!js.isUndefined(subscribed)) __obj.updateDynamic("subscribed")(subscribed)
    __obj.asInstanceOf[ActivitySetRepoSubscriptionEndpoint]
  }
}

