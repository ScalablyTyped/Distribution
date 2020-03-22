package typings.polished

import typings.polished.polishedStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSymbol extends js.Object {
  var infix: AnonPrecedence
  var regSymbol: Slash
  var symbol: Slash
}

object AnonSymbol {
  @scala.inline
  def apply(infix: AnonPrecedence, regSymbol: Slash, symbol: Slash): AnonSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSymbol]
  }
}

