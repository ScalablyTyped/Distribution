package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeEndpoint extends js.Object {
  var commit_message: js.UndefOr[String] = js.undefined
  var commit_title: js.UndefOr[String] = js.undefined
  var merge_method: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
}

object PullsMergeEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    commit_message: String = null,
    commit_title: String = null,
    merge_method: String = null,
    number: Int | Double = null,
    sha: String = null
  ): PullsMergeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    if (commit_title != null) __obj.updateDynamic("commit_title")(commit_title)
    if (merge_method != null) __obj.updateDynamic("merge_method")(merge_method)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[PullsMergeEndpoint]
  }
}

