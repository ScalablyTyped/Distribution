package typings.polished.anon

import typings.polished.polishedStrings.sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FuncRegSymbolSymbol extends StObject {
  
  var func: NotationPrecedenceRightToLeft
  
  var regSymbol: String
  
  var symbol: sqrt
}
object FuncRegSymbolSymbol {
  
  inline def apply(func: NotationPrecedenceRightToLeft): FuncRegSymbolSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = "sqrt\\b", symbol = "sqrt")
    __obj.asInstanceOf[FuncRegSymbolSymbol]
  }
  
  extension [Self <: FuncRegSymbolSymbol](x: Self) {
    
    inline def setFunc(value: NotationPrecedenceRightToLeft): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: String): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: sqrt): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
