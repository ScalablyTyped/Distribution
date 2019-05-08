package typings
package mongooseLib.mongooseMod.SchemaTypeOptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOpts extends ValidateOptsBase {
  /** deprecated */
  var isAsync: js.UndefOr[mongooseLib.mongooseLibNumbers.`false`] = js.undefined
  var validator: js.UndefOr[stdLib.RegExp | ValidateFn[_]] = js.undefined
}

object ValidateOpts {
  @scala.inline
  def apply(
    isAsync: mongooseLib.mongooseLibNumbers.`false` = null,
    msg: java.lang.String = null,
    `type`: java.lang.String = null,
    validator: stdLib.RegExp | ValidateFn[_] = null
  ): ValidateOpts = {
    val __obj = js.Dynamic.literal()
    if (isAsync != null) __obj.updateDynamic("isAsync")(isAsync)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOpts]
  }
}

