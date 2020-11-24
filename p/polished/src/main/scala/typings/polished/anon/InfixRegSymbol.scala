package typings.polished.anon

import typings.polished.polishedStrings.Comma
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfixRegSymbol extends js.Object {
  
  var infix: PrecedenceRightToLeft = js.native
  
  var regSymbol: Comma = js.native
  
  var symbol: Comma = js.native
}
object InfixRegSymbol {
  
  @scala.inline
  def apply(infix: PrecedenceRightToLeft, regSymbol: Comma, symbol: Comma): InfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfixRegSymbol]
  }
  
  @scala.inline
  implicit class InfixRegSymbolOps[Self <: InfixRegSymbol] (val x: Self) extends AnyVal {
    
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
    def setInfix(value: PrecedenceRightToLeft): Self = this.set("infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: Comma): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Comma): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
