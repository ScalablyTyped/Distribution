package typings.polished.anon

import typings.polished.polishedStrings.BackslashRightparenthesis
import typings.polished.polishedStrings.Rightparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixRegSymbol extends js.Object {
  
  var postfix: ArgCountFNotation = js.native
  
  var regSymbol: BackslashRightparenthesis = js.native
  
  var symbol: Rightparenthesis = js.native
}
object PostfixRegSymbol {
  
  @scala.inline
  def apply(postfix: ArgCountFNotation, regSymbol: BackslashRightparenthesis, symbol: Rightparenthesis): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostfixRegSymbol]
  }
  
  @scala.inline
  implicit class PostfixRegSymbolOps[Self <: PostfixRegSymbol] (val x: Self) extends AnyVal {
    
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
    def setPostfix(value: ArgCountFNotation): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashRightparenthesis): Self = this.set("regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Rightparenthesis): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
