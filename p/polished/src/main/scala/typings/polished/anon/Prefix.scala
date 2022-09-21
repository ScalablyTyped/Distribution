package typings.polished.anon

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix extends StObject {
  
  var infix: Notation
  
  var prefix: Precedence
  
  var regSymbol: BackslashPlussign
  
  var symbol: Plussign
}
object Prefix {
  
  inline def apply(infix: Notation, prefix: Precedence): Prefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = "\\+", symbol = "+")
    __obj.asInstanceOf[Prefix]
  }
  
  extension [Self <: Prefix](x: Self) {
    
    inline def setInfix(value: Notation): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Precedence): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashPlussign): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
