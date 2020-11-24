package typings.polished.anon

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefix extends js.Object {
  
  var infix: RightToLeft = js.native
  
  var prefix: ArgCountF = js.native
  
  var regSymbol: BackslashPlussign = js.native
  
  var symbol: Plussign = js.native
}
object Prefix {
  
  @scala.inline
  def apply(infix: RightToLeft, prefix: ArgCountF, regSymbol: BackslashPlussign, symbol: Plussign): Prefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit class PrefixOps[Self <: Prefix] (val x: Self) extends AnyVal {
    
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
    def setInfix(value: RightToLeft): Self = this.set("infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: ArgCountF): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashPlussign): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Plussign): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
