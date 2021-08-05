package typings.polished.anon

import typings.polished.polishedStrings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol extends StObject {
  
  var infix: Precedence
  
  var regSymbol: Slash
  
  var symbol: Slash
}
object Symbol {
  
  inline def apply(infix: Precedence): Symbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "/", symbol = "/")
    __obj.asInstanceOf[Symbol]
  }
  
  extension [Self <: Symbol](x: Self) {
    
    inline def setInfix(value: Precedence): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Slash): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Slash): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
