package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesStringMod {
  
  @JSImport("ow/dist/predicates/string", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  open class StringPredicate () extends Predicate[String] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a string to be alphabetical.
      */
    def alphabetical: this.type = js.native
    
    /**
      Test a string to be alphanumeric.
      */
    def alphanumeric: this.type = js.native
    
    /**
      Test a string to be a valid date.
      */
    def date: this.type = js.native
    
    /**
      Test a string to be empty.
      */
    def empty: this.type = js.native
    
    /**
      Test a string to end with a specific value.
      @param searchString - The value that should be the end of the string.
      */
    def endsWith(searchString: String): this.type = js.native
    
    /**
      Test a string to be equal to a specified string.
      @param expected - Expected value to match.
      */
    def equals(expected: String): this.type = js.native
    
    /**
      Test a string to include a specific value.
      @param searchString - The value that should be included in the string.
      */
    def includes(searchString: String): this.type = js.native
    
    /**
      Test a string to have a specific length.
      @param length - The length of the string.
      */
    def length(length: Double): this.type = js.native
    
    /**
      Test a non-empty string to be lowercase. Matching both alphabetical & numbers.
      */
    def lowercase: this.type = js.native
    
    /**
      Test a string against a regular expression.
      @param regex - The regular expression to match the value with.
      */
    def matches(regex: js.RegExp): this.type = js.native
    
    /**
      Test a string to have a maximum length.
      @param length - The maximum length of the string.
      */
    def maxLength(length: Double): this.type = js.native
    
    /**
      Test a string to have a minimum length.
      @param length - The minimum length of the string.
      */
    def minLength(length: Double): this.type = js.native
    
    /**
      Test a string to contain at least 1 non-whitespace character.
      */
    def nonBlank: this.type = js.native
    
    /**
      Test a string to be not empty.
      */
    def nonEmpty: this.type = js.native
    
    /**
      Test a string to be numeric.
      */
    def numeric: this.type = js.native
    
    /**
      Test if the string is an element of the provided list.
      @param list - List of possible values.
      */
    def oneOf(list: js.Array[String]): this.type = js.native
    
    /**
      Test a string to start with a specific value.
      @param searchString - The value that should be the start of the string.
      */
    def startsWith(searchString: String): this.type = js.native
    
    /**
      Test a non-empty string to be uppercase. Matching both alphabetical & numbers.
      */
    def uppercase: this.type = js.native
    
    /**
      Test a string to be a valid URL.
      */
    def url: this.type = js.native
  }
}
