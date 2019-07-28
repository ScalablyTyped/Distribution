package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateCommentParams extends js.Object {
  /**
    * The comment text.
    */
  var body: String
  var comment_id: Double
  var gist_id: String
}

object GistsUpdateCommentParams {
  @scala.inline
  def apply(body: String, comment_id: Double, gist_id: String): GistsUpdateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsUpdateCommentParams]
  }
}

