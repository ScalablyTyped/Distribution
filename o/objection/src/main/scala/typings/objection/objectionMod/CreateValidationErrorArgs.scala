package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateValidationErrorArgs extends js.Object {
  var data: js.UndefOr[ErrorHash | js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  // This can be any string for custom errors. ValidationErrorType is there
  // only to document the default values objection uses internally.
  var `type`: ValidationErrorType | String
}

object CreateValidationErrorArgs {
  @scala.inline
  def apply(`type`: ValidationErrorType | String, data: ErrorHash | js.Any = null, message: String = null): CreateValidationErrorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[CreateValidationErrorArgs]
  }
}

