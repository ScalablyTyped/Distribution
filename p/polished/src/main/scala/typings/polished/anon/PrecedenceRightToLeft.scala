package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`2`
import typings.polished.polishedStrings.Comma
import typings.polished.polishedStrings.infix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecedenceRightToLeft extends StObject {
  
  var argCount: `2`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any
  
  var notation: infix
  
  var precedence: `1`
  
  var rightToLeft: `0`
  
  var symbol: Comma
}
object PrecedenceRightToLeft {
  
  @scala.inline
  def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any
  ): PrecedenceRightToLeft = {
    val __obj = js.Dynamic.literal(argCount = 2, f = f.asInstanceOf[js.Any], notation = "infix", precedence = 1, rightToLeft = 0, symbol = ",")
    __obj.asInstanceOf[PrecedenceRightToLeft]
  }
  
  @scala.inline
  implicit class PrecedenceRightToLeftMutableBuilder[Self <: PrecedenceRightToLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `2`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: infix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `1`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Comma): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
