package typings.piPirSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-pir-sensor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Sensor {
    def this(sensorConfiguration: SensorConfiguration) = this()
  }
  
  @js.native
  trait Sensor extends StObject {
    
    var lastMovement: js.Date = js.native
    
    def on(event: String, callback: js.Function0[Unit]): Unit = js.native
    
    def start(): Unit = js.native
    def start(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def stop(): Boolean = js.native
  }
  
  trait SensorConfiguration extends StObject {
    
    var loop: js.UndefOr[Double] = js.undefined
    
    var pin: Double
  }
  object SensorConfiguration {
    
    inline def apply(pin: Double): SensorConfiguration = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
      __obj.asInstanceOf[SensorConfiguration]
    }
    
    extension [Self <: SensorConfiguration](x: Self) {
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    }
  }
}
