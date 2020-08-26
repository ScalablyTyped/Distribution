package typings.natsHemera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxMessages extends js.Object {
  var maxMessages: Double = js.native
  var pubsub: Boolean = js.native
  var queue: String = js.native
  var topic: String = js.native
}

object MaxMessages {
  @scala.inline
  def apply(maxMessages: Double, pubsub: Boolean, queue: String, topic: String): MaxMessages = {
    val __obj = js.Dynamic.literal(maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMessages]
  }
  @scala.inline
  implicit class MaxMessagesOps[Self <: MaxMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPubsub(value: Boolean): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
  
}

