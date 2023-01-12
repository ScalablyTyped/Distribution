package typings.polished.anon

import typings.polished.polishedStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegSymbolSymbol extends StObject {
  
  var infix: FNotationPrecedence
  
  var regSymbol: /* \^ */ String
  
  var symbol: ^
}
object RegSymbolSymbol {
  
  inline def apply(infix: FNotationPrecedence): RegSymbolSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "\\^", symbol = "^")
    __obj.asInstanceOf[RegSymbolSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegSymbolSymbol] (val x: Self) extends AnyVal {
    
    inline def setInfix(value: FNotationPrecedence): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: /* \^ */ String): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: ^): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
