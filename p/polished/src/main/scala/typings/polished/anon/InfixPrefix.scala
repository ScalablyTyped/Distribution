package typings.polished.anon

import typings.polished.polishedStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfixPrefix extends js.Object {
  var infix: FNotation
  var prefix: NotationPrecedence
  var regSymbol: `-_`
  var symbol: `-_`
}

object InfixPrefix {
  @scala.inline
  def apply(infix: FNotation, prefix: NotationPrecedence, regSymbol: `-_`, symbol: `-_`): InfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfixPrefix]
  }
}

