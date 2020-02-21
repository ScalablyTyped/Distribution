package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentid extends js.Object {
  var comment_id: AnonRequired
  var gist_id: AnonRequired
}

object AnonCommentid {
  @scala.inline
  def apply(comment_id: AnonRequired, gist_id: AnonRequired): AnonCommentid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentid]
  }
}

