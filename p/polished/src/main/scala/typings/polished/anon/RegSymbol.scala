package typings.polished.anon

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegSymbol extends js.Object {
  var infix: Notation = js.native
  var regSymbol: BackslashAsterisk = js.native
  var symbol: Asterisk = js.native
}

object RegSymbol {
  @scala.inline
  def apply(infix: Notation, regSymbol: BackslashAsterisk, symbol: Asterisk): RegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegSymbol]
  }
  @scala.inline
  implicit class RegSymbolOps[Self <: RegSymbol] (val x: Self) extends AnyVal {
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
    def setInfix(value: Notation): Self = this.set("infix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegSymbol(value: BackslashAsterisk): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Asterisk): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

