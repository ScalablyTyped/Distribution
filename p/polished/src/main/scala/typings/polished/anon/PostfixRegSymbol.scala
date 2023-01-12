package typings.polished.anon

import typings.polished.polishedStrings.Exclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostfixRegSymbol extends StObject {
  
  var postfix: ArgCountFNotation
  
  var regSymbol: Exclamationmark
  
  var symbol: Exclamationmark
}
object PostfixRegSymbol {
  
  inline def apply(postfix: ArgCountFNotation): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "!", symbol = "!")
    __obj.asInstanceOf[PostfixRegSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostfixRegSymbol] (val x: Self) extends AnyVal {
    
    inline def setPostfix(value: ArgCountFNotation): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Exclamationmark): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Exclamationmark): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
