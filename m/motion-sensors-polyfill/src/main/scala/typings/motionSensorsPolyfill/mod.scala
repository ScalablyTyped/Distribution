package typings.motionSensorsPolyfill

import typings.std.DOMHighResTimeStamp
import typings.std.DOMMatrix
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("motion-sensors-polyfill", "AbsoluteOrientationSensor")
  @js.native
  open class AbsoluteOrientationSensor () extends OrientationSensor {
    def this(options: OrientationSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Accelerometer")
  @js.native
  open class Accelerometer () extends Sensor {
    def this(options: AccelerometerSensorOptions) = this()
    
    val x: Double = js.native
    
    val y: Double = js.native
    
    val z: Double = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "GravitySensor")
  @js.native
  open class GravitySensor () extends Accelerometer {
    def this(options: AccelerometerSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Gyroscope")
  @js.native
  open class Gyroscope () extends Sensor {
    def this(options: GyroscopeSensorOptions) = this()
    
    val x: Double = js.native
    
    val y: Double = js.native
    
    val z: Double = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "LinearAccelerationSensor")
  @js.native
  open class LinearAccelerationSensor () extends Accelerometer {
    def this(options: AccelerometerSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "OrientationSensor")
  @js.native
  open class OrientationSensor () extends Sensor {
    
    def populateMatrix(matrix: RotationMatrixType): Unit = js.native
    
    val quaternion: js.Tuple4[Double, Double, Double, Double] = js.native
  }
  
  @JSImport("motion-sensors-polyfill", "RelativeOrientationSensor")
  @js.native
  open class RelativeOrientationSensor () extends OrientationSensor {
    def this(options: OrientationSensorOptions) = this()
  }
  
  @JSImport("motion-sensors-polyfill", "Sensor")
  @js.native
  open class Sensor ()
    extends StObject
       with EventTarget {
    
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
    
    inline def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    inline def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  trait AccelerometerSensorOptions
    extends StObject
       with SensorOptions {
    
    var referenceFrame: js.UndefOr[AccelerometerLocalCoordinateSystem] = js.undefined
  }
  object AccelerometerSensorOptions {
    
    inline def apply(): AccelerometerSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccelerometerSensorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccelerometerSensorOptions] (val x: Self) extends AnyVal {
      
      inline def setReferenceFrame(value: AccelerometerLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      inline def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  type EventHandler = js.Function1[/* event */ Event, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen
  */
  trait GyroscopeLocalCoordinateSystem extends StObject
  object GyroscopeLocalCoordinateSystem {
    
    inline def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    inline def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  trait GyroscopeSensorOptions extends StObject {
    
    var referenceFrame: js.UndefOr[GyroscopeLocalCoordinateSystem] = js.undefined
  }
  object GyroscopeSensorOptions {
    
    inline def apply(): GyroscopeSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GyroscopeSensorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GyroscopeSensorOptions] (val x: Self) extends AnyVal {
      
      inline def setReferenceFrame(value: GyroscopeLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      inline def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device
    - typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen
  */
  trait OrientationSensorLocalCoordinateSystem extends StObject
  object OrientationSensorLocalCoordinateSystem {
    
    inline def device: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device = "device".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.device]
    
    inline def screen: typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen = "screen".asInstanceOf[typings.motionSensorsPolyfill.motionSensorsPolyfillStrings.screen]
  }
  
  trait OrientationSensorOptions
    extends StObject
       with SensorOptions {
    
    var referenceFrame: js.UndefOr[OrientationSensorLocalCoordinateSystem] = js.undefined
  }
  object OrientationSensorOptions {
    
    inline def apply(): OrientationSensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrientationSensorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrientationSensorOptions] (val x: Self) extends AnyVal {
      
      inline def setReferenceFrame(value: OrientationSensorLocalCoordinateSystem): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
      
      inline def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
    }
  }
  
  type RotationMatrixType = js.typedarray.Float32Array | js.typedarray.Float64Array | DOMMatrix
  
  trait SensorOptions extends StObject {
    
    var frequency: js.UndefOr[Double] = js.undefined
  }
  object SensorOptions {
    
    inline def apply(): SensorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SensorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SensorOptions] (val x: Self) extends AnyVal {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    }
  }
}
