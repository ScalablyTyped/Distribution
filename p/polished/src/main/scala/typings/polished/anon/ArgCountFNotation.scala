package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.Rightparenthesis
import typings.polished.polishedStrings.postfix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgCountFNotation extends StObject {
  
  var argCount: `1`
  
  var f: Unit
  
  var notation: postfix
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: Rightparenthesis
}
object ArgCountFNotation {
  
  @scala.inline
  def apply(f: Unit): ArgCountFNotation = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "postfix", precedence = 0, rightToLeft = 0, symbol = ")")
    __obj.asInstanceOf[ArgCountFNotation]
  }
  
  @scala.inline
  implicit class ArgCountFNotationMutableBuilder[Self <: ArgCountFNotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Unit): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: postfix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Rightparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
