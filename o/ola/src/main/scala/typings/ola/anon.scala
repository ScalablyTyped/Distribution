package typings.ola

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Get[V /* <: Record[String, Double] */] extends StObject {
    
    def get(name: /* keyof V */ String): Double = js.native
    def get(name: /* keyof V */ String, now: js.Date): Double = js.native
    
    def set(values: V): Unit = js.native
    def set(values: V, time: Double): Unit = js.native
  }
  
  @js.native
  trait Set[V /* <: js.Array[Double] */] extends StObject {
    
    def get(): Double = js.native
    def get(name: Double): Double = js.native
    def get(name: Double, now: js.Date): Double = js.native
    def get(name: Unit, now: js.Date): Double = js.native
    
    def set(values: V): Unit = js.native
    def set(values: V, time: Double): Unit = js.native
  }
  
  trait Value extends StObject {
    
    var value: Double
  }
  object Value {
    
    inline def apply(value: Double): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
