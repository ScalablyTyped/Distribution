package typings.polished.anon

import typings.polished.polishedStrings.sqrt
import typings.polished.polishedStrings.sqrtBackslashb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegSymbolSymbol extends StObject {
  
  var func: PrecedenceRightToLeftSymbol = js.native
  
  var regSymbol: sqrtBackslashb = js.native
  
  var symbol: sqrt = js.native
}
object RegSymbolSymbol {
  
  @scala.inline
  def apply(func: PrecedenceRightToLeftSymbol, regSymbol: sqrtBackslashb, symbol: sqrt): RegSymbolSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegSymbolSymbol]
  }
  
  @scala.inline
  implicit class RegSymbolSymbolMutableBuilder[Self <: RegSymbolSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunc(value: PrecedenceRightToLeftSymbol): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: sqrtBackslashb): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: sqrt): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
