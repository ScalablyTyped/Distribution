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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("naudiodon", "AudioIO")
  @js.native
  def AudioIO(options: InOptions): Readable with AudioStream = js.native
  @JSImport("naudiodon", "AudioIO")
  @js.native
  def AudioIO(options: InOptionsOutOptions): Duplex with AudioStream = js.native
  @JSImport("naudiodon", "AudioIO")
  @js.native
  def AudioIO(options: OutOptions): Writable with AudioStream = js.native
  
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
  
  @JSImport("naudiodon", "getDevices")
  @js.native
  def getDevices(): js.Array[Device] = js.native
  
  @JSImport("naudiodon", "getHostAPIs")
  @js.native
  def getHostAPIs(): DefaultHostAPI = js.native
  
  @js.native
  trait AudioOptions extends StObject {
    
    var channelCount: js.UndefOr[Double] = js.native
    
    var deviceId: js.UndefOr[Double] = js.native
    
    var maxQueue: js.UndefOr[Double] = js.native
    
    var sampleFormat: js.UndefOr[Double] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
  }
  object AudioOptions {
    
    @scala.inline
    def apply(): AudioOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AudioOptions]
    }
    
    @scala.inline
    implicit class AudioOptionsMutableBuilder[Self <: AudioOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
      
      @scala.inline
      def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxQueueUndefined: Self = StObject.set(x, "maxQueue", js.undefined)
      
      @scala.inline
      def setSampleFormat(value: Double): Self = StObject.set(x, "sampleFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleFormatUndefined: Self = StObject.set(x, "sampleFormat", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
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
  
  @js.native
  trait Device extends StObject {
    
    var defaultHighInputLatency: Double = js.native
    
    var defaultHighOutputLatency: Double = js.native
    
    var defaultLowInputLatency: Double = js.native
    
    var defaultLowOutputLatency: Double = js.native
    
    var defaultSampleRate: Double = js.native
    
    var hostAPIName: Double = js.native
    
    var id: Double = js.native
    
    var maxInputChannels: Double = js.native
    
    var maxOutputChannels: Double = js.native
    
    var name: String = js.native
  }
  object Device {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultHighInputLatency(value: Double): Self = StObject.set(x, "defaultHighInputLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHighOutputLatency(value: Double): Self = StObject.set(x, "defaultHighOutputLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLowInputLatency(value: Double): Self = StObject.set(x, "defaultLowInputLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLowOutputLatency(value: Double): Self = StObject.set(x, "defaultLowOutputLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSampleRate(value: Double): Self = StObject.set(x, "defaultSampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostAPIName(value: Double): Self = StObject.set(x, "hostAPIName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInputChannels(value: Double): Self = StObject.set(x, "maxInputChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutputChannels(value: Double): Self = StObject.set(x, "maxOutputChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostAPI extends StObject {
    
    var defaultInput: Double = js.native
    
    var defaultOutput: Double = js.native
    
    var deviceCount: Double = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object HostAPI {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class HostAPIMutableBuilder[Self <: HostAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultInput(value: Double): Self = StObject.set(x, "defaultInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOutput(value: Double): Self = StObject.set(x, "defaultOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
