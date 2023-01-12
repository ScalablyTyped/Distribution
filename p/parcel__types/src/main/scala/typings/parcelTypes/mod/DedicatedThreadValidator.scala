package typings.parcelTypes.mod

import typings.parcelTypes.anon.Assets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedThreadValidator
  extends StObject
     with Validator {
  
  def validateAll(arg0: Assets): Async[js.Array[js.UndefOr[ValidateResult | Null]]]
}
object DedicatedThreadValidator {
  
  inline def apply(validateAll: Assets => Async[js.Array[js.UndefOr[ValidateResult | Null]]]): DedicatedThreadValidator = {
    val __obj = js.Dynamic.literal(validateAll = js.Any.fromFunction1(validateAll))
    __obj.asInstanceOf[DedicatedThreadValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DedicatedThreadValidator] (val x: Self) extends AnyVal {
    
    inline def setValidateAll(value: Assets => Async[js.Array[js.UndefOr[ValidateResult | Null]]]): Self = StObject.set(x, "validateAll", js.Any.fromFunction1(value))
  }
}
