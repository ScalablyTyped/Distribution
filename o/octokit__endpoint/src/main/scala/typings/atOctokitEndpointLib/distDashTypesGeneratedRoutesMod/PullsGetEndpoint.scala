package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetEndpoint extends js.Object {
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsGetEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): PullsGetEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetEndpoint]
  }
}

