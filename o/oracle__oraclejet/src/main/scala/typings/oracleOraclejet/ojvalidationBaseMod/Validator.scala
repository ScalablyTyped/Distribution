package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator[V] extends StObject {
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  
  def validate(value: V): Unit = js.native
}
object Validator {
  
  @scala.inline
  def apply[V](validate: V => Unit): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator[V]]
  }
  
  @scala.inline
  implicit class ValidatorMutableBuilder[Self <: Validator[_], V] (val x: Self with Validator[V]) extends AnyVal {
    
    @scala.inline
    def setGetHint(value: () => String | Null): Self = StObject.set(x, "getHint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHintUndefined: Self = StObject.set(x, "getHint", js.undefined)
    
    @scala.inline
    def setValidate(value: V => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
