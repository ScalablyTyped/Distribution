package typings.polished.anon

import typings.polished.polishedStrings.min
import typings.polished.polishedStrings.minBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Func extends js.Object {
  
  var func: FNotationPrecedence = js.native
  
  var regSymbol: minBackslashb = js.native
  
  var symbol: min = js.native
}
object Func {
  
  @scala.inline
  def apply(func: FNotationPrecedence, regSymbol: minBackslashb, symbol: min): Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit class FuncOps[Self <: Func] (val x: Self) extends AnyVal {
    
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
    def setFunc(value: FNotationPrecedence): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: minBackslashb): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: min): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
