package typings.ow

import typings.ow.anon.Message
import typings.ow.basePredicateMod.BasePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateMod {
  
  @JSImport("ow/dist/source/predicates/predicate", "Predicate")
  @js.native
  class Predicate[T] protected () extends BasePredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
    
    /**
      Register a new validator.
      @param validator - Validator to register.
      */
    /* protected */ def addValidator(validator: Validator[T]): this.type = js.native
    
    val context: js.Any = js.native
    
    /**
      @hidden
      */
    var get: js.Any = js.native
    
    /**
      Test if the value matches a custom validation function. The validation function should return `true` if the value passes the function. If the function either returns `false` or a string, the function fails and the string will be used as error message.
      @param validator - Validation function.
      */
    def is(validator: js.Function1[/* value */ T, Boolean | String]): this.type = js.native
    
    /**
      Invert the following validators.
      */
    def not: this.type = js.native
    
    val options: js.Any = js.native
    
    val `type`: js.Any = js.native
    
    /**
      Test if the value matches a custom validation function. The validation function should return an object containing a `validator` and `message`. If the `validator` is `false`, the validation fails and the `message` will be used as error message. If the `message` is a function, the function is invoked with the `label` as argument to let you further customize the error message.
      @param customValidator - Custom validation function.
      */
    def validate(customValidator: CustomValidator[T]): this.type = js.native
  }
  
  @JSImport("ow/dist/source/predicates/predicate", "validatorSymbol")
  @js.native
  val validatorSymbol: js.Symbol = js.native
  
  @js.native
  trait Context[T] extends PredicateOptions {
    
    var validators: js.Array[Validator[T]] = js.native
  }
  object Context {
    
    @scala.inline
    def apply[T](validators: js.Array[Validator[T]]): Context[T] = {
      val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[_], T] (val x: Self with Context[T]) extends AnyVal {
      
      @scala.inline
      def setValidators(value: js.Array[Validator[T]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsVarargs(value: Validator[T]*): Self = StObject.set(x, "validators", js.Array(value :_*))
    }
  }
  
  type CustomValidator[T] = js.Function1[/* value */ T, Message]
  
  @js.native
  trait PredicateOptions extends StObject {
    
    var optional: js.UndefOr[Boolean] = js.native
  }
  object PredicateOptions {
    
    @scala.inline
    def apply(): PredicateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PredicateOptions]
    }
    
    @scala.inline
    implicit class PredicateOptionsMutableBuilder[Self <: PredicateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
  
  @js.native
  trait Validator[T] extends StObject {
    
    def message(value: T): String = js.native
    def message(value: T, label: js.UndefOr[scala.Nothing], result: js.Any): String = js.native
    def message(value: T, label: String): String = js.native
    def message(value: T, label: String, result: js.Any): String = js.native
    
    /**
      Provide custom message used by `not` operator.
      When absent, the return value of `message()` is used and 'not' is inserted after the first 'to',
      e.g. `Expected 'smth' to be empty` -> `Expected 'smth' to not be empty`.
      */
    var negatedMessage: js.UndefOr[js.Function2[/* value */ T, /* label */ String, String]] = js.native
    
    def validator(value: T): js.Any = js.native
  }
}
