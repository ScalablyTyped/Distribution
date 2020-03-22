package typings.polished

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var infix: AnonRightToLeft
  var prefix: AnonArgCountF
  var regSymbol: BackslashPlussign
  var symbol: Plussign
}

object AnonPrefix {
  @scala.inline
  def apply(infix: AnonRightToLeft, prefix: AnonArgCountF, regSymbol: BackslashPlussign, symbol: Plussign): AnonPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefix]
  }
}

