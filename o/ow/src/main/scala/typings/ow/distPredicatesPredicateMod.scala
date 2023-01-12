package typings.ow

import typings.ow.anon.Message
import typings.ow.distPredicatesBasePredicateMod.BasePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesPredicateMod {
  
  @JSImport("ow/dist/predicates/predicate", "Predicate")
  @js.native
  open class Predicate[T] protected ()
    extends StObject
       with BasePredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
    
    /**
      Register a new validator.
      @param validator - Validator to register.
      */
    def addValidator(validator: Validator[T]): this.type = js.native
    
    /* private */ val context: Any = js.native
    
    /**
      @hidden
      */
    var get: Any = js.native
    
    /**
      Test if the value matches a custom validation function. The validation function should return `true` if the value passes the function. If the function either returns `false` or a string, the function fails and the string will be used as error message.
      @param validator - Validation function.
      */
    def is(validator: js.Function1[/* value */ T, Boolean | String]): this.type = js.native
    
    /**
      Provide a new error message to be thrown when the validation fails.
      @param newMessage - Either a string containing the new message or a function returning the new message.
      @example
      ```
      ow('🌈', 'unicorn', ow.string.equals('🦄').message('Expected unicorn, got rainbow'));
      //=> ArgumentError: Expected unicorn, got rainbow
      ```
      @example
      ```
      ow('🌈', ow.string.minLength(5).message((value, label) => `Expected ${label}, to have a minimum length of 5, got \`${value}\``));
      //=> ArgumentError: Expected string, to be have a minimum length of 5, got `🌈`
      ```
      */
    def message(newMessage: String): this.type = js.native
    def message(newMessage: ValidatorMessageBuilder[T]): this.type = js.native
    
    /**
      Invert the following validators.
      */
    def not: this.type = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ val `type`: Any = js.native
    
    /**
      Test if the value matches a custom validation function. The validation function should return an object containing a `validator` and `message`. If the `validator` is `false`, the validation fails and the `message` will be used as error message. If the `message` is a function, the function is invoked with the `label` as argument to let you further customize the error message.
      @param customValidator - Custom validation function.
      */
    def validate(customValidator: CustomValidator[T]): this.type = js.native
  }
  
  @JSImport("ow/dist/predicates/predicate", "validatorSymbol")
  @js.native
  val validatorSymbol: js.Symbol = js.native
  
  trait Context[T]
    extends StObject
       with PredicateOptions {
    
    var validators: js.Array[Validator[T]]
  }
  object Context {
    
    inline def apply[T](validators: js.Array[Validator[T]]): Context[T] = {
      val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
      
      inline def setValidators(value: js.Array[Validator[T]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsVarargs(value: Validator[T]*): Self = StObject.set(x, "validators", js.Array(value*))
    }
  }
  
  type CustomValidator[T] = js.Function1[/* value */ T, Message]
  
  trait PredicateOptions extends StObject {
    
    var optional: js.UndefOr[Boolean] = js.undefined
  }
  object PredicateOptions {
    
    inline def apply(): PredicateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PredicateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredicateOptions] (val x: Self) extends AnyVal {
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
  
  @js.native
  trait Validator[T] extends StObject {
    
    def message(value: T): String = js.native
    def message(value: T, label: String): String = js.native
    def message(value: T, label: String, result: Any): String = js.native
    def message(value: T, label: Unit, result: Any): String = js.native
    
    /**
      Provide custom message used by `not` operator.
      When absent, the return value of `message()` is used and 'not' is inserted after the first 'to', e.g. `Expected 'smth' to be empty` -> `Expected 'smth' to not be empty`.
      */
    var negatedMessage: js.UndefOr[js.Function2[/* value */ T, /* label */ String, String]] = js.native
    
    def validator(value: T): Any = js.native
  }
  
  type ValidatorMessageBuilder[T] = js.Function2[/* value */ T, /* label */ js.UndefOr[String], String]
}
