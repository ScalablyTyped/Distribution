package typings.nodeMicrophone

import typings.node.processMod.global.NodeJS.WriteStream
import typings.nodeMicrophone.nodeMicrophoneNumbers.`16000`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`16`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`1`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`24`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`2`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`44100`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`8000`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`8`
import typings.nodeMicrophone.nodeMicrophoneStrings.`signed-integer`
import typings.nodeMicrophone.nodeMicrophoneStrings.`unsigned-integer`
import typings.nodeMicrophone.nodeMicrophoneStrings.big
import typings.nodeMicrophone.nodeMicrophoneStrings.default
import typings.nodeMicrophone.nodeMicrophoneStrings.hwColon0Comma0
import typings.nodeMicrophone.nodeMicrophoneStrings.little
import typings.nodeMicrophone.nodeMicrophoneStrings.plughwColon1Comma0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-microphone", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Microphone {
    def this(options: MicrophoneOptions) = this()
    
    /* CompleteClass */
    override def startRecording(): WriteStream = js.native
    
    /* CompleteClass */
    override def stopRecording(): Unit = js.native
  }
  
  trait Microphone extends StObject {
    
    def startRecording(): WriteStream
    
    def stopRecording(): Unit
  }
  object Microphone {
    
    inline def apply(startRecording: () => WriteStream, stopRecording: () => Unit): Microphone = {
      val __obj = js.Dynamic.literal(startRecording = js.Any.fromFunction0(startRecording), stopRecording = js.Any.fromFunction0(stopRecording))
      __obj.asInstanceOf[Microphone]
    }
    
    extension [Self <: Microphone](x: Self) {
      
      inline def setStartRecording(value: () => WriteStream): Self = StObject.set(x, "startRecording", js.Any.fromFunction0(value))
      
      inline def setStopRecording(value: () => Unit): Self = StObject.set(x, "stopRecording", js.Any.fromFunction0(value))
    }
  }
  
  trait MicrophoneOptions extends StObject {
    
    var additionalParameters: js.UndefOr[js.Any] = js.undefined
    
    var bitwidth: js.UndefOr[`8` | `16` | `24`] = js.undefined
    
    var channels: js.UndefOr[`1` | `2`] = js.undefined
    
    var device: js.UndefOr[hwColon0Comma0 | plughwColon1Comma0 | default] = js.undefined
    
    var encoding: js.UndefOr[`signed-integer` | `unsigned-integer`] = js.undefined
    
    var endian: js.UndefOr[big | little] = js.undefined
    
    var rate: js.UndefOr[`8000` | `16000` | `44100`] = js.undefined
  }
  object MicrophoneOptions {
    
    inline def apply(): MicrophoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneOptions]
    }
    
    extension [Self <: MicrophoneOptions](x: Self) {
      
      inline def setAdditionalParameters(value: js.Any): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
      
      inline def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
      
      inline def setBitwidth(value: `8` | `16` | `24`): Self = StObject.set(x, "bitwidth", value.asInstanceOf[js.Any])
      
      inline def setBitwidthUndefined: Self = StObject.set(x, "bitwidth", js.undefined)
      
      inline def setChannels(value: `1` | `2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setDevice(value: hwColon0Comma0 | plughwColon1Comma0 | default): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setEncoding(value: `signed-integer` | `unsigned-integer`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEndian(value: big | little): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
      
      inline def setEndianUndefined: Self = StObject.set(x, "endian", js.undefined)
      
      inline def setRate(value: `8000` | `16000` | `44100`): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
}
