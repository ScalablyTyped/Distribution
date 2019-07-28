package typings.natural.naturalMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexTokenizerOptions extends js.Object {
  var discardEmpty: js.UndefOr[Boolean] = js.undefined
  var pattern: RegExp
}

object RegexTokenizerOptions {
  @scala.inline
  def apply(pattern: RegExp, discardEmpty: js.UndefOr[Boolean] = js.undefined): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (!js.isUndefined(discardEmpty)) __obj.updateDynamic("discardEmpty")(discardEmpty)
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
}

