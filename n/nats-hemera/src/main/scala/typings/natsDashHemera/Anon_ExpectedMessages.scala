package typings.natsDashHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectedMessages extends js.Object {
  var expectedMessages: Double
  var maxMessages: Double
  var pubsub: Boolean
  var topic: String
}

object Anon_ExpectedMessages {
  @scala.inline
  def apply(expectedMessages: Double, maxMessages: Double, pubsub: Boolean, topic: String): Anon_ExpectedMessages = {
    val __obj = js.Dynamic.literal(expectedMessages = expectedMessages, maxMessages = maxMessages, pubsub = pubsub, topic = topic)
  
    __obj.asInstanceOf[Anon_ExpectedMessages]
  }
}

