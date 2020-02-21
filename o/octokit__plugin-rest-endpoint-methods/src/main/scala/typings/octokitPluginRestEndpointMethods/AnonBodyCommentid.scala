package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommentid extends js.Object {
  var body: AnonRequired
  var comment_id: AnonRequired
  var gist_id: AnonRequired
}

object AnonBodyCommentid {
  @scala.inline
  def apply(body: AnonRequired, comment_id: AnonRequired, gist_id: AnonRequired): AnonBodyCommentid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyCommentid]
  }
}

