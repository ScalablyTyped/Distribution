package typings.pigpioDht

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a new DHT object for accessing a DHT11 or DHT22/AM2302 via GPIO.
    * @param gpio      an unsigned integer specifying the GPIO number
    * @param type      11 to initialize for reading a DHT11, 22 for DHT22/AM2302
    */
  inline def apply(gpio: Double, `type`: Double): Dht = (^.asInstanceOf[js.Dynamic].apply(gpio.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Dht]
  
  @JSImport("pigpio-dht", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Dht
    extends StObject
       with EventEmitter {
    
    /**
      * Starts reading the sensor value. Emits the 'start' event before starting,
      * the 'end' event on end whether or not an error occurred, the 'result'
      * event with a DhtResult on success, and the 'badChecksum' event on a
      * receive failure.
      * @returns false if a read is already underway, true if a new read was started.
      */
    def read(): Boolean = js.native
  }
  
  /**
    * Result from a successful sensor read.
    */
  trait DhtResult extends StObject {
    
    /** The humidity value in percentage points. */
    var humidity: Double
    
    /** The temperature value in degrees Celsius. */
    var temperature: Double
  }
  object DhtResult {
    
    inline def apply(humidity: Double, temperature: Double): DhtResult = {
      val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DhtResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DhtResult] (val x: Self) extends AnyVal {
      
      inline def setHumidity(value: Double): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
      
      inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    }
  }
}
