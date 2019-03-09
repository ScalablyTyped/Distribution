package typings
package oraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Symbol extends js.Object {
  /**
  	 * Symbol to replace the spinner with.
  	 *
  	 * @default ' '
  	 */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text to be persisted. Default: Current text.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Symbol {
  @scala.inline
  def apply(symbol: java.lang.String = null, text: java.lang.String = null): Anon_Symbol = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Symbol]
  }
}

