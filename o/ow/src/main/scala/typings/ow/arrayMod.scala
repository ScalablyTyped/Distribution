package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow/dist/source/predicates/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  @js.native
  /**
    @hidden
    */
  class ArrayPredicate[T] ()
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
      */
    def ofType(predicate: Predicate[T]): this.type = js.native
    /**
      Test an array to start with a specific value. The value is tested by identity, not structure.
      @param searchElement - The value that should be the start of the array.
      */
    def startsWith(searchElement: T): this.type = js.native
  }
  
}

