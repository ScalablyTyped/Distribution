package typings.nodeDashMailjet.nodeDashMailjetMod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponse extends js.Object {
  val body: PostResponseData
}

object PostResponse {
  @scala.inline
  def apply(body: PostResponseData): PostResponse = {
    val __obj = js.Dynamic.literal(body = body)
  
    __obj.asInstanceOf[PostResponse]
  }
}

