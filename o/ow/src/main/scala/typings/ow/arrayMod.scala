package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("ow/dist/predicates/array", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  open class ArrayPredicate[T] ()
    extends Predicate[js.Array[T]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test an array to be deeply equal to the provided array.
      @param expected - Expected value to match.
      */
    def deepEqual(expected: js.Array[T]): this.type = js.native
    
    /**
      Test an array to be empty.
      */
    def empty: this.type = js.native
    
    /**
      Test an array to end with a specific value. The value is tested by identity, not structure.
      @param searchElement - The value that should be the end of the array.
      */
    def endsWith(searchElement: T): this.type = js.native
    
    /**
      Test if the elements in the array exactly matches the elements placed at the same indices in the predicates array.
      @param predicates - Predicates to test the array against. Describes what the tested array should look like.
      @example
      ```
      ow(['1', 2], ow.array.exactShape([ow.string, ow.number]));
      ```
      */
    def exactShape(predicates: js.Array[Predicate[Any]]): this.type = js.native
    
    /**
      Test an array to include all the provided elements. The values are tested by identity, not structure.
      @param searchElements - The values that should be included in the array.
      */
    def includes(searchElements: T*): this.type = js.native
    
    /**
      Test an array to include any of the provided elements. The values are tested by identity, not structure.
      @param searchElements - The values that should be included in the array.
      */
    def includesAny(searchElements: T*): this.type = js.native
    
    /**
      Test an array to have a specific length.
      @param length - The length of the array.
      */
    def length(length: Double): this.type = js.native
    
    /**
      Test an array to have a maximum length.
      @param length - The maximum length of the array.
      */
    def maxLength(length: Double): this.type = js.native
    
    /**
      Test an array to have a minimum length.
      @param length - The minimum length of the array.
      */
    def minLength(length: Double): this.type = js.native
    
    /**
      Test an array to be not empty.
      */
    def nonEmpty: this.type = js.native
    
    /**
      Test all elements in the array to match to provided predicate.
      @param predicate - The predicate that should be applied against every individual item.
      @example
      ```
      ow(['a', 1], ow.array.ofType(ow.any(ow.string, ow.number)));
      ```
      */
    def ofType[U /* <: T */](predicate: BasePredicate[U]): ArrayPredicate[U] = js.native
    
    /**
      Test an array to start with a specific value. The value is tested by identity, not structure.
      @param searchElement - The value that should be the start of the array.
      */
    def startsWith(searchElement: T): this.type = js.native
  }
}
