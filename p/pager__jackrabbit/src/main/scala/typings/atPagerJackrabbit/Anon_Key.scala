package typings.atPagerJackrabbit

import typings.atPagerJackrabbit.atPagerJackrabbitMod.AckCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var reply: js.UndefOr[AckCallback] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: String, reply: /* data */ js.UndefOr[js.Any] => Unit = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(js.Any.fromFunction1(reply))
    __obj.asInstanceOf[Anon_Key]
  }
}

