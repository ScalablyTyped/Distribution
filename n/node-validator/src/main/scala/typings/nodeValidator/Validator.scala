package typings.nodeValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Validator")
@js.native
object Validator extends js.Object {
  
  @js.native
  trait IsObjectValidator extends Validatable {
    
    def withCustom(customValidator: ValidateFn): IsObjectValidator = js.native
    
    def withOptional(name: String, validator: Validatable): IsObjectValidator = js.native
    
    def withRequired(name: String, validator: Validatable): IsObjectValidator = js.native
  }
  
  @js.native
  trait Validatable extends js.Object {
    
    def validate(
      value: js.Any,
      onError: js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]
    ): Unit = js.native
    @JSName("validate")
    var validate_Original: ValidateFn = js.native
  }
  
  type ValidateFn = js.Function2[
    /* value */ js.Any, 
    /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit], 
    Unit
  ]
}
