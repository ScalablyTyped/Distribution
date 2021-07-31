package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`6`
import typings.polished.polishedStrings.Exclamationmark
import typings.polished.polishedStrings.postfix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgCount extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
  
  var notation: postfix
  
  var precedence: `6`
  
  var rightToLeft: `0`
  
  var symbol: Exclamationmark
}
object ArgCount {
  
  @scala.inline
  def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
  ): ArgCount = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "postfix", precedence = 6, rightToLeft = 0, symbol = "!")
    __obj.asInstanceOf[ArgCount]
  }
  
  @scala.inline
  implicit class ArgCountMutableBuilder[Self <: ArgCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: postfix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `6`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Exclamationmark): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
