package typings.polished.anon

import typings.polished.polishedStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var infix: Precedence
  var regSymbol: Slash
  var symbol: Slash
}

object Symbol {
  @scala.inline
  def apply(infix: Precedence, regSymbol: Slash, symbol: Slash): Symbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

