package typings.polished.anon

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegSymbol extends js.Object {
  var infix: Notation
  var regSymbol: BackslashAsterisk
  var symbol: Asterisk
}

object RegSymbol {
  @scala.inline
  def apply(infix: Notation, regSymbol: BackslashAsterisk, symbol: Asterisk): RegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegSymbol]
  }
}

