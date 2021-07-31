package typings.polished.anon

import typings.polished.polishedStrings.max
import typings.polished.polishedStrings.maxBackslashb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FuncRegSymbol extends StObject {
  
  var func: NotationPrecedenceRightToLeft
  
  var regSymbol: maxBackslashb
  
  var symbol: max
}
object FuncRegSymbol {
  
  @scala.inline
  def apply(func: NotationPrecedenceRightToLeft): FuncRegSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = "max\\b", symbol = "max")
    __obj.asInstanceOf[FuncRegSymbol]
  }
  
  @scala.inline
  implicit class FuncRegSymbolMutableBuilder[Self <: FuncRegSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunc(value: NotationPrecedenceRightToLeft): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: maxBackslashb): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: max): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
