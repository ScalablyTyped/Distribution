package typings.polished.anon

import typings.polished.polishedStrings.BackslashRightparenthesis
import typings.polished.polishedStrings.Rightparenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postfix extends StObject {
  
  var postfix: NotationPrecedence
  
  var regSymbol: BackslashRightparenthesis
  
  var symbol: Rightparenthesis
}
object Postfix {
  
  inline def apply(postfix: NotationPrecedence): Postfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "\\)", symbol = ")")
    __obj.asInstanceOf[Postfix]
  }
  
  extension [Self <: Postfix](x: Self) {
    
    inline def setPostfix(value: NotationPrecedence): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashRightparenthesis): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Rightparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
