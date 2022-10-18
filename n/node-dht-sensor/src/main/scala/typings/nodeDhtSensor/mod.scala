package typings.nodeDhtSensor

import typings.node.NodeJS.ErrnoException
import typings.nodeDhtSensor.anon.Test
import typings.nodeDhtSensor.nodeDhtSensorInts.`11`
import typings.nodeDhtSensor.nodeDhtSensorInts.`22`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-dht-sensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initialize(testOptions: Test): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(testOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(`type`: SensorType, pin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object promises {
    
    @JSImport("node-dht-sensor", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    inline def initialize(testOptions: Test): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(testOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def initialize(`type`: SensorType, pin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def read(): js.Promise[SensorData] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Promise[SensorData]]
    inline def read(`type`: Unit, pin: Double): js.Promise[SensorData] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SensorData]]
    inline def read(`type`: SensorType): js.Promise[SensorData] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SensorData]]
    inline def read(`type`: SensorType, pin: Double): js.Promise[SensorData] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SensorData]]
    
    inline def readSync(): SensorData = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")().asInstanceOf[SensorData]
    inline def readSync(`type`: Unit, pin: Double): SensorData = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[SensorData]
    inline def readSync(`type`: SensorType): SensorData = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[SensorData]
    inline def readSync(`type`: SensorType, pin: Double): SensorData = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[SensorData]
    
    inline def setMaxRetries(maxRetries: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxRetries")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def read(): SensorData = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[SensorData]
  inline def read(`type`: Unit, pin: Double): SensorData = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[SensorData]
  inline def read(`type`: SensorType): SensorData = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any]).asInstanceOf[SensorData]
  inline def read(`type`: SensorType, pin: Double): SensorData = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[SensorData]
  inline def read(
    `type`: SensorType,
    pin: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* temperature */ Double, /* humidity */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(`type`.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMaxRetries(maxRetries: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxRetries")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type DHT11 = `11`
  
  type DHT22 = `22`
  
  trait SensorData extends StObject {
    
    var humidity: Double
    
    var temperature: Double
  }
  object SensorData {
    
    inline def apply(humidity: Double, temperature: Double): SensorData = {
      val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SensorData]
    }
    
    extension [Self <: SensorData](x: Self) {
      
      inline def setHumidity(value: Double): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
      
      inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    }
  }
  
  type SensorType = DHT11 | DHT22
}
