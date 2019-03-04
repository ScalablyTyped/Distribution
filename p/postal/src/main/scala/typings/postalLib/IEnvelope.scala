package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvelope[T] extends js.Object {
  /*Uses DEFAULT_CHANNEL if no channel is provided*/
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[T] = js.undefined
  var timeStamp: js.UndefOr[java.lang.String] = js.undefined
  var topic: java.lang.String
}

object IEnvelope {
  @scala.inline
  def apply[T](
    topic: java.lang.String,
    channel: java.lang.String = null,
    data: T = null,
    timeStamp: java.lang.String = null
  ): IEnvelope[T] = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[IEnvelope[T]]
  }
}

