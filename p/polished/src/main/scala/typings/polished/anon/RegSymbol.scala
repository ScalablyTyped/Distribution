package typings.polished.anon

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegSymbol extends StObject {
  
  var infix: Notation
  
  var regSymbol: BackslashAsterisk
  
  var symbol: Asterisk
}
object RegSymbol {
  
  inline def apply(infix: Notation): RegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "\\*", symbol = "*")
    __obj.asInstanceOf[RegSymbol]
  }
  
  extension [Self <: RegSymbol](x: Self) {
    
    inline def setInfix(value: Notation): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashAsterisk): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Asterisk): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
