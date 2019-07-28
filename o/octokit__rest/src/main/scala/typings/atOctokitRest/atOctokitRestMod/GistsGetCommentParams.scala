package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsGetCommentParams]
  }
}

