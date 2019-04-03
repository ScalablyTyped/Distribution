package typings
package oraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixText extends js.Object {
  /**
  	 * Text to be persisted before the symbol. Default: Current `prefixText`.
  	 */
  var prefixText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Symbol to replace the spinner with.
  	 *
  	 * @default ' '
  	 */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text to be persisted after the symbol. Default: Current `text`.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrefixText {
  @scala.inline
  def apply(
    prefixText: java.lang.String = null,
    symbol: java.lang.String = null,
    text: java.lang.String = null
  ): Anon_PrefixText = {
    val __obj = js.Dynamic.literal()
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_PrefixText]
  }
}

