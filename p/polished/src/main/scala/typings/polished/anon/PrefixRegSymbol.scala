package typings.polished.anon

import typings.polished.polishedStrings.BackslashLeftparenthesis
import typings.polished.polishedStrings.Leftparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixRegSymbol extends js.Object {
  var prefix: RightToLeftSymbol = js.native
  var regSymbol: BackslashLeftparenthesis = js.native
  var symbol: Leftparenthesis = js.native
}

object PrefixRegSymbol {
  @scala.inline
  def apply(prefix: RightToLeftSymbol, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): PrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixRegSymbol]
  }
  @scala.inline
  implicit class PrefixRegSymbolOps[Self <: PrefixRegSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefix(value: RightToLeftSymbol): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegSymbol(value: BackslashLeftparenthesis): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Leftparenthesis): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

