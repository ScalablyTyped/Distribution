package typings.polished.anon

import typings.polished.polishedInts.`0`
import typings.polished.polishedInts.`1`
import typings.polished.polishedStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FNotation extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
  
  var notation: prefix
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: /* ( */ String
}
object FNotation {
  
  inline def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
  ): FNotation = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "prefix", precedence = 0, rightToLeft = 0, symbol = "(")
    __obj.asInstanceOf[FNotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FNotation] (val x: Self) extends AnyVal {
    
    inline def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: prefix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: /* ( */ String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
