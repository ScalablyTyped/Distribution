package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetCommentEndpoint extends js.Object {
  var comment_id: Double
  var gist_id: String
}

object GistsGetCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, gist_id: String): GistsGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetCommentEndpoint]
  }
}

