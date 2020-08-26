package typings.polished.anon

import typings.polished.polishedStrings.sqrt
import typings.polished.polishedStrings.sqrtBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegSymbolSymbol extends js.Object {
  var func: PrecedenceRightToLeftSymbol = js.native
  var regSymbol: sqrtBackslashb = js.native
  var symbol: sqrt = js.native
}

object RegSymbolSymbol {
  @scala.inline
  def apply(func: PrecedenceRightToLeftSymbol, regSymbol: sqrtBackslashb, symbol: sqrt): RegSymbolSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegSymbolSymbol]
  }
  @scala.inline
  implicit class RegSymbolSymbolOps[Self <: RegSymbolSymbol] (val x: Self) extends AnyVal {
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
    def setFunc(value: PrecedenceRightToLeftSymbol): Self = this.set("func", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegSymbol(value: sqrtBackslashb): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: sqrt): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

