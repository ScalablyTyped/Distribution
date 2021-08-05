package typings.naudiodon

import typings.naudiodon.anon.DefaultHostAPI
import typings.naudiodon.anon.InOptions
import typings.naudiodon.anon.InOptionsOutOptions
import typings.naudiodon.anon.OutOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("naudiodon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AudioIO(options: InOptions): Readable & AudioStream = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[Readable & AudioStream]
  inline def AudioIO(options: InOptionsOutOptions): Duplex & AudioStream = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[Duplex & AudioStream]
  inline def AudioIO(options: OutOptions): Writable & AudioStream = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[Writable & AudioStream]
  
  @JSImport("naudiodon", "SampleFormat16Bit")
  @js.native
  val SampleFormat16Bit: Double = js.native
  
  @JSImport("naudiodon", "SampleFormat24Bit")
  @js.native
  val SampleFormat24Bit: Double = js.native
  
  @JSImport("naudiodon", "SampleFormat32Bit")
  @js.native
  val SampleFormat32Bit: Double = js.native
  
  @JSImport("naudiodon", "SampleFormat8Bit")
  @js.native
  val SampleFormat8Bit: Double = js.native
  
  @JSImport("naudiodon", "SampleFormatFloat32")
  @js.native
  val SampleFormatFloat32: Double = js.native
  
  inline def getDevices(): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Array[Device]]
  
  inline def getHostAPIs(): DefaultHostAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostAPIs")().asInstanceOf[DefaultHostAPI]
  
  trait AudioOptions extends StObject {
    
    var channelCount: js.UndefOr[Double] = js.undefined
    
    var deviceId: js.UndefOr[Double] = js.undefined
    
    var maxQueue: js.UndefOr[Double] = js.undefined
    
    var sampleFormat: js.UndefOr[Double] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object AudioOptions {
    
    inline def apply(): AudioOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AudioOptions]
    }
    
    extension [Self <: AudioOptions](x: Self) {
      
      inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
      
      inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
      
      inline def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueUndefined: Self = StObject.set(x, "maxQueue", js.undefined)
      
      inline def setSampleFormat(value: Double): Self = StObject.set(x, "sampleFormat", value.asInstanceOf[js.Any])
      
      inline def setSampleFormatUndefined: Self = StObject.set(x, "sampleFormat", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  @js.native
  trait AudioStream extends StObject {
    
    def abort(): Unit = js.native
    def abort(cb: js.Function0[Unit]): Unit = js.native
    
    def quit(): Unit = js.native
    def quit(cb: js.Function0[Unit]): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  trait Device extends StObject {
    
    var defaultHighInputLatency: Double
    
    var defaultHighOutputLatency: Double
    
    var defaultLowInputLatency: Double
    
    var defaultLowOutputLatency: Double
    
    var defaultSampleRate: Double
    
    var hostAPIName: Double
    
    var id: Double
    
    var maxInputChannels: Double
    
    var maxOutputChannels: Double
    
    var name: String
  }
  object Device {
    
    inline def apply(
      defaultHighInputLatency: Double,
      defaultHighOutputLatency: Double,
      defaultLowInputLatency: Double,
      defaultLowOutputLatency: Double,
      defaultSampleRate: Double,
      hostAPIName: Double,
      id: Double,
      maxInputChannels: Double,
      maxOutputChannels: Double,
      name: String
    ): Device = {
      val __obj = js.Dynamic.literal(defaultHighInputLatency = defaultHighInputLatency.asInstanceOf[js.Any], defaultHighOutputLatency = defaultHighOutputLatency.asInstanceOf[js.Any], defaultLowInputLatency = defaultLowInputLatency.asInstanceOf[js.Any], defaultLowOutputLatency = defaultLowOutputLatency.asInstanceOf[js.Any], defaultSampleRate = defaultSampleRate.asInstanceOf[js.Any], hostAPIName = hostAPIName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxInputChannels = maxInputChannels.asInstanceOf[js.Any], maxOutputChannels = maxOutputChannels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setDefaultHighInputLatency(value: Double): Self = StObject.set(x, "defaultHighInputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultHighOutputLatency(value: Double): Self = StObject.set(x, "defaultHighOutputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultLowInputLatency(value: Double): Self = StObject.set(x, "defaultLowInputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultLowOutputLatency(value: Double): Self = StObject.set(x, "defaultLowOutputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultSampleRate(value: Double): Self = StObject.set(x, "defaultSampleRate", value.asInstanceOf[js.Any])
      
      inline def setHostAPIName(value: Double): Self = StObject.set(x, "hostAPIName", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxInputChannels(value: Double): Self = StObject.set(x, "maxInputChannels", value.asInstanceOf[js.Any])
      
      inline def setMaxOutputChannels(value: Double): Self = StObject.set(x, "maxOutputChannels", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostAPI extends StObject {
    
    var defaultInput: Double
    
    var defaultOutput: Double
    
    var deviceCount: Double
    
    var id: Double
    
    var name: String
    
    var `type`: String
  }
  object HostAPI {
    
    inline def apply(
      defaultInput: Double,
      defaultOutput: Double,
      deviceCount: Double,
      id: Double,
      name: String,
      `type`: String
    ): HostAPI = {
      val __obj = js.Dynamic.literal(defaultInput = defaultInput.asInstanceOf[js.Any], defaultOutput = defaultOutput.asInstanceOf[js.Any], deviceCount = deviceCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostAPI]
    }
    
    extension [Self <: HostAPI](x: Self) {
      
      inline def setDefaultInput(value: Double): Self = StObject.set(x, "defaultInput", value.asInstanceOf[js.Any])
      
      inline def setDefaultOutput(value: Double): Self = StObject.set(x, "defaultOutput", value.asInstanceOf[js.Any])
      
      inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
