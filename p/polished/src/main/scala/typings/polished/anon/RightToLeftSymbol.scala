package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.Leftparenthesis
import typings.polished.polishedStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightToLeftSymbol extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
  
  var notation: prefix
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: Leftparenthesis
}
object RightToLeftSymbol {
  
  inline def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
  ): RightToLeftSymbol = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "prefix", precedence = 0, rightToLeft = 0, symbol = "(")
    __obj.asInstanceOf[RightToLeftSymbol]
  }
  
  extension [Self <: RightToLeftSymbol](x: Self) {
    
    inline def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: prefix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Leftparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
