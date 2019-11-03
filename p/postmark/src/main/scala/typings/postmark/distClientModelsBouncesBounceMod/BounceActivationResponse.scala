package typings.postmark.distClientModelsBouncesBounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceActivationResponse extends js.Object {
  var Bounce: typings.postmark.distClientModelsBouncesBounceMod.Bounce
  var Message: String
}

object BounceActivationResponse {
  @scala.inline
  def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
    val __obj = js.Dynamic.literal(Bounce = Bounce, Message = Message)
  
    __obj.asInstanceOf[BounceActivationResponse]
  }
}

