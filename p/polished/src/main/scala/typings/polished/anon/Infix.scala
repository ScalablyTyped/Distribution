package typings.polished.anon

import typings.polished.polishedStrings.Asterisk
import typings.polished.polishedStrings.BackslashAsterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Infix extends StObject {
  
  var infix: ArgCount
  
  var regSymbol: BackslashAsterisk
  
  var symbol: Asterisk
}
object Infix {
  
  inline def apply(infix: ArgCount): Infix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = "\\*", symbol = "*")
    __obj.asInstanceOf[Infix]
  }
  
  extension [Self <: Infix](x: Self) {
    
    inline def setInfix(value: ArgCount): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashAsterisk): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Asterisk): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
