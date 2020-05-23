package typings.natsHemera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectedMessages extends js.Object {
  var expectedMessages: Double
  var maxMessages: Double
  var pubsub: Boolean
  var topic: String
}

object ExpectedMessages {
  @scala.inline
  def apply(expectedMessages: Double, maxMessages: Double, pubsub: Boolean, topic: String): ExpectedMessages = {
    val __obj = js.Dynamic.literal(expectedMessages = expectedMessages.asInstanceOf[js.Any], maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedMessages]
  }
}

