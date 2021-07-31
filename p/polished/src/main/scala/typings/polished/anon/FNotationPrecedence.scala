package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.func
import typings.polished.polishedStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FNotationPrecedence extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any
  
  var notation: func
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: min
}
object FNotationPrecedence {
  
  @scala.inline
  def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any
  ): FNotationPrecedence = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "func", precedence = 0, rightToLeft = 0, symbol = "min")
    __obj.asInstanceOf[FNotationPrecedence]
  }
  
  @scala.inline
  implicit class FNotationPrecedenceMutableBuilder[Self <: FNotationPrecedence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: func): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: min): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
