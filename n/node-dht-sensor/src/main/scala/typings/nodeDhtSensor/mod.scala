package typings.nodeDhtSensor

import typings.node.NodeJS.ErrnoException
import typings.nodeDhtSensor.anon.Test
import typings.nodeDhtSensor.nodeDhtSensorNumbers.`11`
import typings.nodeDhtSensor.nodeDhtSensorNumbers.`22`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-dht-sensor", "initialize")
  @js.native
  def initialize(testOptions: Test): Unit = js.native
  @JSImport("node-dht-sensor", "initialize")
  @js.native
  def initialize(`type`: SensorType, pin: Double): Boolean = js.native
  
  object promises {
    
    @JSImport("node-dht-sensor", "promises.initialize")
    @js.native
    def initialize(testOptions: Test): Unit = js.native
    @JSImport("node-dht-sensor", "promises.initialize")
    @js.native
    def initialize(`type`: SensorType, pin: Double): Boolean = js.native
    
    @JSImport("node-dht-sensor", "promises.read")
    @js.native
    def read(): js.Promise[SensorData] = js.native
    @JSImport("node-dht-sensor", "promises.read")
    @js.native
    def read(`type`: js.UndefOr[SensorType], pin: Double): js.Promise[SensorData] = js.native
    @JSImport("node-dht-sensor", "promises.read")
    @js.native
    def read(`type`: SensorType): js.Promise[SensorData] = js.native
    
    @JSImport("node-dht-sensor", "promises.readSync")
    @js.native
    def readSync(): SensorData = js.native
    @JSImport("node-dht-sensor", "promises.readSync")
    @js.native
    def readSync(`type`: js.UndefOr[SensorType], pin: Double): SensorData = js.native
    @JSImport("node-dht-sensor", "promises.readSync")
    @js.native
    def readSync(`type`: SensorType): SensorData = js.native
    
    @JSImport("node-dht-sensor", "promises.setMaxRetries")
    @js.native
    def setMaxRetries(maxRetries: Double): Unit = js.native
  }
  
  @JSImport("node-dht-sensor", "read")
  @js.native
  def read(): SensorData = js.native
  @JSImport("node-dht-sensor", "read")
  @js.native
  def read(`type`: js.UndefOr[SensorType], pin: Double): SensorData = js.native
  @JSImport("node-dht-sensor", "read")
  @js.native
  def read(`type`: SensorType): SensorData = js.native
  @JSImport("node-dht-sensor", "read")
  @js.native
  def read(
    `type`: SensorType,
    pin: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* temperature */ Double, /* humidity */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("node-dht-sensor", "setMaxRetries")
  @js.native
  def setMaxRetries(maxRetries: Double): Unit = js.native
  
  type DHT11 = `11`
  
  type DHT22 = `22`
  
  @js.native
  trait SensorData extends StObject {
    
    var humidity: Double = js.native
    
    var temperature: Double = js.native
  }
  object SensorData {
    
    @scala.inline
    def apply(humidity: Double, temperature: Double): SensorData = {
      val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SensorData]
    }
    
    @scala.inline
    implicit class SensorDataMutableBuilder[Self <: SensorData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHumidity(value: Double): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    }
  }
  
  type SensorType = DHT11 | DHT22
}
