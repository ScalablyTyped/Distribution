package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetCommentParams extends js.Object {
  var comment_id: Double
  var gist_id: String
}

object GistsGetCommentParams {
  @scala.inline
  def apply(comment_id: Double, gist_id: String): GistsGetCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetCommentParams]
  }
}

