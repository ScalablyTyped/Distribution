package typings
package oraLib.oraMod.oraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistOptions extends js.Object {
  /**
    * Symbol to replace the spinner with.
    * @default ' '
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to be persisted.
    * @default Current text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object PersistOptions {
  @scala.inline
  def apply(symbol: java.lang.String = null, text: java.lang.String = null): PersistOptions = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PersistOptions]
  }
}

