package typings.polished.anon

import typings.polished.polishedStrings.Comma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfixRegSymbol extends StObject {
  
  var infix: ArgCountF
  
  var regSymbol: Comma
  
  var symbol: Comma
}
object InfixRegSymbol {
  
  inline def apply(infix: ArgCountF): InfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = ",", symbol = ",")
    __obj.asInstanceOf[InfixRegSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfixRegSymbol] (val x: Self) extends AnyVal {
    
    inline def setInfix(value: ArgCountF): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Comma): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Comma): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
