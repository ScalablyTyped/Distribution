package typings.polished.anon

import typings.polished.polishedStrings.min
import typings.polished.polishedStrings.minBackslashb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Func extends StObject {
  
  var func: FNotationPrecedence = js.native
  
  var regSymbol: minBackslashb = js.native
  
  var symbol: min = js.native
}
object Func {
  
  @scala.inline
  def apply(func: FNotationPrecedence, regSymbol: minBackslashb, symbol: min): Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit class FuncMutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunc(value: FNotationPrecedence): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: minBackslashb): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: min): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
