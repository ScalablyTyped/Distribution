package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetResponsePlan extends js.Object {
  var filled_seats: js.UndefOr[Double] = js.undefined
  var name: String
  var private_repos: Double
  var seats: js.UndefOr[Double] = js.undefined
  var space: Double
}

object OrgsGetResponsePlan {
  @scala.inline
  def apply(
    name: String,
    private_repos: Double,
    space: Double,
    filled_seats: Int | Double = null,
    seats: Int | Double = null
  ): OrgsGetResponsePlan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    if (filled_seats != null) __obj.updateDynamic("filled_seats")(filled_seats.asInstanceOf[js.Any])
    if (seats != null) __obj.updateDynamic("seats")(seats.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponsePlan]
  }
}

