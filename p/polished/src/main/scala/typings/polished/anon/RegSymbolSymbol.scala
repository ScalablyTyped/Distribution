package typings.polished.anon

import typings.polished.polishedStrings.sqrt
import typings.polished.polishedStrings.sqrtBackslashb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegSymbolSymbol extends StObject {
  
  var func: PrecedenceRightToLeftSymbol
  
  var regSymbol: sqrtBackslashb
  
  var symbol: sqrt
}
object RegSymbolSymbol {
  
  inline def apply(func: PrecedenceRightToLeftSymbol): RegSymbolSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = "sqrt\\b", symbol = "sqrt")
    __obj.asInstanceOf[RegSymbolSymbol]
  }
  
  extension [Self <: RegSymbolSymbol](x: Self) {
    
    inline def setFunc(value: PrecedenceRightToLeftSymbol): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: sqrtBackslashb): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: sqrt): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
