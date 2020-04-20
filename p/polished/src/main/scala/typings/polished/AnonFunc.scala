package typings.polished

import typings.polished.polishedStrings.min
import typings.polished.polishedStrings.minBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFunc extends js.Object {
  var func: AnonFNotationPrecedence
  var regSymbol: minBackslashb
  var symbol: min
}

object AnonFunc {
  @scala.inline
  def apply(func: AnonFNotationPrecedence, regSymbol: minBackslashb, symbol: min): AnonFunc = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunc]
  }
}

