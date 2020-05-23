package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListEndpoint extends js.Object {
  /**
    * The integer ID of the last organization that you've seen.
    */
  var since: js.UndefOr[Double] = js.undefined
}

object OrgsListEndpoint {
  @scala.inline
  def apply(since: js.UndefOr[Double] = js.undefined): OrgsListEndpoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListEndpoint]
  }
}

