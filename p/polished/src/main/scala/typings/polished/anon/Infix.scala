package typings.polished.anon

import typings.polished.polishedStrings.^
import typings.polished.polishedStrings.`Backslash^`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Infix extends js.Object {
  var infix: F = js.native
  var regSymbol: `Backslash^` = js.native
  var symbol: ^ = js.native
}

object Infix {
  @scala.inline
  def apply(infix: F, regSymbol: `Backslash^`, symbol: ^): Infix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infix]
  }
  @scala.inline
  implicit class InfixOps[Self <: Infix] (val x: Self) extends AnyVal {
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
    def setInfix(value: F): Self = this.set("infix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegSymbol(value: `Backslash^`): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: ^): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

