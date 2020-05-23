package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPublicEndpoint extends js.Object {
  /**
    * The integer ID of the last repository that you've seen.
    */
  var since: js.UndefOr[Double] = js.undefined
}

object ReposListPublicEndpoint {
  @scala.inline
  def apply(since: js.UndefOr[Double] = js.undefined): ReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPublicEndpoint]
  }
}

