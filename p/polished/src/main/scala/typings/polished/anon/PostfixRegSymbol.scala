package typings.polished.anon

import typings.polished.polishedStrings.BackslashRightparenthesis
import typings.polished.polishedStrings.Rightparenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostfixRegSymbol extends StObject {
  
  var postfix: ArgCountFNotation
  
  var regSymbol: BackslashRightparenthesis
  
  var symbol: Rightparenthesis
}
object PostfixRegSymbol {
  
  inline def apply(postfix: ArgCountFNotation): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "\\)", symbol = ")")
    __obj.asInstanceOf[PostfixRegSymbol]
  }
  
  extension [Self <: PostfixRegSymbol](x: Self) {
    
    inline def setPostfix(value: ArgCountFNotation): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashRightparenthesis): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Rightparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
