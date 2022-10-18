package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesErrorMod {
  
  @JSImport("ow/dist/predicates/error", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  open class ErrorPredicate ()
    extends Predicate[js.Error] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test an Error to be an EvalError.
      */
    def evalError: this.type = js.native
    
    /**
      Test the error object to have specific keys.
      @param keys - One or more keys which should be part of the error object.
      */
    def hasKeys(keys: String*): this.type = js.native
    
    /**
      Test an error to be of a specific instance type.
      @param instance - The expected instance type of the error.
      */
    def instanceOf(instance: js.Function): this.type = js.native
    
    /**
      Test the error message to include a specific message.
      @param message - Message that should be included in the error.
      */
    def messageIncludes(message: String): this.type = js.native
    
    /**
      Test an error to have a specific name.
      @param expected - Expected name of the Error.
      */
    def name(expected: String): this.type = js.native
    
    /**
      Test an Error to be a RangeError.
      */
    def rangeError: this.type = js.native
    
    /**
      Test an Error to be a ReferenceError.
      */
    def referenceError: this.type = js.native
    
    /**
      Test an Error to be a SyntaxError.
      */
    def syntaxError: this.type = js.native
    
    /**
      Test an Error to be a TypeError.
      */
    def typeError: this.type = js.native
    
    /**
      Test an Error to be a URIError.
      */
    def uriError: this.type = js.native
  }
}
