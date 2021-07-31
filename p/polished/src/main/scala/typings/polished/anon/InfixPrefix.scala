package typings.polished.anon

import typings.polished.polishedStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfixPrefix extends StObject {
  
  var infix: FNotation
  
  var prefix: NotationPrecedence
  
  var regSymbol: `-_`
  
  var symbol: `-_`
}
object InfixPrefix {
  
  @scala.inline
  def apply(infix: FNotation, prefix: NotationPrecedence): InfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = "-", symbol = "-")
    __obj.asInstanceOf[InfixPrefix]
  }
  
  @scala.inline
  implicit class InfixPrefixMutableBuilder[Self <: InfixPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfix(value: FNotation): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: NotationPrecedence): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: `-_`): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: `-_`): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
