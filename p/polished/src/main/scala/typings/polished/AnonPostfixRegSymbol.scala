package typings.polished

import typings.polished.polishedStrings.BackslashRightparenthesis
import typings.polished.polishedStrings.Rightparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostfixRegSymbol extends js.Object {
  var postfix: Anon01ArgCountF
  var regSymbol: BackslashRightparenthesis
  var symbol: Rightparenthesis
}

object AnonPostfixRegSymbol {
  @scala.inline
  def apply(postfix: Anon01ArgCountF, regSymbol: BackslashRightparenthesis, symbol: Rightparenthesis): AnonPostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPostfixRegSymbol]
  }
}

