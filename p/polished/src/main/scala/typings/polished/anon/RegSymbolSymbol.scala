package typings.polished.anon

import typings.polished.polishedStrings.^
import typings.polished.polishedStrings.`Backslash^`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegSymbolSymbol extends StObject {
  
  var infix: FNotationPrecedence
  
  var regSymbol: `Backslash^`
  
  var symbol: ^
}
object RegSymbolSymbol {
  
  inline def apply(infix: FNotationPrecedence): RegSymbolSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "\\^", symbol = "^")
    __obj.asInstanceOf[RegSymbolSymbol]
  }
  
  extension [Self <: RegSymbolSymbol](x: Self) {
    
    inline def setInfix(value: FNotationPrecedence): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: `Backslash^`): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: ^): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
