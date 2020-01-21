package typings.polished

import typings.polished.polishedStrings.BackslashLeftparenthesis
import typings.polished.polishedStrings.Leftparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var prefix: Anon01ArgCount
  var regSymbol: BackslashLeftparenthesis
  var symbol: Leftparenthesis
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: Anon01ArgCount, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefix]
  }
}

