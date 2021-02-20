package typings.polished.anon

import typings.polished.polishedStrings.Comma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfixRegSymbol extends StObject {
  
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
  implicit class InfixRegSymbolMutableBuilder[Self <: InfixRegSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfix(value: PrecedenceRightToLeft): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: Comma): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Comma): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
