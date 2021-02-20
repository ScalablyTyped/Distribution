package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.Rightparenthesis
import typings.polished.polishedStrings.postfix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgCountFNotation extends StObject {
  
  var argCount: `1` = js.native
  
  var f: js.UndefOr[scala.Nothing] = js.native
  
  var notation: postfix = js.native
  
  var precedence: `0` = js.native
  
  var rightToLeft: `0` = js.native
  
  var symbol: Rightparenthesis = js.native
}
object ArgCountFNotation {
  
  @scala.inline
  def apply(argCount: `1`, notation: postfix, precedence: `0`, rightToLeft: `0`, symbol: Rightparenthesis): ArgCountFNotation = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgCountFNotation]
  }
  
  @scala.inline
  implicit class ArgCountFNotationMutableBuilder[Self <: ArgCountFNotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
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
