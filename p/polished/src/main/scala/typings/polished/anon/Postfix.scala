package typings.polished.anon

import typings.polished.polishedStrings.Exclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postfix extends StObject {
  
  var postfix: ArgCount
  
  var regSymbol: Exclamationmark
  
  var symbol: Exclamationmark
}
object Postfix {
  
  inline def apply(postfix: ArgCount): Postfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "!", symbol = "!")
    __obj.asInstanceOf[Postfix]
  }
  
  extension [Self <: Postfix](x: Self) {
    
    inline def setPostfix(value: ArgCount): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Exclamationmark): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Exclamationmark): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
