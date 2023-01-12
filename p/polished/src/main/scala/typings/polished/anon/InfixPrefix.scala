package typings.polished.anon

import typings.polished.polishedStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfixPrefix extends StObject {
  
  var infix: RightToLeft
  
  var prefix: Symbol
  
  var regSymbol: `-_`
  
  var symbol: `-_`
}
object InfixPrefix {
  
  inline def apply(infix: RightToLeft, prefix: Symbol): InfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = "-", symbol = "-")
    __obj.asInstanceOf[InfixPrefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfixPrefix] (val x: Self) extends AnyVal {
    
    inline def setInfix(value: RightToLeft): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Symbol): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: `-_`): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: `-_`): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
