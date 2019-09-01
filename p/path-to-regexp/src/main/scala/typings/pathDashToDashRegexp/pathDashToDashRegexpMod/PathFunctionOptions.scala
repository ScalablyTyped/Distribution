package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
  /**
    * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object PathFunctionOptions {
  @scala.inline
  def apply(
    encode: (/* value */ String, /* token */ Key) => String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): PathFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[PathFunctionOptions]
  }
}

