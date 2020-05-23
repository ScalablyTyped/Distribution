package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberAdded extends js.Object {
  var subscriberAdded: String
  var subscriberRemoved: String
}

object SubscriberAdded {
  @scala.inline
  def apply(subscriberAdded: String, subscriberRemoved: String): SubscriberAdded = {
    val __obj = js.Dynamic.literal(subscriberAdded = subscriberAdded.asInstanceOf[js.Any], subscriberRemoved = subscriberRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdded]
  }
}

