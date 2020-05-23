package typings.numeral.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var symbol: String
}

object Symbol {
  @scala.inline
  def apply(symbol: String): Symbol = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

