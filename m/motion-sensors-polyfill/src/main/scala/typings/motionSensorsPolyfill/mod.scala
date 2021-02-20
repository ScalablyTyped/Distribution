package typings.motionSensorsPolyfill

import typings.std.DOMHighResTimeStamp
import typings.std.DOMMatrix
import typings.std.Event
import typings.std.EventTarget
import typings.std.Float32Array
import typings.std.Float64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("motion-sensors-polyfill", "AbsoluteOrientationSensor")
  @js.native
  class AbsoluteOrientationSensor () extends OrientationSensor {
    def this(options: OrientationSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Accelerometer")
  @js.native
  class Accelerometer () extends Sensor {
    def this(options: AccelerometerSensorOptions) = this()
    
    val x: Double = js.native
    
    val y: Double = js.native
    
    val z: Double = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "GravitySensor")
  @js.native
  class GravitySensor () extends Accelerometer {
    def this(options: AccelerometerSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Gyroscope")
  @js.native
  class Gyroscope () extends Sensor {
    def this(options: GyroscopeSensorOptions) = this()
    
    val x: Double = js.native
    
    val y: Double = js.native
    
    val z: Double = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "LinearAccelerationSensor")
  @js.native
  class LinearAccelerationSensor () extends Accelerometer {
    def this(options: AccelerometerSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "OrientationSensor")
  @js.native
  class OrientationSensor () extends Sensor {
    
    def populateMatrix(matrix: RotationMatrixType): Unit = js.native
    
    val quaternion: js.Tuple4[Double, Double, Double, Double] = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "RelativeOrientationSensor")
  @js.native
  class RelativeOrientationSensor () extends OrientationSensor {
    def this(options: OrientationSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Sensor")
  @js.native
  class Sensor () extends EventTarget {
    
    val activated: Boolean = js.native
    
    val hasReading: Boolean = js.native
    
    def onactivate(event: Event): Unit = js.native
    @JSName("onactivate")
    var onactivate_Original: EventHandler = js.native
    
    def onerror(event: Event): Unit = js.native
    @JSName("onerror")
    var onerror_Original: EventHandler = js.native
    
    def onreading(event: Event): Unit = js.native
    @JSName("onreading")
    var onreading_Original: EventHandler = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    val timestamp: js.UndefOr[DOMHighResTimeStamp] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen
  */
  trait AccelerometerLocalCoordinateSystem extends StObject
  object AccelerometerLocalCoordinateSystem {
    
    @scala.inline
    def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    @scala.inline
    def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  @js.native
  trait AccelerometerSensorOptions extends SensorOptions {
    
    var referenceFrame: js.UndefOr[AccelerometerLocalCoordinateSystem] = js.native
  }
  object AccelerometerSensorOptions {
    
    @scala.inline
    def apply(): AccelerometerSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccelerometerSensorOptions]
    }
    
    @scala.inline
    implicit class AccelerometerSensorOptionsMutableBuilder[Self <: AccelerometerSensorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferenceFrame(value: AccelerometerLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  type EventHandler = js.Function1[/* event */ Event, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen
  */
  trait GyroscopeLocalCoordinateSystem extends StObject
  object GyroscopeLocalCoordinateSystem {
    
    @scala.inline
    def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    @scala.inline
    def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  @js.native
  trait GyroscopeSensorOptions extends StObject {
    
    var referenceFrame: js.UndefOr[GyroscopeLocalCoordinateSystem] = js.native
  }
  object GyroscopeSensorOptions {
    
    @scala.inline
    def apply(): GyroscopeSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GyroscopeSensorOptions]
    }
    
    @scala.inline
    implicit class GyroscopeSensorOptionsMutableBuilder[Self <: GyroscopeSensorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferenceFrame(value: GyroscopeLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen
  */
  trait OrientationSensorLocalCoordinateSystem extends StObject
  object OrientationSensorLocalCoordinateSystem {
    
    @scala.inline
    def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    @scala.inline
    def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  @js.native
  trait OrientationSensorOptions extends SensorOptions {
    
    var referenceFrame: js.UndefOr[OrientationSensorLocalCoordinateSystem] = js.native
  }
  object OrientationSensorOptions {
    
    @scala.inline
    def apply(): OrientationSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrientationSensorOptions]
    }
    
    @scala.inline
    implicit class OrientationSensorOptionsMutableBuilder[Self <: OrientationSensorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferenceFrame(value: OrientationSensorLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  type RotationMatrixType = Float32Array | Float64Array | DOMMatrix
  
  @js.native
  trait SensorOptions extends StObject {
    
    var frequency: js.UndefOr[Double] = js.native
  }
  object SensorOptions {
    
    @scala.inline
    def apply(): SensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SensorOptions]
    }
    
    @scala.inline
    implicit class SensorOptionsMutableBuilder[Self <: SensorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    }
  }
}
