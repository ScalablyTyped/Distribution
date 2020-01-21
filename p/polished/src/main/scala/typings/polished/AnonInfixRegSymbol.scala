package typings.polished

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfixRegSymbol extends js.Object {
  var infix: Anon0
  var regSymbol: BackslashAsterisk
  var symbol: Asterisk
}

object AnonInfixRegSymbol {
  @scala.inline
  def apply(infix: Anon0, regSymbol: BackslashAsterisk, symbol: Asterisk): AnonInfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfixRegSymbol]
  }
}

