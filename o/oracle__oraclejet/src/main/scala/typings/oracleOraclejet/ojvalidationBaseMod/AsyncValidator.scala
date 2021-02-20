package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidator[V] extends StObject {
  
  var hint: js.Promise[String | Null] = js.native
  
  def validate(value: V): js.Promise[Boolean] = js.native
}
object AsyncValidator {
  
  @scala.inline
  def apply[V](hint: js.Promise[String | Null], validate: V => js.Promise[Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator[V]]
  }
  
  @scala.inline
  implicit class AsyncValidatorMutableBuilder[Self <: AsyncValidator[_], V] (val x: Self with AsyncValidator[V]) extends AnyVal {
    
    @scala.inline
    def setHint(value: js.Promise[String | Null]): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: V => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
