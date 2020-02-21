package typings.mongoose.mod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptsBase extends js.Object {
  var message: js.UndefOr[String | ValidatorMessageFn] = js.undefined
  var msg: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ValidateOptsBase {
  @scala.inline
  def apply(message: String | ValidatorMessageFn = null, msg: String = null, `type`: String = null): ValidateOptsBase = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptsBase]
  }
}

