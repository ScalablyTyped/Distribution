package typings.parcelTypes.mod

import typings.parcelTypes.anon.Assets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.DedicatedThreadValidator
  - typings.parcelTypes.mod.MultiThreadValidator
*/
trait Validator extends StObject
object Validator {
  
  inline def DedicatedThreadValidator(validateAll: Assets => Async[js.Array[js.UndefOr[ValidateResult | Null]]]): typings.parcelTypes.mod.DedicatedThreadValidator = {
    val __obj = js.Dynamic.literal(validateAll = js.Any.fromFunction1(validateAll))
    __obj.asInstanceOf[typings.parcelTypes.mod.DedicatedThreadValidator]
  }
  
  inline def MultiThreadValidator(validate: typings.parcelTypes.anon.Asset => Async[ValidateResult | Unit]): typings.parcelTypes.mod.MultiThreadValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[typings.parcelTypes.mod.MultiThreadValidator]
  }
}
