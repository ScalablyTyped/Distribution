package typings.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceActivationResponse extends js.Object {
  var Bounce: typings.postmark.bounceMod.Bounce
  var Message: String
}

object BounceActivationResponse {
  @scala.inline
  def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BounceActivationResponse]
  }
}

