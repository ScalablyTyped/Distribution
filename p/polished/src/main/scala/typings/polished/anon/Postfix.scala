package typings.polished.anon

import typings.polished.polishedStrings.Exclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postfix extends StObject {
  
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
  implicit class PostfixMutableBuilder[Self <: Postfix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostfix(value: ArgCount): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: Exclamationmark): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Exclamationmark): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
