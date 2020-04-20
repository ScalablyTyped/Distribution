package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateCommentParams]
  }
}

