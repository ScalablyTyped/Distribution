package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentResponseReactions extends js.Object {
  var `+1`: scala.Double
  var `-1`: scala.Double
  var confused: scala.Double
  var heart: scala.Double
  var hooray: scala.Double
  var laugh: scala.Double
  var total_count: scala.Double
  var url: java.lang.String
}

object TeamsCreateDiscussionCommentResponseReactions {
  @scala.inline
  def apply(
    `+1`: scala.Double,
    `-1`: scala.Double,
    confused: scala.Double,
    heart: scala.Double,
    hooray: scala.Double,
    laugh: scala.Double,
    total_count: scala.Double,
    url: java.lang.String
  ): TeamsCreateDiscussionCommentResponseReactions = {
    val __obj = js.Dynamic.literal(confused = confused, heart = heart, hooray = hooray, laugh = laugh, total_count = total_count, url = url)
    __obj.updateDynamic("+1")(`+1`)
    __obj.updateDynamic("-1")(`-1`)
    __obj.asInstanceOf[TeamsCreateDiscussionCommentResponseReactions]
  }
}

