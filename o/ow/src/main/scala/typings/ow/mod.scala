package typings.ow

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

/* from `exports` in `package.json` */
object mod {
  
  @JSImport("ow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: T): T & Predicates = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & Predicates]
  inline def default[T](`object`: T, options: PredicateOptions): T & Predicates = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Predicates]
  
  @JSImport("ow", "AnyPredicate")
  @js.native
  open class AnyPredicate[T] protected ()
    extends typings.ow.distMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[Any]]) = this()
    def this(predicates: js.Array[BasePredicate[Any]], options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends typings.ow.distMod.ArgumentError {
    def this(message: String, context: js.Function) = this()
    def this(message: String, context: js.Function, errors: Map[String, Set[String]]) = this()
  }
  
  @JSImport("ow", "ArrayBufferPredicate")
  @js.native
  open class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected ()
    extends typings.ow.distMod.ArrayBufferPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  open class ArrayPredicate[T] ()
    extends typings.ow.distMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "BigIntPredicate")
  @js.native
  /**
    @hidden
    */
  open class BigIntPredicate ()
    extends typings.ow.distMod.BigIntPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  open class BooleanPredicate ()
    extends typings.ow.distMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  open class DataViewPredicate ()
    extends typings.ow.distMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  open class DatePredicate ()
    extends typings.ow.distMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  open class ErrorPredicate ()
    extends typings.ow.distMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  open class MapPredicate[T1, T2] ()
    extends typings.ow.distMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  open class NumberPredicate ()
    extends typings.ow.distMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ObjectPredicate")
  @js.native
  /**
    @hidden
    */
  open class ObjectPredicate[T /* <: js.Object */] ()
    extends typings.ow.distMod.ObjectPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "Predicate")
  @js.native
  open class Predicate[T] protected ()
    extends typings.ow.distMod.Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "SetPredicate")
  @js.native
  /**
    @hidden
    */
  open class SetPredicate[T] ()
    extends typings.ow.distMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  open class StringPredicate ()
    extends typings.ow.distMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "TypedArrayPredicate")
  @js.native
  open class TypedArrayPredicate[T /* <: TypedArray */] protected ()
    extends typings.ow.distMod.TypedArrayPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.distMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.distMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
}
