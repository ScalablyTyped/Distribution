package typings.polished.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postfix extends StObject {
  
  var postfix: NotationPrecedence
  
  var regSymbol: /* \) */ String
  
  var symbol: /* ) */ String
}
object Postfix {
  
  inline def apply(postfix: NotationPrecedence): Postfix = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "\\)", symbol = ")")
    __obj.asInstanceOf[Postfix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Postfix] (val x: Self) extends AnyVal {
    
    inline def setPostfix(value: NotationPrecedence): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: /* \) */ String): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: /* ) */ String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
