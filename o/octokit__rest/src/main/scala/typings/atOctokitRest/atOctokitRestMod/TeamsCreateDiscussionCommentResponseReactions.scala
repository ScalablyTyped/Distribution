package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentResponseReactions extends js.Object {
  var `+1`: Double
  var `-1`: Double
  var confused: Double
  var heart: Double
  var hooray: Double
  var laugh: Double
  var total_count: Double
  var url: String
}

object TeamsCreateDiscussionCommentResponseReactions {
  @scala.inline
  def apply(
    `+1`: Double,
    `-1`: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): TeamsCreateDiscussionCommentResponseReactions = {
    val __obj = js.Dynamic.literal(confused = confused, heart = heart, hooray = hooray, laugh = laugh, total_count = total_count, url = url)
    __obj.updateDynamic("+1")(`+1`)
    __obj.updateDynamic("-1")(`-1`)
    __obj.asInstanceOf[TeamsCreateDiscussionCommentResponseReactions]
  }
}

