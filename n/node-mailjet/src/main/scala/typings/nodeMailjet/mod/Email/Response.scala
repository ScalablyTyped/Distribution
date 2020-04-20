package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// responses
trait Response extends js.Object {
  val body: js.Object
}

object Response {
  @scala.inline
  def apply(body: js.Object): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

