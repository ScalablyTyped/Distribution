package typings.ow

import typings.ow.distPredicatesBasePredicateMod.BasePredicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import typings.std.ArrayBufferLike
import typings.std.Map
import typings.std.Set
import typings.typeFest.sourceTypedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object devOnlyMod {
  
  @JSImport("ow/dev-only", "AnyPredicate")
  @js.native
  open class AnyPredicate[T] protected ()
    extends typings.ow.distMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[Any]]) = this()
    def this(predicates: js.Array[BasePredicate[Any]], options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends typings.ow.distMod.ArgumentError {
    def this(message: String, context: js.Function) = this()
    def this(message: String, context: js.Function, errors: Map[String, Set[String]]) = this()
  }
  
  @JSImport("ow/dev-only", "ArrayBufferPredicate")
  @js.native
  open class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected ()
    extends typings.ow.distMod.ArrayBufferPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  open class ArrayPredicate[T] ()
    extends typings.ow.distMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "BigIntPredicate")
  @js.native
  /**
    @hidden
    */
  open class BigIntPredicate ()
    extends typings.ow.distMod.BigIntPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  open class BooleanPredicate ()
    extends typings.ow.distMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  open class DataViewPredicate ()
    extends typings.ow.distMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  open class DatePredicate ()
    extends typings.ow.distMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  open class ErrorPredicate ()
    extends typings.ow.distMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  open class MapPredicate[T1, T2] ()
    extends typings.ow.distMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  open class NumberPredicate ()
    extends typings.ow.distMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "ObjectPredicate")
  @js.native
  /**
    @hidden
    */
  open class ObjectPredicate[T /* <: js.Object */] ()
    extends typings.ow.distMod.ObjectPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "Predicate")
  @js.native
  open class Predicate[T] protected ()
    extends typings.ow.distMod.Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "SetPredicate")
  @js.native
  /**
    @hidden
    */
  open class SetPredicate[T] ()
    extends typings.ow.distMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  open class StringPredicate ()
    extends typings.ow.distMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "TypedArrayPredicate")
  @js.native
  open class TypedArrayPredicate[T /* <: TypedArray */] protected ()
    extends typings.ow.distMod.TypedArrayPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.distMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dev-only", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.distMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
}
