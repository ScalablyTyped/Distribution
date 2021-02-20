package typings.polished.anon

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegSymbol extends StObject {
  
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
  implicit class RegSymbolMutableBuilder[Self <: RegSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfix(value: Notation): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashAsterisk): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Asterisk): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
