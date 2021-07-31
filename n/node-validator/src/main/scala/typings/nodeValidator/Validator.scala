package typings.nodeValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validator {
  
  trait IsObjectValidator
    extends StObject
       with Validatable {
    
    def withCustom(customValidator: ValidateFn): IsObjectValidator
    
    def withOptional(name: String, validator: Validatable): IsObjectValidator
    
    def withRequired(name: String, validator: Validatable): IsObjectValidator
  }
  object IsObjectValidator {
    
    @scala.inline
    def apply(
      validate: (/* value */ js.Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]) => Unit,
      withCustom: ValidateFn => IsObjectValidator,
      withOptional: (String, Validatable) => IsObjectValidator,
      withRequired: (String, Validatable) => IsObjectValidator
    ): IsObjectValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate), withCustom = js.Any.fromFunction1(withCustom), withOptional = js.Any.fromFunction2(withOptional), withRequired = js.Any.fromFunction2(withRequired))
      __obj.asInstanceOf[IsObjectValidator]
    }
    
    @scala.inline
    implicit class IsObjectValidatorMutableBuilder[Self <: IsObjectValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithCustom(value: ValidateFn => IsObjectValidator): Self = StObject.set(x, "withCustom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWithOptional(value: (String, Validatable) => IsObjectValidator): Self = StObject.set(x, "withOptional", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWithRequired(value: (String, Validatable) => IsObjectValidator): Self = StObject.set(x, "withRequired", js.Any.fromFunction2(value))
    }
  }
  
  trait Validatable extends StObject {
    
    def validate(
      value: js.Any,
      onError: js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]
    ): Unit
    @JSName("validate")
    var validate_Original: ValidateFn
  }
  object Validatable {
    
    @scala.inline
    def apply(
      validate: (/* value */ js.Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]) => Unit
    ): Validatable = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[Validatable]
    }
    
    @scala.inline
    implicit class ValidatableMutableBuilder[Self <: Validatable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(
        value: (/* value */ js.Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  type ValidateFn = js.Function2[
    /* value */ js.Any, 
    /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit], 
    Unit
  ]
}
