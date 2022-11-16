package typings.ow

import typings.ow.distModifiersMod.Modifiers
import typings.ow.distPredicatesBasePredicateMod.BasePredicate
import typings.ow.distPredicatesMod.Predicates
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import typings.std.ArrayBufferLike
import typings.std.Map
import typings.std.Set
import typings.typeFest.sourceTypedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("ow/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: T): T & Predicates = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & Predicates]
  inline def default[T](`object`: T, options: PredicateOptions): T & Predicates = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Predicates]
  
  @JSImport("ow/dist", "AnyPredicate")
  @js.native
  open class AnyPredicate[T] protected ()
    extends typings.ow.distPredicatesMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[Any]]) = this()
    def this(predicates: js.Array[BasePredicate[Any]], options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends typings.ow.distArgumentErrorMod.ArgumentError {
    def this(message: String, context: js.Function) = this()
    def this(message: String, context: js.Function, errors: Map[String, Set[String]]) = this()
  }
  
  @JSImport("ow/dist", "ArrayBufferPredicate")
  @js.native
  open class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected ()
    extends typings.ow.distPredicatesMod.ArrayBufferPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  open class ArrayPredicate[T] ()
    extends typings.ow.distPredicatesMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "BigIntPredicate")
  @js.native
  /**
    @hidden
    */
  open class BigIntPredicate ()
    extends typings.ow.distPredicatesMod.BigIntPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  open class BooleanPredicate ()
    extends typings.ow.distPredicatesMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  open class DataViewPredicate ()
    extends typings.ow.distPredicatesMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  open class DatePredicate ()
    extends typings.ow.distPredicatesMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  open class ErrorPredicate ()
    extends typings.ow.distPredicatesMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  open class MapPredicate[T1, T2] ()
    extends typings.ow.distPredicatesMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  open class NumberPredicate ()
    extends typings.ow.distPredicatesMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "ObjectPredicate")
  @js.native
  /**
    @hidden
    */
  open class ObjectPredicate[T /* <: js.Object */] ()
    extends typings.ow.distPredicatesMod.ObjectPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "Predicate")
  @js.native
  open class Predicate[T] protected ()
    extends typings.ow.distPredicatesPredicateMod.Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "SetPredicate")
  @js.native
  /**
    @hidden
    */
  open class SetPredicate[T] ()
    extends typings.ow.distPredicatesMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  open class StringPredicate ()
    extends typings.ow.distPredicatesMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "TypedArrayPredicate")
  @js.native
  open class TypedArrayPredicate[T /* <: TypedArray */] protected ()
    extends typings.ow.distPredicatesMod.TypedArrayPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.distPredicatesMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.distPredicatesMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends ow.ow/dist.ReusableValidator<infer R> ? (value : unknown, label : string | undefined): asserts valueis TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(R))),IArray()) : T extends ow.ow/dist/predicates/base-predicate.BasePredicate<infer R> ? (value : unknown, label : string | undefined): asserts valueis TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(R))),IArray()) : never
    }}}
    */
  @js.native
  trait AssertingValidator[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    P extends ow.ow/dist/predicates/base-predicate.BasePredicate<infer T> ? T : never
    }}}
    */
  @js.native
  trait Infer[P] extends StObject
  
  type Main = js.Function4[
    /* value */ Any, 
    /* label */ String | js.Function, 
    /* predicate */ BasePredicate[Any], 
    /* idLabel */ js.UndefOr[Boolean], 
    Unit
  ]
  
  @js.native
  trait Ow
    extends StObject
       with Modifiers
       with Predicates {
    
    /**
      Test if `value` matches the provided `predicate`. Throws an `ArgumentError` with the specified `label` if the test fails.
      @param value - Value to test.
      @param label - Label which should be used in error messages.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: Any, label: String, predicate: BasePredicate[T]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    /**
      Test if the value matches the predicate. Throws an `ArgumentError` if the test fails.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: Any, predicate: BasePredicate[T]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    
    /**
      Create a reusable validator.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](label: String, predicate: BasePredicate[T]): ReusableValidator[T] = js.native
    /**
      Create a reusable validator.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](predicate: BasePredicate[T]): ReusableValidator[T] = js.native
    /**
      Create a reusable validator.
      @param predicate - Predicate used in the validator function.
      */
    @JSName("create")
    var create_Original: (js.Function1[/* predicate */ BasePredicate[Any], ReusableValidator[Any]]) & (js.Function2[/* label */ String, /* predicate */ BasePredicate[Any], ReusableValidator[Any]]) = js.native
    
    /**
      Returns `true` if the value matches the predicate, otherwise returns `false`.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def isValid[T](value: Any, predicate: BasePredicate[T]): /* is T */ Boolean = js.native
  }
  
  type ReusableValidator[T] = js.Function2[/* value */ Any | T, /* label */ js.UndefOr[String], Unit]
}
