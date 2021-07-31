package typings.ndarray

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](data: Data[T]): typings.ndarray.mod.ndarray[T] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: js.Array[Double]): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double]): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double], offset: Double): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: js.Array[Double], stride: Unit, offset: Double): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: Unit, stride: js.Array[Double]): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: Unit, stride: js.Array[Double], offset: Double): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  @scala.inline
  def apply[T](data: Data[T], shape: Unit, stride: Unit, offset: Double): typings.ndarray.mod.ndarray[T] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.ndarray.mod.ndarray[T]]
  
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Data[T] = js.Array[T] | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Float32Array | Float64Array | Uint8ClampedArray
  
  /* Rewritten from type alias, can be one of: 
    - typings.ndarray.ndarrayStrings.int8
    - typings.ndarray.ndarrayStrings.int16
    - typings.ndarray.ndarrayStrings.int32
    - typings.ndarray.ndarrayStrings.uint8
    - typings.ndarray.ndarrayStrings.uint16
    - typings.ndarray.ndarrayStrings.uint32
    - typings.ndarray.ndarrayStrings.float32
    - typings.ndarray.ndarrayStrings.float64
    - typings.ndarray.ndarrayStrings.array
    - typings.ndarray.ndarrayStrings.uint8_clamped
    - typings.ndarray.ndarrayStrings.buffer
    - typings.ndarray.ndarrayStrings.generic
  */
  trait DataType extends StObject
  object DataType {
    
    @scala.inline
    def array: typings.ndarray.ndarrayStrings.array = "array".asInstanceOf[typings.ndarray.ndarrayStrings.array]
    
    @scala.inline
    def buffer: typings.ndarray.ndarrayStrings.buffer = "buffer".asInstanceOf[typings.ndarray.ndarrayStrings.buffer]
    
    @scala.inline
    def float32: typings.ndarray.ndarrayStrings.float32 = "float32".asInstanceOf[typings.ndarray.ndarrayStrings.float32]
    
    @scala.inline
    def float64: typings.ndarray.ndarrayStrings.float64 = "float64".asInstanceOf[typings.ndarray.ndarrayStrings.float64]
    
    @scala.inline
    def generic: typings.ndarray.ndarrayStrings.generic = "generic".asInstanceOf[typings.ndarray.ndarrayStrings.generic]
    
    @scala.inline
    def int16: typings.ndarray.ndarrayStrings.int16 = "int16".asInstanceOf[typings.ndarray.ndarrayStrings.int16]
    
    @scala.inline
    def int32: typings.ndarray.ndarrayStrings.int32 = "int32".asInstanceOf[typings.ndarray.ndarrayStrings.int32]
    
    @scala.inline
    def int8: typings.ndarray.ndarrayStrings.int8 = "int8".asInstanceOf[typings.ndarray.ndarrayStrings.int8]
    
    @scala.inline
    def uint16: typings.ndarray.ndarrayStrings.uint16 = "uint16".asInstanceOf[typings.ndarray.ndarrayStrings.uint16]
    
    @scala.inline
    def uint32: typings.ndarray.ndarrayStrings.uint32 = "uint32".asInstanceOf[typings.ndarray.ndarrayStrings.uint32]
    
    @scala.inline
    def uint8: typings.ndarray.ndarrayStrings.uint8 = "uint8".asInstanceOf[typings.ndarray.ndarrayStrings.uint8]
    
    @scala.inline
    def uint8_clamped: typings.ndarray.ndarrayStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typings.ndarray.ndarrayStrings.uint8_clamped]
  }
  
  trait ndarray[T] extends StObject {
    
    var T: typings.ndarray.mod.ndarray[T]
    
    var data: Data[T]
    
    var dimension: Double
    
    var dtype: DataType
    
    def get(args: Double*): T
    
    def hi(args: Double*): typings.ndarray.mod.ndarray[T]
    
    def index(args: Double*): T
    
    def lo(args: Double*): typings.ndarray.mod.ndarray[T]
    
    var offset: Double
    
    var order: js.Array[Double]
    
    def pick(args: (Double | Null)*): typings.ndarray.mod.ndarray[T]
    
    def reshape(shapes: Double*): typings.ndarray.mod.ndarray[T]
    
    def set(args: Double*): T
    
    var shape: js.Array[Double]
    
    var size: Double
    
    def step(args: Double*): typings.ndarray.mod.ndarray[T]
    
    var stride: js.Array[Double]
    
    def transpose(args: Double*): typings.ndarray.mod.ndarray[T]
  }
  object ndarray {
    
    @scala.inline
    def apply[T](
      T: typings.ndarray.mod.ndarray[T],
      data: Data[T],
      dimension: Double,
      dtype: DataType,
      get: /* repeated */ Double => T,
      hi: /* repeated */ Double => typings.ndarray.mod.ndarray[T],
      index: /* repeated */ Double => T,
      lo: /* repeated */ Double => typings.ndarray.mod.ndarray[T],
      offset: Double,
      order: js.Array[Double],
      pick: /* repeated */ Double | Null => typings.ndarray.mod.ndarray[T],
      reshape: /* repeated */ Double => typings.ndarray.mod.ndarray[T],
      set: /* repeated */ Double => T,
      shape: js.Array[Double],
      size: Double,
      step: /* repeated */ Double => typings.ndarray.mod.ndarray[T],
      stride: js.Array[Double],
      transpose: /* repeated */ Double => typings.ndarray.mod.ndarray[T]
    ): typings.ndarray.mod.ndarray[T] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
      __obj.asInstanceOf[typings.ndarray.mod.ndarray[T]]
    }
    
    @scala.inline
    implicit class ndarrayMutableBuilder[Self <: typings.ndarray.mod.ndarray[?], T] (val x: Self & typings.ndarray.mod.ndarray[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: Data[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: /* repeated */ Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHi(value: /* repeated */ Double => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "hi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: /* repeated */ Double => T): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLo(value: /* repeated */ Double => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "lo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setPick(value: /* repeated */ Double | Null => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReshape(value: /* repeated */ Double => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "reshape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: /* repeated */ Double => T): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: /* repeated */ Double => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStride(value: js.Array[Double]): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideVarargs(value: Double*): Self = StObject.set(x, "stride", js.Array(value :_*))
      
      @scala.inline
      def setT(value: typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspose(value: /* repeated */ Double => typings.ndarray.mod.ndarray[T]): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
    }
  }
}
