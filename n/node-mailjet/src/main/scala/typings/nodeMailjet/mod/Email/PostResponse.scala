package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponse extends js.Object {
  val body: PostResponseData
}

object PostResponse {
  @scala.inline
  def apply(body: PostResponseData): PostResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostResponse]
  }
}

