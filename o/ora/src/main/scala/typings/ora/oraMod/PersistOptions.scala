package typings.ora.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistOptions extends js.Object {
  /**
  		Text to be persisted before the symbol. No prefix text will be displayed if set to an empty string.
  		Default: Current `prefixText`.
  		*/
  val prefixText: js.UndefOr[String] = js.undefined
  /**
  		Symbol to replace the spinner with.
  		@default ' '
  		*/
  val symbol: js.UndefOr[String] = js.undefined
  /**
  		Text to be persisted after the symbol.
  		Default: Current `text`.
  		*/
  val text: js.UndefOr[String] = js.undefined
}

object PersistOptions {
  @scala.inline
  def apply(prefixText: String = null, symbol: String = null, text: String = null): PersistOptions = {
    val __obj = js.Dynamic.literal()
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PersistOptions]
  }
}

