package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriberAdded extends js.Object {
  var subscriberAdded: String = js.native
  var subscriberRemoved: String = js.native
}

object SubscriberAdded {
  @scala.inline
  def apply(subscriberAdded: String, subscriberRemoved: String): SubscriberAdded = {
    val __obj = js.Dynamic.literal(subscriberAdded = subscriberAdded.asInstanceOf[js.Any], subscriberRemoved = subscriberRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdded]
  }
  @scala.inline
  implicit class SubscriberAddedOps[Self <: SubscriberAdded] (val x: Self) extends AnyVal {
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
    def setSubscriberAdded(value: String): Self = this.set("subscriberAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriberRemoved(value: String): Self = this.set("subscriberRemoved", value.asInstanceOf[js.Any])
  }
  
}

