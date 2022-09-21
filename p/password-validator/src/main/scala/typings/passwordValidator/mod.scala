package typings.passwordValidator

import typings.passwordValidator.anon.Details
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("password-validator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PasswordValidator
  
  @js.native
  trait PasswordValidator extends StObject {
    
    var details: Boolean = js.native
    
    /**
      * Rule to mandate the presence of digits in the password
      *
      * @param {number} [count] - minimum number of digits required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def digits(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def digits(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def digits(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def digits(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to invert the effects of 'not'
      * Apart from that, 'has' is also used
      * to make the api readable and chainable
      *
      * @param {string|RegExp} [pattern] - pattern to match
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def has(pattern: String, description: String, args: Any*): PasswordValidator = js.native
    def has(pattern: String, description: Unit, args: Any*): PasswordValidator = js.native
    def has(pattern: js.RegExp, description: String, args: Any*): PasswordValidator = js.native
    def has(pattern: js.RegExp, description: Unit, args: Any*): PasswordValidator = js.native
    def has(pattern: Unit, description: String, args: Any*): PasswordValidator = js.native
    def has(pattern: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to invert the effects of 'not'
      * Apart from that, 'is' is also used
      * to make the api readable and chainable
      *
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def is(args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to mandate the presence of letters in the password
      *
      * @param {number} [count] - minimum number of letters required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def letters(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def letters(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def letters(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def letters(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    var list: Boolean = js.native
    
    /**
      * Rule to mandate the presence of lowercase letters in the password
      *
      * @param {number} [count] - minimum number of lowercase letters required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def lowercase(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def lowercase(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def lowercase(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def lowercase(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to specify a maximum length of the password
      *
      * @param {number} num - maximum length
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def max(num: Double, description: String, args: Any*): PasswordValidator = js.native
    def max(num: Double, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to specify a minimum length of the password
      *
      * @param {number} num - minimum length
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def min(num: Double, description: String, args: Any*): PasswordValidator = js.native
    def min(num: Double, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to invert the next applied rules.
      * All the rules applied after 'not' will have opposite effect,
      * until 'has' rule is applied
      *
      * @param {string|RegExp} [pattern] - pattern to not match
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def not(pattern: String, description: String, args: Any*): PasswordValidator = js.native
    def not(pattern: String, description: Unit, args: Any*): PasswordValidator = js.native
    def not(pattern: js.RegExp, description: String, args: Any*): PasswordValidator = js.native
    def not(pattern: js.RegExp, description: Unit, args: Any*): PasswordValidator = js.native
    def not(pattern: Unit, description: String, args: Any*): PasswordValidator = js.native
    def not(pattern: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to whitelist words to be used as password
      *
      * @param {array} list - list of values allowed
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def oneOf(list: js.Array[Any], description: String, args: Any*): PasswordValidator = js.native
    def oneOf(list: js.Array[Any], description: Unit, args: Any*): PasswordValidator = js.native
    
    var password: String = js.native
    
    var positive: Boolean = js.native
    
    var properties: js.Array[Any] = js.native
    
    /**
      * Rule to mandate the presence of space in the password
      * It can be used along with 'not' to not allow spaces
      * in the password
      *
      * @param {number} [count] - minimum number of spaces required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def spaces(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def spaces(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def spaces(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def spaces(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to mandate the presence of symbols in the password
      *
      * @param {number} [count] - minimum number of symbols required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def symbols(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def symbols(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def symbols(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def symbols(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Rule to mandate the presence of uppercase letters in the password
      *
      * @param {number} [count] - minimum number of uppercase letters required
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def uppercase(count: Double, description: String, args: Any*): PasswordValidator = js.native
    def uppercase(count: Double, description: Unit, args: Any*): PasswordValidator = js.native
    def uppercase(count: Unit, description: String, args: Any*): PasswordValidator = js.native
    def uppercase(count: Unit, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Insert a plugin function into the validation chain
      *
      * @param {Plugin} fn  - A plugin function
      * @param {string} [description] - description of the validation
      * @returns {PasswordValidator} instance of PasswordValidator schema
      */
    def usingPlugin(fn: Plugin, description: String, args: Any*): PasswordValidator = js.native
    def usingPlugin(fn: Plugin, description: Unit, args: Any*): PasswordValidator = js.native
    
    /**
      * Method to validate the password against schema
      *
      * @param {string} pwd - password to validate
      * @param {object} [options] - optional options to configure validation
      * @param {boolean} [options.list] - asks for a list of validation
      *           failures instead of just true/false
      * @param {boolean} [options.details] - asks for more details about
      *           failed validations including arguments, and error messages
      * @returns {boolean|array} Boolean value indicting the validity
      *           of the password as per schema, if 'options.list' or
      *           'options.details' is not set. Otherwise, it returns an
      *           array of property names which failed validations
      */
    def validate(pwd: String): Boolean | js.Array[Any] = js.native
    def validate(pwd: String, options: Details): Boolean | js.Array[Any] = js.native
  }
  
  type Plugin = js.Function1[/* password */ Any, Any]
}
