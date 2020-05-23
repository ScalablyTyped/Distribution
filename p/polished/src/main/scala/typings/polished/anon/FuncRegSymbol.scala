package typings.polished.anon

import typings.polished.polishedStrings.max
import typings.polished.polishedStrings.maxBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuncRegSymbol extends js.Object {
  var func: NotationPrecedenceRightToLeft
  var regSymbol: maxBackslashb
  var symbol: max
}

object FuncRegSymbol {
  @scala.inline
  def apply(func: NotationPrecedenceRightToLeft, regSymbol: maxBackslashb, symbol: max): FuncRegSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuncRegSymbol]
  }
}

