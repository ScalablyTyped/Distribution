package typings.polished.anon

import typings.polished.polishedStrings.BackslashLeftparenthesis
import typings.polished.polishedStrings.Leftparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixRegSymbol extends js.Object {
  var prefix: RightToLeftSymbol
  var regSymbol: BackslashLeftparenthesis
  var symbol: Leftparenthesis
}

object PrefixRegSymbol {
  @scala.inline
  def apply(prefix: RightToLeftSymbol, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): PrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixRegSymbol]
  }
}

