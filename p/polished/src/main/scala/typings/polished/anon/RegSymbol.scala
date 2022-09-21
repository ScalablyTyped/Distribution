package typings.polished.anon

import typings.polished.polishedStrings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegSymbol extends StObject {
  
  var infix: F
  
  var regSymbol: Slash
  
  var symbol: Slash
}
object RegSymbol {
  
  inline def apply(infix: F): RegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "/", symbol = "/")
    __obj.asInstanceOf[RegSymbol]
  }
  
  extension [Self <: RegSymbol](x: Self) {
    
    inline def setInfix(value: F): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Slash): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Slash): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
