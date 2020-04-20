package typings.polished

import typings.polished.polishedStrings.Exclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostfix extends js.Object {
  var postfix: AnonArgCount
  var regSymbol: Exclamationmark
  var symbol: Exclamationmark
}

object AnonPostfix {
  @scala.inline
  def apply(postfix: AnonArgCount, regSymbol: Exclamationmark, symbol: Exclamationmark): AnonPostfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostfix]
  }
}

