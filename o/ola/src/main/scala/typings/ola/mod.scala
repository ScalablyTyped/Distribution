package typings.ola

import typings.ola.anon.Get
import typings.ola.anon.Set
import typings.ola.anon.Value
import typings.ola.olaStrings.value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(values: Double): SingleValue = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any]).asInstanceOf[SingleValue]
  inline def apply(values: Double, time: Double): SingleValue = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[SingleValue]
  inline def apply[V /* <: js.Array[Double] */](values: V): TupleValue[V] = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any]).asInstanceOf[TupleValue[V]]
  inline def apply[V /* <: js.Array[Double] */](values: V, time: Double): TupleValue[V] = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[TupleValue[V]]
  inline def apply[K /* <: String */](values: Record[K, Double]): MultiValue[Record[K, Double]] = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any]).asInstanceOf[MultiValue[Record[K, Double]]]
  inline def apply[K /* <: String */](values: Record[K, Double], time: Double): MultiValue[Record[K, Double]] = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[MultiValue[Record[K, Double]]]
  
  @JSImport("ola", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type MultiValue[V /* <: Record[String, Double] */] = V & Get[V]
  
  @js.native
  trait SingleValue extends StObject {
    
    def get(): Double = js.native
    def get(name: Unit, now: js.Date): Double = js.native
    @JSName("get")
    def get_value(name: value): Double = js.native
    @JSName("get")
    def get_value(name: value, now: js.Date): Double = js.native
    
    def set(values: Double): Unit = js.native
    def set(values: Double, time: Double): Unit = js.native
    def set(values: Value): Unit = js.native
    def set(values: Value, time: Double): Unit = js.native
    
    var value: Double = js.native
  }
  
  type TupleValue[V /* <: js.Array[Double] */] = V & Set[V]
}
