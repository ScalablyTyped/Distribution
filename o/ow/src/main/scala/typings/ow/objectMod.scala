package typings.ow

import typings.ow.matchShapeMod.Shape
import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow/dist/source/predicates/object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  @js.native
  /**
    @hidden
    */
  class ObjectPredicate ()
    extends Predicate[js.Object] {
    def this(options: PredicateOptions) = this()
    /**
      Test an object to be deeply equal to the provided object.
      @param expected - Expected object to match.
      */
    def deepEqual(expected: js.Object): this.type = js.native
    /**
      Test all the values in the object deeply to match the provided predicate.
      @param predicate - The predicate that should be applied against every value in the object.
      */
    def deepValuesOfType[T](predicate: Predicate[T]): this.type = js.native
    /**
      Test an object to be empty.
      */
    def empty: this.type = js.native
    /**
      Test an object to match the `shape` exactly. This means that will fail if it comes across unexpected properties. The shape comparison is deep.
      The shape is an object which describes how the tested object should look like. The keys are the same as the source object and the values are predicates.
      @param shape - Shape to test the object against.
      @example
      ```
      import ow from 'ow';
      ow({unicorn: '🦄'}, ow.object.exactShape({
      unicorn: ow.string
      }));
      ```
      */
    def exactShape(shape: Shape): this.type = js.native
    /**
      Test an object to include any of the provided keys. You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties.
      @param keys - The keys that could be a key in the object.
      */
    def hasAnyKeys(keys: String*): this.type = js.native
    /**
      Test an object to include all the provided keys. You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties.
      @param keys - The keys that should be present in the object.
      */
    def hasKeys(keys: String*): this.type = js.native
    /**
      Test an object to be of a specific instance type.
      @param instance - The expected instance type of the object.
      */
    def instanceOf(instance: js.Function): this.type = js.native
    /**
      Test an object to be not empty.
      */
    def nonEmpty: this.type = js.native
    /**
      Test an object to match the `shape` partially. This means that it ignores unexpected properties. The shape comparison is deep.
      The shape is an object which describes how the tested object should look like. The keys are the same as the source object and the values are predicates.
      @param shape - Shape to test the object against.
      @example
      ```
      import ow from 'ow';
      const object = {
      unicorn: '🦄',
      rainbow: '🌈'
      };
      ow(object, ow.object.partialShape({
      unicorn: ow.string
      }));
      ```
      */
    def partialShape(shape: Shape): this.type = js.native
    /**
      Test if an Object is a plain object.
      */
    def plain: this.type = js.native
    /**
      Test all the values in the object to match the provided predicate.
      @param predicate - The predicate that should be applied against every value in the object.
      */
    def valuesOfType[T](predicate: Predicate[T]): this.type = js.native
  }
  
}

