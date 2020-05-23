package typings.polished.anon

import typings.polished.polishedStrings.min
import typings.polished.polishedStrings.minBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Func extends js.Object {
  var func: FNotationPrecedence
  var regSymbol: minBackslashb
  var symbol: min
}

object Func {
  @scala.inline
  def apply(func: FNotationPrecedence, regSymbol: minBackslashb, symbol: min): Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
}

