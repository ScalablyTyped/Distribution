package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://mongoosejs.com/docs/api.html#query_Query-setOptions */
trait ModelOptions extends js.Object {
  var session: js.UndefOr[ClientSession | Null] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(session: ClientSession = null): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOptions]
  }
}

