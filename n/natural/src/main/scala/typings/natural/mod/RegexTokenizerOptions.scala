package typings.natural.mod

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
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(discardEmpty)) __obj.updateDynamic("discardEmpty")(discardEmpty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
}

