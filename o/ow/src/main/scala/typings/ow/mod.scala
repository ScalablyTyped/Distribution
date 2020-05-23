package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import typings.ow.modifiersMod.Modifiers
import typings.ow.predicateMod.PredicateOptions
import typings.ow.predicatesMod.Predicates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AnyPredicate[T] protected ()
    extends typings.ow.anyMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[_]]) = this()
    def this(predicates: js.Array[BasePredicate[_]], options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ArrayPredicate[T] ()
    extends typings.ow.arrayMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate ()
    extends typings.ow.booleanMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class DatePredicate ()
    extends typings.ow.dateMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ErrorPredicate ()
    extends typings.ow.errorMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class MapPredicate[T1, T2] ()
    extends typings.ow.mapMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class NumberPredicate ()
    extends typings.ow.numberMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ObjectPredicate ()
    extends typings.ow.objectMod.ObjectPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  trait Ow
    extends Modifiers
       with Predicates {
    /**
      Test if `value` matches the provided `predicate`. Throws an `ArgumentError` with the specified `label` if the test fails.
      @param value - Value to test.
      @param label - Label which should be used in error messages.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: T, label: String, predicate: BasePredicate[T]): Unit = js.native
    /**
      Test if the value matches the predicate. Throws an `ArgumentError` if the test fails.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: T, predicate: BasePredicate[T]): Unit = js.native
    /**
      Create a reusable validator.
      @param label - Label which should be used in error messages.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](label: String, predicate: BasePredicate[T]): js.Function1[/* value */ T, Unit] = js.native
    /**
      Create a reusable validator.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](predicate: BasePredicate[T]): js.Function1[/* value */ T, Unit] = js.native
    /**
      Returns `true` if the value matches the predicate, otherwise returns `false`.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def isValid[T](value: T, predicate: BasePredicate[T]): /* is T */ Boolean = js.native
  }
  
  @js.native
  class Predicate[T] protected ()
    extends typings.ow.predicateMod.Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class SetPredicate[T] ()
    extends typings.ow.setMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class StringPredicate ()
    extends typings.ow.stringMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.weakMapMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.weakSetMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  val default: Ow = js.native
  type Main = js.Function3[
    /* value */ js.Any, 
    /* label */ String | js.Function, 
    /* predicate */ BasePredicate[js.Any], 
    Unit
  ]
}

