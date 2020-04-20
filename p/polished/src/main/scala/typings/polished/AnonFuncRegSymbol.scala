package typings.polished

import typings.polished.polishedStrings.max
import typings.polished.polishedStrings.maxBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFuncRegSymbol extends js.Object {
  var func: AnonNotationPrecedenceRightToLeft
  var regSymbol: maxBackslashb
  var symbol: max
}

object AnonFuncRegSymbol {
  @scala.inline
  def apply(func: AnonNotationPrecedenceRightToLeft, regSymbol: maxBackslashb, symbol: max): AnonFuncRegSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFuncRegSymbol]
  }
}

