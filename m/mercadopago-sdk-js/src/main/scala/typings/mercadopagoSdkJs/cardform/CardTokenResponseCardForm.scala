package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardTokenResponseCardForm extends StObject {
  
  var token: String
}
object CardTokenResponseCardForm {
  
  inline def apply(token: String): CardTokenResponseCardForm = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTokenResponseCardForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardTokenResponseCardForm] (val x: Self) extends AnyVal {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
