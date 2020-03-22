package typings.polished

import typings.polished.polishedStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfixPrefix extends js.Object {
  var infix: AnonFNotation
  var prefix: AnonNotationPrecedence
  var regSymbol: `-_`
  var symbol: `-_`
}

object AnonInfixPrefix {
  @scala.inline
  def apply(infix: AnonFNotation, prefix: AnonNotationPrecedence, regSymbol: `-_`, symbol: `-_`): AnonInfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfixPrefix]
  }
}

