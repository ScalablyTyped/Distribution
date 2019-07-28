package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var comments: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `comments[].body`: String
  var `comments[].path`: String
  var `comments[].position`: Double
  var commit_id: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCreateReviewEndpoint {
  @scala.inline
  def apply(
    `comments[].body`: String,
    `comments[].path`: String,
    `comments[].position`: Double,
    owner: String,
    pull_number: Double,
    repo: String,
    body: String = null,
    comments: js.Array[js.Object] = null,
    commit_id: String = null,
    event: String = null,
    number: Int | Double = null
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

