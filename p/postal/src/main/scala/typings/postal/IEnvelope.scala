package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvelope[T] extends js.Object {
  /*Uses DEFAULT_CHANNEL if no channel is provided*/
  var channel: js.UndefOr[String] = js.native
  var data: js.UndefOr[T] = js.native
  var timeStamp: js.UndefOr[String] = js.native
  var topic: String = js.native
}

object IEnvelope {
  @scala.inline
  def apply[T](topic: String): IEnvelope[T] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvelope[T]]
  }
  @scala.inline
  implicit class IEnvelopeOps[Self <: IEnvelope[_], T] (val x: Self with IEnvelope[T]) extends AnyVal {
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
  
}

