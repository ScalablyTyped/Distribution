package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListEndpoint extends js.Object {
  /**
    * The integer ID of the last User that you've seen.
    */
  var since: js.UndefOr[String] = js.undefined
}

object UsersListEndpoint {
  @scala.inline
  def apply(since: String = null): UsersListEndpoint = {
    val __obj = js.Dynamic.literal()
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersListEndpoint]
  }
}

