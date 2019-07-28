package typings.mongoose.mongooseMod.SchemaTypeOptsNs

import typings.mongoose.mongooseNumbers.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOpts extends ValidateOptsBase {
  /** deprecated */
  var isAsync: js.UndefOr[`false`] = js.undefined
  var validator: js.UndefOr[RegExp | ValidateFn[_]] = js.undefined
}

object ValidateOpts {
  @scala.inline
  def apply(
    isAsync: `false` = null,
    msg: String = null,
    `type`: String = null,
    validator: RegExp | ValidateFn[_] = null
  ): ValidateOpts = {
    val __obj = js.Dynamic.literal()
    if (isAsync != null) __obj.updateDynamic("isAsync")(isAsync)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOpts]
  }
}

