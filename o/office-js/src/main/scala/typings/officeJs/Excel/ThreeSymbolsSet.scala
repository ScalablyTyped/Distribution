package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeSymbolsSet extends /* index */ NumberDictionary[Icon] {
  
  var greenCheckSymbol: Icon = js.native
  
  var redCrossSymbol: Icon = js.native
  
  var yellowExclamationSymbol: Icon = js.native
}
object ThreeSymbolsSet {
  
  @scala.inline
  def apply(greenCheckSymbol: Icon, redCrossSymbol: Icon, yellowExclamationSymbol: Icon): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal(greenCheckSymbol = greenCheckSymbol.asInstanceOf[js.Any], redCrossSymbol = redCrossSymbol.asInstanceOf[js.Any], yellowExclamationSymbol = yellowExclamationSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
  
  @scala.inline
  implicit class ThreeSymbolsSetMutableBuilder[Self <: ThreeSymbolsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenCheckSymbol(value: Icon): Self = StObject.set(x, "greenCheckSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCrossSymbol(value: Icon): Self = StObject.set(x, "redCrossSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowExclamationSymbol(value: Icon): Self = StObject.set(x, "yellowExclamationSymbol", value.asInstanceOf[js.Any])
  }
}
