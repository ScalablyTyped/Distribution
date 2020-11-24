package typings.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ndarray[T] extends js.Object {
  
  var T: ndarray[T] = js.native
  
  var data: Data[T] = js.native
  
  var dimension: Double = js.native
  
  var dtype: DataType = js.native
  
  def get(args: Double*): T = js.native
  
  def hi(args: Double*): ndarray[T] = js.native
  
  def index(args: Double*): T = js.native
  
  def lo(args: Double*): ndarray[T] = js.native
  
  var offset: Double = js.native
  
  var order: js.Array[Double] = js.native
  
  def pick(args: (Double | Null)*): ndarray[T] = js.native
  
  def reshape(shapes: Double*): ndarray[T] = js.native
  
  def set(args: Double*): T = js.native
  
  var shape: js.Array[Double] = js.native
  
  var size: Double = js.native
  
  def step(args: Double*): ndarray[T] = js.native
  
  var stride: js.Array[Double] = js.native
  
  def transpose(args: Double*): ndarray[T] = js.native
}
object ndarray {
  
  @scala.inline
  def apply[T](
    T: ndarray[T],
    data: Data[T],
    dimension: Double,
    dtype: DataType,
    get: /* repeated */ Double => T,
    hi: /* repeated */ Double => ndarray[T],
    index: /* repeated */ Double => T,
    lo: /* repeated */ Double => ndarray[T],
    offset: Double,
    order: js.Array[Double],
    pick: /* repeated */ Double | Null => ndarray[T],
    reshape: /* repeated */ Double => ndarray[T],
    set: /* repeated */ Double => T,
    shape: js.Array[Double],
    size: Double,
    step: /* repeated */ Double => ndarray[T],
    stride: js.Array[Double],
    transpose: /* repeated */ Double => ndarray[T]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
    __obj.asInstanceOf[ndarray[T]]
  }
  
  @scala.inline
  implicit class ndarrayOps[Self <: ndarray[_], T] (val x: Self with ndarray[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setT(value: ndarray[T]): Self = this.set("T", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: Data[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: Double): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: /* repeated */ Double => T): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHi(value: /* repeated */ Double => ndarray[T]): Self = this.set("hi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndex(value: /* repeated */ Double => T): Self = this.set("index", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLo(value: /* repeated */ Double => ndarray[T]): Self = this.set("lo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderVarargs(value: Double*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPick(value: /* repeated */ Double | Null => ndarray[T]): Self = this.set("pick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReshape(value: /* repeated */ Double => ndarray[T]): Self = this.set("reshape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: /* repeated */ Double => T): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: /* repeated */ Double => ndarray[T]): Self = this.set("step", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrideVarargs(value: Double*): Self = this.set("stride", js.Array(value :_*))
    
    @scala.inline
    def setStride(value: js.Array[Double]): Self = this.set("stride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranspose(value: /* repeated */ Double => ndarray[T]): Self = this.set("transpose", js.Any.fromFunction1(value))
  }
}
