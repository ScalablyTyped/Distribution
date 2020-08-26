package typings.polished.anon

import typings.polished.polishedStrings.max
import typings.polished.polishedStrings.maxBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuncRegSymbol extends js.Object {
  var func: NotationPrecedenceRightToLeft = js.native
  var regSymbol: maxBackslashb = js.native
  var symbol: max = js.native
}

object FuncRegSymbol {
  @scala.inline
  def apply(func: NotationPrecedenceRightToLeft, regSymbol: maxBackslashb, symbol: max): FuncRegSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuncRegSymbol]
  }
  @scala.inline
  implicit class FuncRegSymbolOps[Self <: FuncRegSymbol] (val x: Self) extends AnyVal {
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
    def setFunc(value: NotationPrecedenceRightToLeft): Self = this.set("func", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegSymbol(value: maxBackslashb): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: max): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

