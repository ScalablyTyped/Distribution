package typings.ow

import typings.node.bufferMod.global.Buffer
import typings.ow.basePredicateMod.BasePredicate
import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.ArrayBufferLike
import typings.std.SharedArrayBuffer
import typings.typeFest.typedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesMod {
  
  @JSImport("ow/dist/predicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: T): T & Predicates = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & Predicates]
  inline def default[T](`object`: T, options: PredicateOptions): T & Predicates = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Predicates]
  
  @JSImport("ow/dist/predicates", "AnyPredicate")
  @js.native
  open class AnyPredicate[T] protected ()
    extends typings.ow.anyMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[Any]]) = this()
    def this(predicates: js.Array[BasePredicate[Any]], options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "ArrayBufferPredicate")
  @js.native
  open class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected ()
    extends typings.ow.arrayBufferMod.ArrayBufferPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  open class ArrayPredicate[T] ()
    extends typings.ow.arrayMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "BigIntPredicate")
  @js.native
  /**
    @hidden
    */
  open class BigIntPredicate ()
    extends typings.ow.bigintMod.BigIntPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  open class BooleanPredicate ()
    extends typings.ow.booleanMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  open class DataViewPredicate ()
    extends typings.ow.dataViewMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  open class DatePredicate ()
    extends typings.ow.dateMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  open class ErrorPredicate ()
    extends typings.ow.errorMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  open class MapPredicate[T1, T2] ()
    extends typings.ow.mapMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  open class NumberPredicate ()
    extends typings.ow.numberMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "ObjectPredicate")
  @js.native
  /**
    @hidden
    */
  open class ObjectPredicate[T /* <: js.Object */] ()
    extends typings.ow.objectMod.ObjectPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "SetPredicate")
  @js.native
  /**
    @hidden
    */
  open class SetPredicate[T] ()
    extends typings.ow.setMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  open class StringPredicate ()
    extends typings.ow.stringMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "TypedArrayPredicate")
  @js.native
  open class TypedArrayPredicate[T /* <: TypedArray */] protected ()
    extends typings.ow.typedArrayMod.TypedArrayPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.weakMapMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow/dist/predicates", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.weakSetMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  trait Predicates extends StObject {
    
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any(predicate: BasePredicate[Any]*): typings.ow.anyMod.AnyPredicate[Any]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1](p1: BasePredicate[T1]): typings.ow.anyMod.AnyPredicate[T1]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2](p1: BasePredicate[T1], p2: BasePredicate[T2]): typings.ow.anyMod.AnyPredicate[T1 | T2]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3]): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3], p4: BasePredicate[T4]): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5, T6](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5, T6, T7](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5, T6, T7, T8](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9],
      p10: BasePredicate[T10]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]
    /**
      Test that the value matches at least one of the given predicates.
      */
    @JSName("any")
    var any_Original: (js.Function1[/* p1 */ BasePredicate[Any], typings.ow.anyMod.AnyPredicate[Any]]) & (js.Function2[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function3[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function4[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function5[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function6[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        /* p6 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function7[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        /* p6 */ BasePredicate[Any], 
        /* p7 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function8[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        /* p6 */ BasePredicate[Any], 
        /* p7 */ BasePredicate[Any], 
        /* p8 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function9[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        /* p6 */ BasePredicate[Any], 
        /* p7 */ BasePredicate[Any], 
        /* p8 */ BasePredicate[Any], 
        /* p9 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ]) & (js.Function10[
        /* p1 */ BasePredicate[Any], 
        /* p2 */ BasePredicate[Any], 
        /* p3 */ BasePredicate[Any], 
        /* p4 */ BasePredicate[Any], 
        /* p5 */ BasePredicate[Any], 
        /* p6 */ BasePredicate[Any], 
        /* p7 */ BasePredicate[Any], 
        /* p8 */ BasePredicate[Any], 
        /* p9 */ BasePredicate[Any], 
        /* p10 */ BasePredicate[Any], 
        typings.ow.anyMod.AnyPredicate[Any]
      ])
    
    /**
      Test the value to be an array.
      */
    val array: typings.ow.arrayMod.ArrayPredicate[Any]
    
    /**
      Test the value to be a ArrayBuffer.
      */
    val arrayBuffer: typings.ow.arrayBufferMod.ArrayBufferPredicate[js.typedarray.ArrayBuffer]
    
    /**
      Test the value to be an bigint.
      */
    val bigint: typings.ow.bigintMod.BigIntPredicate
    
    /**
      Test the value to be a boolean.
      */
    val boolean: typings.ow.booleanMod.BooleanPredicate
    
    /**
      Test the value to be a Buffer.
      */
    val buffer: Predicate[Buffer]
    
    /**
      Test the value to be a DataView.
      */
    val dataView: typings.ow.dataViewMod.DataViewPredicate
    
    /**
      Test the value to be a Date.
      */
    val date: typings.ow.dateMod.DatePredicate
    
    /**
      Test the value to be an Error.
      */
    val error: typings.ow.errorMod.ErrorPredicate
    
    /**
      Test the value to be a Float32Array.
      */
    val float32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float32Array]
    
    /**
      Test the value to be a Float64Array.
      */
    val float64Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float64Array]
    
    /**
      Test the value to be a Function.
      */
    val function: Predicate[js.Function]
    
    /**
      Test the value to be a Int16Array.
      */
    val int16Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int16Array]
    
    /**
      Test the value to be a Int32Array.
      */
    val int32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int32Array]
    
    /**
      Test the value to be a Int8Array.
      */
    val int8Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int8Array]
    
    /**
      Test the value to be Iterable.
      */
    val iterable: Predicate[js.Iterable[Any]]
    
    /**
      Test the value to be a Map.
      */
    val map: typings.ow.mapMod.MapPredicate[Any, Any]
    
    /**
      Test the value to be not a number.
      */
    val nan: Predicate[Double]
    
    /**
      Test the value to be null.
      */
    val `null`: Predicate[Null]
    
    /**
      Test the value to be null or undefined.
      */
    val nullOrUndefined: Predicate[js.UndefOr[Null]]
    
    /**
      Test the value to be a number.
      */
    val number: typings.ow.numberMod.NumberPredicate
    
    /**
      Test the value to be an object.
      */
    val `object`: typings.ow.objectMod.ObjectPredicate[js.Object]
    
    /**
      Test the value to be a Promise.
      */
    val promise: Predicate[js.Promise[Any]]
    
    /**
      Test the value to be a RegExp.
      */
    val regExp: Predicate[js.RegExp]
    
    /**
      Test the value to be a Set.
      */
    val set: typings.ow.setMod.SetPredicate[Any]
    
    /**
      Test the value to be a SharedArrayBuffer.
      */
    val sharedArrayBuffer: typings.ow.arrayBufferMod.ArrayBufferPredicate[SharedArrayBuffer]
    
    /**
      Test the value to be a string.
      */
    val string: typings.ow.stringMod.StringPredicate
    
    /**
      Test the value to be a Symbol.
      */
    val symbol: Predicate[js.Symbol]
    
    /**
      Test the value to be a typed array.
      */
    val typedArray: typings.ow.typedArrayMod.TypedArrayPredicate[TypedArray]
    
    /**
      Test the value to be a Uint16Array.
      */
    val uint16Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint16Array]
    
    /**
      Test the value to be a Uint32Array.
      */
    val uint32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint32Array]
    
    /**
      Test the value to be a Uint8Array.
      */
    val uint8Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8Array]
    
    /**
      Test the value to be a Uint8ClampedArray.
      */
    val uint8ClampedArray: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8ClampedArray]
    
    /**
      Test the value to be undefined.
      */
    val undefined: Predicate[Unit]
    
    /**
      Test the value to be a WeakMap.
      */
    val weakMap: typings.ow.weakMapMod.WeakMapPredicate[js.Object]
    
    /**
      Test the value to be a WeakSet.
      */
    val weakSet: typings.ow.weakSetMod.WeakSetPredicate[js.Object]
  }
  object Predicates {
    
    inline def apply(
      any: (js.Function1[/* p1 */ BasePredicate[Any], typings.ow.anyMod.AnyPredicate[Any]]) & (js.Function2[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function3[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function4[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function5[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function6[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function7[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function8[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function9[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          /* p9 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]) & (js.Function10[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          /* p9 */ BasePredicate[Any], 
          /* p10 */ BasePredicate[Any], 
          typings.ow.anyMod.AnyPredicate[Any]
        ]),
      array: typings.ow.arrayMod.ArrayPredicate[Any],
      arrayBuffer: typings.ow.arrayBufferMod.ArrayBufferPredicate[js.typedarray.ArrayBuffer],
      bigint: typings.ow.bigintMod.BigIntPredicate,
      boolean: typings.ow.booleanMod.BooleanPredicate,
      buffer: Predicate[Buffer],
      dataView: typings.ow.dataViewMod.DataViewPredicate,
      date: typings.ow.dateMod.DatePredicate,
      error: typings.ow.errorMod.ErrorPredicate,
      float32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float32Array],
      float64Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float64Array],
      function: Predicate[js.Function],
      int16Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int16Array],
      int32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int32Array],
      int8Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int8Array],
      iterable: Predicate[js.Iterable[Any]],
      map: typings.ow.mapMod.MapPredicate[Any, Any],
      nan: Predicate[Double],
      `null`: Predicate[Null],
      nullOrUndefined: Predicate[js.UndefOr[Null]],
      number: typings.ow.numberMod.NumberPredicate,
      `object`: typings.ow.objectMod.ObjectPredicate[js.Object],
      promise: Predicate[js.Promise[Any]],
      regExp: Predicate[js.RegExp],
      set: typings.ow.setMod.SetPredicate[Any],
      sharedArrayBuffer: typings.ow.arrayBufferMod.ArrayBufferPredicate[SharedArrayBuffer],
      string: typings.ow.stringMod.StringPredicate,
      symbol: Predicate[js.Symbol],
      typedArray: typings.ow.typedArrayMod.TypedArrayPredicate[TypedArray],
      uint16Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint16Array],
      uint32Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint32Array],
      uint8Array: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8Array],
      uint8ClampedArray: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8ClampedArray],
      undefined: Predicate[Unit],
      weakMap: typings.ow.weakMapMod.WeakMapPredicate[js.Object],
      weakSet: typings.ow.weakSetMod.WeakSetPredicate[js.Object]
    ): Predicates = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bigint = bigint.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], dataView = dataView.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], float32Array = float32Array.asInstanceOf[js.Any], float64Array = float64Array.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], int16Array = int16Array.asInstanceOf[js.Any], int32Array = int32Array.asInstanceOf[js.Any], int8Array = int8Array.asInstanceOf[js.Any], iterable = iterable.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], nan = nan.asInstanceOf[js.Any], nullOrUndefined = nullOrUndefined.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], sharedArrayBuffer = sharedArrayBuffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], typedArray = typedArray.asInstanceOf[js.Any], uint16Array = uint16Array.asInstanceOf[js.Any], uint32Array = uint32Array.asInstanceOf[js.Any], uint8Array = uint8Array.asInstanceOf[js.Any], uint8ClampedArray = uint8ClampedArray.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], weakMap = weakMap.asInstanceOf[js.Any], weakSet = weakSet.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Predicates]
    }
    
    extension [Self <: Predicates](x: Self) {
      
      inline def setAny(
        value: (js.Function1[/* p1 */ BasePredicate[Any], typings.ow.anyMod.AnyPredicate[Any]]) & (js.Function2[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function3[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function4[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function5[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function6[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              /* p6 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function7[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              /* p6 */ BasePredicate[Any], 
              /* p7 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function8[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              /* p6 */ BasePredicate[Any], 
              /* p7 */ BasePredicate[Any], 
              /* p8 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function9[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              /* p6 */ BasePredicate[Any], 
              /* p7 */ BasePredicate[Any], 
              /* p8 */ BasePredicate[Any], 
              /* p9 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ]) & (js.Function10[
              /* p1 */ BasePredicate[Any], 
              /* p2 */ BasePredicate[Any], 
              /* p3 */ BasePredicate[Any], 
              /* p4 */ BasePredicate[Any], 
              /* p5 */ BasePredicate[Any], 
              /* p6 */ BasePredicate[Any], 
              /* p7 */ BasePredicate[Any], 
              /* p8 */ BasePredicate[Any], 
              /* p9 */ BasePredicate[Any], 
              /* p10 */ BasePredicate[Any], 
              typings.ow.anyMod.AnyPredicate[Any]
            ])
      ): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setArray(value: typings.ow.arrayMod.ArrayPredicate[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayBuffer(value: typings.ow.arrayBufferMod.ArrayBufferPredicate[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setBigint(value: typings.ow.bigintMod.BigIntPredicate): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: typings.ow.booleanMod.BooleanPredicate): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Predicate[Buffer]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setDataView(value: typings.ow.dataViewMod.DataViewPredicate): Self = StObject.set(x, "dataView", value.asInstanceOf[js.Any])
      
      inline def setDate(value: typings.ow.dateMod.DatePredicate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setError(value: typings.ow.errorMod.ErrorPredicate): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFloat32Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float32Array]): Self = StObject.set(x, "float32Array", value.asInstanceOf[js.Any])
      
      inline def setFloat64Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float64Array]): Self = StObject.set(x, "float64Array", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: Predicate[js.Function]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setInt16Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int16Array]): Self = StObject.set(x, "int16Array", value.asInstanceOf[js.Any])
      
      inline def setInt32Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int32Array]): Self = StObject.set(x, "int32Array", value.asInstanceOf[js.Any])
      
      inline def setInt8Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int8Array]): Self = StObject.set(x, "int8Array", value.asInstanceOf[js.Any])
      
      inline def setIterable(value: Predicate[js.Iterable[Any]]): Self = StObject.set(x, "iterable", value.asInstanceOf[js.Any])
      
      inline def setMap(value: typings.ow.mapMod.MapPredicate[Any, Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setNan(value: Predicate[Double]): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      inline def setNull(value: Predicate[Null]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullOrUndefined(value: Predicate[js.UndefOr[Null]]): Self = StObject.set(x, "nullOrUndefined", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: typings.ow.numberMod.NumberPredicate): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: typings.ow.objectMod.ObjectPredicate[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: Predicate[js.Promise[Any]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: Predicate[js.RegExp]): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setSet(value: typings.ow.setMod.SetPredicate[Any]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSharedArrayBuffer(value: typings.ow.arrayBufferMod.ArrayBufferPredicate[SharedArrayBuffer]): Self = StObject.set(x, "sharedArrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setString(value: typings.ow.stringMod.StringPredicate): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Predicate[js.Symbol]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTypedArray(value: typings.ow.typedArrayMod.TypedArrayPredicate[TypedArray]): Self = StObject.set(x, "typedArray", value.asInstanceOf[js.Any])
      
      inline def setUint16Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint16Array]): Self = StObject.set(x, "uint16Array", value.asInstanceOf[js.Any])
      
      inline def setUint32Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint32Array]): Self = StObject.set(x, "uint32Array", value.asInstanceOf[js.Any])
      
      inline def setUint8Array(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8Array]): Self = StObject.set(x, "uint8Array", value.asInstanceOf[js.Any])
      
      inline def setUint8ClampedArray(value: typings.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8ClampedArray]): Self = StObject.set(x, "uint8ClampedArray", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Predicate[Unit]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setWeakMap(value: typings.ow.weakMapMod.WeakMapPredicate[js.Object]): Self = StObject.set(x, "weakMap", value.asInstanceOf[js.Any])
      
      inline def setWeakSet(value: typings.ow.weakSetMod.WeakSetPredicate[js.Object]): Self = StObject.set(x, "weakSet", value.asInstanceOf[js.Any])
    }
  }
}
