package typings.polished.anon

import typings.polished.polishedStrings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends StObject {
  
  var infix: Precedence = js.native
  
  var regSymbol: Slash = js.native
  
  var symbol: Slash = js.native
}
object Symbol {
  
  @scala.inline
  def apply(infix: Precedence, regSymbol: Slash, symbol: Slash): Symbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfix(value: Precedence): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: Slash): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Slash): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
