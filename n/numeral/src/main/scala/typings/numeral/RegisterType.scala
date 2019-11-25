package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.numeral.numeralStrings.format
  - typings.numeral.numeralStrings.locale
*/
trait RegisterType extends js.Object

object RegisterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def format: typings.numeral.numeralStrings.format = this.cast("format")
  @scala.inline
  def locale: typings.numeral.numeralStrings.locale = this.cast("locale")
}

