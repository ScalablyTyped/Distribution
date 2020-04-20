package typings.polished

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegSymbol extends js.Object {
  var infix: AnonNotation
  var regSymbol: BackslashAsterisk
  var symbol: Asterisk
}

object AnonRegSymbol {
  @scala.inline
  def apply(infix: AnonNotation, regSymbol: BackslashAsterisk, symbol: Asterisk): AnonRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegSymbol]
  }
}

