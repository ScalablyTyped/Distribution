package typings.polished.anon

import typings.polished.polishedStrings.Comma
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfixRegSymbol extends js.Object {
  var infix: PrecedenceRightToLeft
  var regSymbol: Comma
  var symbol: Comma
}

object InfixRegSymbol {
  @scala.inline
  def apply(infix: PrecedenceRightToLeft, regSymbol: Comma, symbol: Comma): InfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfixRegSymbol]
  }
}

