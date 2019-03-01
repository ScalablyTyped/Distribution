package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexTokenizerOptions extends js.Object {
  var discardEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: stdLib.RegExp
}

object RegexTokenizerOptions {
  @scala.inline
  def apply(pattern: stdLib.RegExp, discardEmpty: js.UndefOr[scala.Boolean] = js.undefined): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(discardEmpty)) __obj.updateDynamic("discardEmpty")(discardEmpty)
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
}

