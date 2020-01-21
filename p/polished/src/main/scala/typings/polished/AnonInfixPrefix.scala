package typings.polished

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfixPrefix extends js.Object {
  var infix: Anon02ArgCount
  var prefix: Anon01
  var regSymbol: BackslashPlussign
  var symbol: Plussign
}

object AnonInfixPrefix {
  @scala.inline
  def apply(infix: Anon02ArgCount, prefix: Anon01, regSymbol: BackslashPlussign, symbol: Plussign): AnonInfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfixPrefix]
  }
}

