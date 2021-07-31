package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`3`
import typings.polished.polishedStrings.Plussign
import typings.polished.polishedStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgCountF extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
  
  var notation: prefix
  
  var precedence: `3`
  
  var rightToLeft: `0`
  
  var symbol: Plussign
}
object ArgCountF {
  
  @scala.inline
  def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
  ): ArgCountF = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "prefix", precedence = 3, rightToLeft = 0, symbol = "+")
    __obj.asInstanceOf[ArgCountF]
  }
  
  @scala.inline
  implicit class ArgCountFMutableBuilder[Self <: ArgCountF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: prefix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `3`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
