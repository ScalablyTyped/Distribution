package typings.polished.anon

import typings.polished.polishedStrings.Exclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Postfix extends js.Object {
  var postfix: ArgCount
  var regSymbol: Exclamationmark
  var symbol: Exclamationmark
}

object Postfix {
  @scala.inline
  def apply(postfix: ArgCount, regSymbol: Exclamationmark, symbol: Exclamationmark): Postfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postfix]
  }
}

