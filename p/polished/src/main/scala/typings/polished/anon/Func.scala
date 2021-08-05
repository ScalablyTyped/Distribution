package typings.polished.anon

import typings.polished.polishedStrings.min
import typings.polished.polishedStrings.minBackslashb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  var func: FNotationPrecedence
  
  var regSymbol: minBackslashb
  
  var symbol: min
}
object Func {
  
  inline def apply(func: FNotationPrecedence): Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = "min\\b", symbol = "min")
    __obj.asInstanceOf[Func]
  }
  
  extension [Self <: Func](x: Self) {
    
    inline def setFunc(value: FNotationPrecedence): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: minBackslashb): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: min): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
