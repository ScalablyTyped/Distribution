package typings.polished.anon

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var infix: RightToLeft
  var prefix: ArgCountF
  var regSymbol: BackslashPlussign
  var symbol: Plussign
}

object Prefix {
  @scala.inline
  def apply(infix: RightToLeft, prefix: ArgCountF, regSymbol: BackslashPlussign, symbol: Plussign): Prefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}

