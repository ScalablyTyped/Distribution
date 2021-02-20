package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.func
import typings.polished.polishedStrings.sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecedenceRightToLeftSymbol extends StObject {
  
  var argCount: `1` = js.native
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify sqrt */ js.Any = js.native
  
  var notation: func = js.native
  
  var precedence: `0` = js.native
  
  var rightToLeft: `0` = js.native
  
  var symbol: sqrt = js.native
}
object PrecedenceRightToLeftSymbol {
  
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify sqrt */ js.Any,
    notation: func,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: sqrt
  ): PrecedenceRightToLeftSymbol = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecedenceRightToLeftSymbol]
  }
  
  @scala.inline
  implicit class PrecedenceRightToLeftSymbolMutableBuilder[Self <: PrecedenceRightToLeftSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify sqrt */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: func): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: sqrt): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
