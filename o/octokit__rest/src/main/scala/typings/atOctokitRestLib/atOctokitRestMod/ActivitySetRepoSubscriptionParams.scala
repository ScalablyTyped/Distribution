package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionParams extends js.Object {
  /**
    * Determines if all notifications should be blocked from this repository.
    */
  var ignored: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Determines if notifications should be received from this repository.
    */
  var subscribed: js.UndefOr[scala.Boolean] = js.undefined
}

object ActivitySetRepoSubscriptionParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    ignored: js.UndefOr[scala.Boolean] = js.undefined,
    subscribed: js.UndefOr[scala.Boolean] = js.undefined
  ): ActivitySetRepoSubscriptionParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    if (!js.isUndefined(subscribed)) __obj.updateDynamic("subscribed")(subscribed)
    __obj.asInstanceOf[ActivitySetRepoSubscriptionParams]
  }
}

