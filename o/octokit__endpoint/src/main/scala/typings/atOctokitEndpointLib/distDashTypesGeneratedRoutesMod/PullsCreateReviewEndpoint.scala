package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewEndpoint extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var comments: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `comments[].body`: java.lang.String
  var `comments[].path`: java.lang.String
  var `comments[].position`: scala.Double
  var commit_id: js.UndefOr[java.lang.String] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsCreateReviewEndpoint {
  @scala.inline
  def apply(
    `comments[].body`: java.lang.String,
    `comments[].path`: java.lang.String,
    `comments[].position`: scala.Double,
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    body: java.lang.String = null,
    comments: js.Array[js.Object] = null,
    commit_id: java.lang.String = null,
    event: java.lang.String = null,
    number: scala.Int | scala.Double = null
  ): PullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    __obj.updateDynamic("comments[].body")(`comments[].body`)
    __obj.updateDynamic("comments[].path")(`comments[].path`)
    __obj.updateDynamic("comments[].position")(`comments[].position`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (commit_id != null) __obj.updateDynamic("commit_id")(commit_id)
    if (event != null) __obj.updateDynamic("event")(event)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewEndpoint]
  }
}

