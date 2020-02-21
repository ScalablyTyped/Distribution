package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyGistid extends js.Object {
  var body: AnonRequired
  var gist_id: AnonRequired
}

object AnonBodyGistid {
  @scala.inline
  def apply(body: AnonRequired, gist_id: AnonRequired): AnonBodyGistid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyGistid]
  }
}

