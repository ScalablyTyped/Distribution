package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensToFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object TokensToFunctionOptions {
  @scala.inline
  def apply(
    encode: (/* value */ String, /* token */ Key) => String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    validate: js.UndefOr[Boolean] = js.undefined
  ): TokensToFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokensToFunctionOptions]
  }
}

