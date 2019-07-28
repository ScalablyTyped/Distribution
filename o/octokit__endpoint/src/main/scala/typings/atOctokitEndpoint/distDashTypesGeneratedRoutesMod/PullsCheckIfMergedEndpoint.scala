package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCheckIfMergedEndpoint extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCheckIfMergedEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, number: Int | Double = null): PullsCheckIfMergedEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCheckIfMergedEndpoint]
  }
}

