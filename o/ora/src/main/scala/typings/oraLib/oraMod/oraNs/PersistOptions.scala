package typings
package oraLib.oraMod.oraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistOptions extends js.Object {
  /**
  		Text to be persisted before the symbol. Default: Current `prefixText`.
  		*/
  val prefixText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Symbol to replace the spinner with.
  		@default ' '
  		*/
  val symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Text to be persisted after the symbol. Default: Current `text`.
  		*/
  val text: js.UndefOr[java.lang.String] = js.undefined
}

object PersistOptions {
  @scala.inline
  def apply(
    prefixText: java.lang.String = null,
    symbol: java.lang.String = null,
    text: java.lang.String = null
  ): PersistOptions = {
    val __obj = js.Dynamic.literal()
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PersistOptions]
  }
}

