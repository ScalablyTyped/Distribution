package typings.mongoose.mongooseMod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptsBase extends js.Object {
  var msg: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ValidateOptsBase {
  @scala.inline
  def apply(msg: String = null, `type`: String = null): ValidateOptsBase = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValidateOptsBase]
  }
}

