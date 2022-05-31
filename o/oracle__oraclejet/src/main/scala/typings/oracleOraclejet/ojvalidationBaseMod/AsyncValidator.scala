package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncValidator[V] extends StObject {
  
  var hint: js.Promise[String | Null]
  
  def validate(value: V): js.Promise[Boolean]
}
object AsyncValidator {
  
  inline def apply[V](hint: js.Promise[String | Null], validate: V => js.Promise[Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator[V]]
  }
  
  extension [Self <: AsyncValidator[?], V](x: Self & AsyncValidator[V]) {
    
    inline def setHint(value: js.Promise[String | Null]): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: V => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
