package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResponse extends js.Object {
  val body: PostResponseData
  val url: String
}

object SendResponse {
  @scala.inline
  def apply(body: PostResponseData, url: String): SendResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendResponse]
  }
}

