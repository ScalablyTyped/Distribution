package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator[V] extends StObject {
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  
  def validate(value: V): Unit
}
object Validator {
  
  inline def apply[V](validate: V => Unit): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator[?], V] (val x: Self & Validator[V]) extends AnyVal {
    
    inline def setGetHint(value: () => String | Null): Self = StObject.set(x, "getHint", js.Any.fromFunction0(value))
    
    inline def setGetHintUndefined: Self = StObject.set(x, "getHint", js.undefined)
    
    inline def setValidate(value: V => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
