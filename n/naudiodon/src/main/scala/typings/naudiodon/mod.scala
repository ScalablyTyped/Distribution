package typings.naudiodon

import typings.naudiodon.anon.DefaultHostAPI
import typings.naudiodon.anon.InOptions
import typings.naudiodon.anon.InOptionsOutOptions
import typings.naudiodon.anon.OutOptions
import typings.naudiodon.naudiodonInts.`16`
import typings.naudiodon.naudiodonInts.`1`
import typings.naudiodon.naudiodonInts.`24`
import typings.naudiodon.naudiodonInts.`32`
import typings.naudiodon.naudiodonInts.`8`
import typings.naudiodon.naudiodonStrings.AL
import typings.naudiodon.naudiodonStrings.ALSA
import typings.naudiodon.naudiodonStrings.ASIO
import typings.naudiodon.naudiodonStrings.AudioScienceHPI
import typings.naudiodon.naudiodonStrings.BeOS
import typings.naudiodon.naudiodonStrings.CoreAudio
import typings.naudiodon.naudiodonStrings.DirectSound
import typings.naudiodon.naudiodonStrings.InDevelopment
import typings.naudiodon.naudiodonStrings.JACK
import typings.naudiodon.naudiodonStrings.MME
import typings.naudiodon.naudiodonStrings.OSS
import typings.naudiodon.naudiodonStrings.SoundManager
import typings.naudiodon.naudiodonStrings.Unknown
import typings.naudiodon.naudiodonStrings.WASAPI
import typings.naudiodon.naudiodonStrings.WDMKS
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("naudiodon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AudioIO(options: InOptions): IoStreamRead = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[IoStreamRead]
  inline def AudioIO(options: InOptionsOutOptions): IoStreamDuplex = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[IoStreamDuplex]
  inline def AudioIO(options: OutOptions): IoStreamWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioIO")(options.asInstanceOf[js.Any]).asInstanceOf[IoStreamWrite]
  
  @JSImport("naudiodon", "SampleFormat16Bit")
  @js.native
  val SampleFormat16Bit: /* 16 */ Double = js.native
  
  @JSImport("naudiodon", "SampleFormat24Bit")
  @js.native
  val SampleFormat24Bit: /* 24 */ Double = js.native
  
  @JSImport("naudiodon", "SampleFormat32Bit")
  @js.native
  val SampleFormat32Bit: /* 32 */ Double = js.native
  
  @JSImport("naudiodon", "SampleFormat8Bit")
  @js.native
  val SampleFormat8Bit: /* 8 */ Double = js.native
  
  @JSImport("naudiodon", "SampleFormatFloat32")
  @js.native
  val SampleFormatFloat32: /* 1 */ Double = js.native
  
  inline def getDevices(): js.Array[DeviceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Array[DeviceInfo]]
  
  inline def getHostAPIs(): DefaultHostAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostAPIs")().asInstanceOf[DefaultHostAPI]
  
  trait AudioOptions extends StObject {
    
    /** The number of channels of sound to be delivered to the stream callback
      * It can range from 1 to the value of maxInputChannels from
      * DeviceInfo for the device specified by the device parameter.
      */
    var channelCount: js.UndefOr[Double] = js.undefined
    
    /** Close the stream if an audio error is detected, if set false then just log the error. */
    var closeOnError: js.UndefOr[Boolean] = js.undefined
    
    /** Use -1 or omit the deviceId to select the default device. */
    var deviceId: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of frames passed to the stream callback function,
      * or the preferred block granularity for a blocking read/write stream.
      * The special value 0 may be used to request that
      * the stream callback will receive an optimal (and possibly varying) number of
      * frames based on host requirements and the requested latency settings.
      * Note: With some host APIs, the use of non-zero framesPerBuffer for a callback
      * stream may introduce an additional layer of buffering which could introduce
      * additional latency. PortAudio guarantees that the additional latency
      * will be kept to the theoretical minimum however, it is strongly recommended
      * that a non-zero framesPerBuffer value only be used when your algorithm
      * requires a fixed number of frames per stream callback.
      */
    var framesPerBuffer: js.UndefOr[Double] = js.undefined
    
    /** The amount of data potentially buffered in streaming mode in bytes. */
    var highwaterMark: js.UndefOr[Double] = js.undefined
    
    /** The number of blocks to buffer for a blocking. */
    var maxQueue: js.UndefOr[Double] = js.undefined
    
    var sampleFormat: js.UndefOr[`1` | `8` | `16` | `24` | `32`] = js.undefined
    
    /** The required sampleRate. For full-duplex streams it must be the same sample rate for both input and output. */
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
      
      inline def setCloseOnError(value: Boolean): Self = StObject.set(x, "closeOnError", value.asInstanceOf[js.Any])
      
      inline def setCloseOnErrorUndefined: Self = StObject.set(x, "closeOnError", js.undefined)
      
      inline def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setFramesPerBuffer(value: Double): Self = StObject.set(x, "framesPerBuffer", value.asInstanceOf[js.Any])
      
      inline def setFramesPerBufferUndefined: Self = StObject.set(x, "framesPerBuffer", js.undefined)
      
      inline def setHighwaterMark(value: Double): Self = StObject.set(x, "highwaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighwaterMarkUndefined: Self = StObject.set(x, "highwaterMark", js.undefined)
      
      inline def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueUndefined: Self = StObject.set(x, "maxQueue", js.undefined)
      
      inline def setSampleFormat(value: `1` | `8` | `16` | `24` | `32`): Self = StObject.set(x, "sampleFormat", value.asInstanceOf[js.Any])
      
      inline def setSampleFormatUndefined: Self = StObject.set(x, "sampleFormat", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  trait DeviceInfo extends StObject {
    
    /** Default latency values for robust non-interactive applications (eg. playing sound files). */
    val defaultHighInputLatency: Double
    
    val defaultHighOutputLatency: Double
    
    /** Default latency values for interactive performance. */
    val defaultLowInputLatency: Double
    
    val defaultLowOutputLatency: Double
    
    val defaultSampleRate: Double
    
    val hostAPIName: String
    
    val id: Double
    
    val maxInputChannels: Double
    
    val maxOutputChannels: Double
    
    val name: String
  }
  object DeviceInfo {
    
    inline def apply(
      defaultHighInputLatency: Double,
      defaultHighOutputLatency: Double,
      defaultLowInputLatency: Double,
      defaultLowOutputLatency: Double,
      defaultSampleRate: Double,
      hostAPIName: String,
      id: Double,
      maxInputChannels: Double,
      maxOutputChannels: Double,
      name: String
    ): DeviceInfo = {
      val __obj = js.Dynamic.literal(defaultHighInputLatency = defaultHighInputLatency.asInstanceOf[js.Any], defaultHighOutputLatency = defaultHighOutputLatency.asInstanceOf[js.Any], defaultLowInputLatency = defaultLowInputLatency.asInstanceOf[js.Any], defaultLowOutputLatency = defaultLowOutputLatency.asInstanceOf[js.Any], defaultSampleRate = defaultSampleRate.asInstanceOf[js.Any], hostAPIName = hostAPIName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxInputChannels = maxInputChannels.asInstanceOf[js.Any], maxOutputChannels = maxOutputChannels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceInfo]
    }
    
    extension [Self <: DeviceInfo](x: Self) {
      
      inline def setDefaultHighInputLatency(value: Double): Self = StObject.set(x, "defaultHighInputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultHighOutputLatency(value: Double): Self = StObject.set(x, "defaultHighOutputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultLowInputLatency(value: Double): Self = StObject.set(x, "defaultLowInputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultLowOutputLatency(value: Double): Self = StObject.set(x, "defaultLowOutputLatency", value.asInstanceOf[js.Any])
      
      inline def setDefaultSampleRate(value: Double): Self = StObject.set(x, "defaultSampleRate", value.asInstanceOf[js.Any])
      
      inline def setHostAPIName(value: String): Self = StObject.set(x, "hostAPIName", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxInputChannels(value: Double): Self = StObject.set(x, "maxInputChannels", value.asInstanceOf[js.Any])
      
      inline def setMaxOutputChannels(value: Double): Self = StObject.set(x, "maxOutputChannels", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostInfo extends StObject {
    
    /**
      * The default input device for this host API. The value will be a
      * device index ranging from 0 to deviceCount - 1
      */
    val defaultInput: Double
    
    /**
      * The default output device for this host API. The value will be a
      * device index ranging from 0 to deviceCount - 1
      */
    val defaultOutput: Double
    
    /** The number of devices belonging to this host API*/
    val deviceCount: Double
    
    val id: Double
    
    val name: String
    
    /** Identifiers for each supported host API. The values are guaranteed to be
      * unique and to never change, thus allowing code to be written that
      * conditionally uses host API specific extensions.
      * New type ids will be allocated when support for a host API reaches
      * "public alpha" status, prior to that developers should use the InDevelopment type id.
      */
    val `type`: InDevelopment | DirectSound | MME | ASIO | SoundManager | CoreAudio | OSS | ALSA | AL | BeOS | WDMKS | JACK | WASAPI | AudioScienceHPI | Unknown
  }
  object HostInfo {
    
    inline def apply(
      defaultInput: Double,
      defaultOutput: Double,
      deviceCount: Double,
      id: Double,
      name: String,
      `type`: InDevelopment | DirectSound | MME | ASIO | SoundManager | CoreAudio | OSS | ALSA | AL | BeOS | WDMKS | JACK | WASAPI | AudioScienceHPI | Unknown
    ): HostInfo = {
      val __obj = js.Dynamic.literal(defaultInput = defaultInput.asInstanceOf[js.Any], defaultOutput = defaultOutput.asInstanceOf[js.Any], deviceCount = deviceCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostInfo]
    }
    
    extension [Self <: HostInfo](x: Self) {
      
      inline def setDefaultInput(value: Double): Self = StObject.set(x, "defaultInput", value.asInstanceOf[js.Any])
      
      inline def setDefaultOutput(value: Double): Self = StObject.set(x, "defaultOutput", value.asInstanceOf[js.Any])
      
      inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: InDevelopment | DirectSound | MME | ASIO | SoundManager | CoreAudio | OSS | ALSA | AL | BeOS | WDMKS | JACK | WASAPI | AudioScienceHPI | Unknown
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IoStream extends StObject {
    
    /**
      * Abort the stream. Throws away any pending bytes.
      * The optional callback will execute when the abort has completed.
      */
    def abort(): Unit = js.native
    def abort(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Quit the stream. Waits to process all pending bytes.
      * The optional callback will execute when the quit has completed.
      */
    def quit(): Unit = js.native
    def quit(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Start streaming to and/or from the device.
      * @returns void when the stream has started.
      */
    def start(): Unit = js.native
  }
  
  @js.native
  trait IoStreamDuplex
    extends StObject
       with IoStream
       with ReadableStream
       with WritableStream
  
  @js.native
  trait IoStreamRead
    extends StObject
       with IoStream
       with ReadableStream
  
  @js.native
  trait IoStreamWrite
    extends StObject
       with IoStream
       with WritableStream
}
