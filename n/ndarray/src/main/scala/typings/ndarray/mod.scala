package typings.ndarray

import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[D /* <: Data[Any] */](data: D): NdArray[D] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double]): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: js.Array[Double]): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: js.Array[Double], offset: Double): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: Unit, offset: Double): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: js.Array[Double]): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: js.Array[Double], offset: Double): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  inline def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: Unit, offset: Double): NdArray[D] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[NdArray[D]]
  
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends number ? ndarray.ndarray.GenericArray<T> | std.Array<T> | ndarray.ndarray.TypedArray : T extends bigint ? ndarray.ndarray.GenericArray<T> | std.Array<T> | ndarray.ndarray.MaybeBigInt64Array | ndarray.ndarray.MaybeBigUint64Array : ndarray.ndarray.GenericArray<T> | std.Array<T>
    }}}
    */
  @js.native
  trait Data[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    D extends std.Int8Array ? 'int8' : D extends std.Int16Array ? 'int16' : D extends std.Int32Array ? 'int32' : D extends std.Uint8Array ? 'uint8' : D extends std.Uint8ClampedArray ? 'uint8_clamped' : D extends std.Uint16Array ? 'uint16' : D extends std.Uint32Array ? 'uint32' : D extends std.Float32Array ? 'float32' : D extends std.Float64Array ? 'float64' : D extends ndarray.ndarray.MaybeBigInt64Array ? 'bigint64' : D extends ndarray.ndarray.MaybeBigUint64Array ? 'biguint64' : D extends ndarray.ndarray.GenericArray<unknown> ? 'generic' : 'array'
    }}}
    */
  @js.native
  trait DataType[D /* <: Data[Any] */] extends StObject
  
  trait GenericArray[T] extends StObject {
    
    def get(idx: Double): T
    
    var length: Double
    
    def set(idx: Double, value: T): Unit
  }
  object GenericArray {
    
    inline def apply[T](get: Double => T, length: Double, set: (Double, T) => Unit): GenericArray[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[GenericArray[T]]
    }
    
    extension [Self <: GenericArray[?], T](x: Self & GenericArray[T]) {
      
      inline def setGet(value: Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (Double, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type MaybeBigInt64Array = InstanceType[
    /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  BigInt64Array :infer T} ? T : never */ js.Any
  ]
  
  type MaybeBigUint64Array = InstanceType[
    /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  BigUint64Array :infer T} ? T : never */ js.Any
  ]
  
  trait NdArray[D /* <: Data[Any] */] extends StObject {
    
    var T: NdArray[D]
    
    var data: D
    
    var dimension: Double
    
    var dtype: DataType[D]
    
    def get(args: Double*): Value[D]
    
    def hi(args: Double*): NdArray[D]
    
    def index(args: Double*): Value[D]
    
    def lo(args: Double*): NdArray[D]
    
    var offset: Double
    
    var order: js.Array[Double]
    
    def pick(args: (Double | Null)*): NdArray[D]
    
    def set(args: Double*): Value[D]
    
    var shape: js.Array[Double]
    
    var size: Double
    
    def step(args: Double*): NdArray[D]
    
    var stride: js.Array[Double]
    
    def transpose(args: Double*): NdArray[D]
  }
  object NdArray {
    
    inline def apply[D /* <: Data[Any] */](
      T: NdArray[D],
      data: D,
      dimension: Double,
      dtype: DataType[D],
      get: /* repeated */ Double => Value[D],
      hi: /* repeated */ Double => NdArray[D],
      index: /* repeated */ Double => Value[D],
      lo: /* repeated */ Double => NdArray[D],
      offset: Double,
      order: js.Array[Double],
      pick: /* repeated */ Double | Null => NdArray[D],
      set: /* repeated */ Double => Value[D],
      shape: js.Array[Double],
      size: Double,
      step: /* repeated */ Double => NdArray[D],
      stride: js.Array[Double],
      transpose: /* repeated */ Double => NdArray[D]
    ): NdArray[D] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
      __obj.asInstanceOf[NdArray[D]]
    }
    
    extension [Self <: NdArray[?], D /* <: Data[Any] */](x: Self & NdArray[D]) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDtype(value: DataType[D]): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setGet(value: /* repeated */ Double => Value[D]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHi(value: /* repeated */ Double => NdArray[D]): Self = StObject.set(x, "hi", js.Any.fromFunction1(value))
      
      inline def setIndex(value: /* repeated */ Double => Value[D]): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      inline def setLo(value: /* repeated */ Double => NdArray[D]): Self = StObject.set(x, "lo", js.Any.fromFunction1(value))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setPick(value: /* repeated */ Double | Null => NdArray[D]): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
      
      inline def setSet(value: /* repeated */ Double => Value[D]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStep(value: /* repeated */ Double => NdArray[D]): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      inline def setStride(value: js.Array[Double]): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
      
      inline def setStrideVarargs(value: Double*): Self = StObject.set(x, "stride", js.Array(value*))
      
      inline def setT(value: NdArray[D]): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      inline def setTranspose(value: /* repeated */ Double => NdArray[D]): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
    }
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    D extends ndarray.ndarray.GenericArray<infer T> | std.Record<number, infer T> ? T : never
    }}}
    */
  @js.native
  trait Value[D /* <: Data[Any] */] extends StObject
}
