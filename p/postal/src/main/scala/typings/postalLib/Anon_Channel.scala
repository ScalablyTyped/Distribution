package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var topic: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Channel {
  @scala.inline
  def apply(channel: java.lang.String = null, context: js.Any = null, topic: java.lang.String = null): Anon_Channel = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_Channel]
  }
}

