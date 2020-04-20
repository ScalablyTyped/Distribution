package typings.polished

import typings.polished.polishedStrings.^
import typings.polished.polishedStrings.`Backslash^`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfix extends js.Object {
  var infix: AnonF
  var regSymbol: `Backslash^`
  var symbol: ^
}

object AnonInfix {
  @scala.inline
  def apply(infix: AnonF, regSymbol: `Backslash^`, symbol: ^): AnonInfix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfix]
  }
}

