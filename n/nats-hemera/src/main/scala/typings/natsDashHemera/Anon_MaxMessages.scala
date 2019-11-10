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
    val __obj = js.Dynamic.literal(maxMessages = maxMessages, pubsub = pubsub, queue = queue, topic = topic)
  
    __obj.asInstanceOf[Anon_MaxMessages]
  }
}

