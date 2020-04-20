package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubscriberAdded extends js.Object {
  var subscriberAdded: String
  var subscriberRemoved: String
}

object AnonSubscriberAdded {
  @scala.inline
  def apply(subscriberAdded: String, subscriberRemoved: String): AnonSubscriberAdded = {
    val __obj = js.Dynamic.literal(subscriberAdded = subscriberAdded.asInstanceOf[js.Any], subscriberRemoved = subscriberRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubscriberAdded]
  }
}

