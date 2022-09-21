package typings.parcelTypes.mod

import typings.parcelTypes.anon.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiThreadValidator
  extends StObject
     with Validator {
  
  var getConfig: js.UndefOr[js.Function1[/* arg0 */ Logger, Async[ConfigResult | Unit]]] = js.undefined
  
  def validate(arg0: typings.parcelTypes.anon.Asset): Async[ValidateResult | Unit]
}
object MultiThreadValidator {
  
  inline def apply(validate: typings.parcelTypes.anon.Asset => Async[ValidateResult | Unit]): MultiThreadValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[MultiThreadValidator]
  }
  
  extension [Self <: MultiThreadValidator](x: Self) {
    
    inline def setGetConfig(value: /* arg0 */ Logger => Async[ConfigResult | Unit]): Self = StObject.set(x, "getConfig", js.Any.fromFunction1(value))
    
    inline def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
    
    inline def setValidate(value: typings.parcelTypes.anon.Asset => Async[ValidateResult | Unit]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
