package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMerge_Options extends js.Object {
  var commit_message: js.UndefOr[java.lang.String] = js.undefined
  var commit_title: js.UndefOr[java.lang.String] = js.undefined
  var merge_method: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object PullsMerge_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    commit_message: java.lang.String = null,
    commit_title: java.lang.String = null,
    merge_method: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    sha: java.lang.String = null
  ): PullsMerge_Options = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    if (commit_title != null) __obj.updateDynamic("commit_title")(commit_title)
    if (merge_method != null) __obj.updateDynamic("merge_method")(merge_method)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[PullsMerge_Options]
  }
}

