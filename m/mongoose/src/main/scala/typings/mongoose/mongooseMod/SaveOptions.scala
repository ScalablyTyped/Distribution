package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends js.Object {
  var safe: js.UndefOr[Boolean | WriteConcern] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var validateBeforeSave: js.UndefOr[Boolean] = js.undefined
}

object SaveOptions {
  @scala.inline
  def apply(
    safe: Boolean | WriteConcern = null,
    session: ClientSession = null,
    validateBeforeSave: js.UndefOr[Boolean] = js.undefined
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(validateBeforeSave)) __obj.updateDynamic("validateBeforeSave")(validateBeforeSave)
    __obj.asInstanceOf[SaveOptions]
  }
}

