package typings.parse.Parse.Object

import typings.parse.Parse.ErrorOption
import typings.parse.Parse.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions
  extends ErrorOption
     with SilentOption {
  var promise: js.UndefOr[js.Any] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(error: js.Function = null, promise: js.Any = null, silent: js.UndefOr[Boolean] = js.undefined): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[SetOptions]
  }
}

