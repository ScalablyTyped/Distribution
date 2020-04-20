package typings.polished

import typings.polished.polishedStrings.Comma
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfixRegSymbol extends js.Object {
  var infix: AnonPrecedenceRightToLeft
  var regSymbol: Comma
  var symbol: Comma
}

object AnonInfixRegSymbol {
  @scala.inline
  def apply(infix: AnonPrecedenceRightToLeft, regSymbol: Comma, symbol: Comma): AnonInfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfixRegSymbol]
  }
}

