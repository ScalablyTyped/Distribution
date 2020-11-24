package typings.polished.anon

import typings.polished.polishedStrings.Exclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postfix extends js.Object {
  
  var postfix: ArgCount = js.native
  
  var regSymbol: Exclamationmark = js.native
  
  var symbol: Exclamationmark = js.native
}
object Postfix {
  
  @scala.inline
  def apply(postfix: ArgCount, regSymbol: Exclamationmark, symbol: Exclamationmark): Postfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postfix]
  }
  
  @scala.inline
  implicit class PostfixOps[Self <: Postfix] (val x: Self) extends AnyVal {
    
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
    def setPostfix(value: ArgCount): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: Exclamationmark): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Exclamationmark): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
