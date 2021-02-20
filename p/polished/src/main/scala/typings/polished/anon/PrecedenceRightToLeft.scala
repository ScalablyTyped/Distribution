package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`2`
import typings.polished.polishedStrings.Comma
import typings.polished.polishedStrings.infix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecedenceRightToLeft extends StObject {
  
  var argCount: `2` = js.native
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any = js.native
  
  var notation: infix = js.native
  
  var precedence: `1` = js.native
  
  var rightToLeft: `0` = js.native
  
  var symbol: Comma = js.native
}
object PrecedenceRightToLeft {
  
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any,
    notation: infix,
    precedence: `1`,
    rightToLeft: `0`,
    symbol: Comma
  ): PrecedenceRightToLeft = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
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
