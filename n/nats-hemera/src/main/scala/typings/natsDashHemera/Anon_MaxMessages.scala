package typings.natsDashHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxMessages extends js.Object {
  var maxMessages: Double
  var pubsub: Boolean
  var queue: String
  var topic: String
}

object Anon_MaxMessages {
  @scala.inline
  def apply(maxMessages: Double, pubsub: Boolean, queue: String, topic: String): Anon_MaxMessages = {
    val __obj = js.Dynamic.literal(maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MaxMessages]
  }
}

