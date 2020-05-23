package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateCommentEndpoint extends js.Object {
  /**
    * The comment text.
    */
  var body: String
  var gist_id: String
}

object GistsCreateCommentEndpoint {
  @scala.inline
  def apply(body: String, gist_id: String): GistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateCommentEndpoint]
  }
}

