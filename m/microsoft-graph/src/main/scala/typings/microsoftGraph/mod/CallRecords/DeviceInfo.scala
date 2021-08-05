package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInfo extends StObject {
  
  // Name of the capture device driver used by the media endpoint.
  var captureDeviceDriver: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the capture device used by the media endpoint.
  var captureDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Fraction of the call that the media endpoint detected the capture device was not working properly.
  var captureNotFunctioningEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor
    * quality of the audio sent and received.
    */
  var cpuInsufficentEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the
    * audio being sent.
    */
  var deviceClippingEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor
    * quality of the audio being sent or received.
    */
  var deviceGlitchEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of times during the call that the media endpoint detected howling or screeching audio.
  var howlingEventCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
  var initialSignalLevelRootMeanSquare: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being
    * sent.
    */
  var lowSpeechLevelEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio
    * being sent.
    */
  var lowSpeechToNoiseEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Glitches per 5 minute interval for the media endpoint's microphone.
  var micGlitchRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media
    * endpoint.
    */
  var receivedNoiseLevel: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the
    * media endpoint.
    */
  var receivedSignalLevel: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the render device driver used by the media endpoint.
  var renderDeviceDriver: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the render device used by the media endpoint.
  var renderDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Fraction of the call that media endpoint detected device render is muted.
  var renderMuteEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Fraction of the call that the media endpoint detected the render device was not working properly.
  var renderNotFunctioningEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Fraction of the call that media endpoint detected device render volume is set to 0.
  var renderZeroVolumeEventRatio: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media
    * endpoint.
    */
  var sentNoiseLevel: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media
    * endpoint.
    */
  var sentSignalLevel: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Glitches per 5 minute internal for the media endpoint's loudspeaker.
  var speakerGlitchRate: js.UndefOr[NullableOption[Double]] = js.undefined
}
object DeviceInfo {
  
  inline def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setCaptureDeviceDriver(value: NullableOption[String]): Self = StObject.set(x, "captureDeviceDriver", value.asInstanceOf[js.Any])
    
    inline def setCaptureDeviceDriverNull: Self = StObject.set(x, "captureDeviceDriver", null)
    
    inline def setCaptureDeviceDriverUndefined: Self = StObject.set(x, "captureDeviceDriver", js.undefined)
    
    inline def setCaptureDeviceName(value: NullableOption[String]): Self = StObject.set(x, "captureDeviceName", value.asInstanceOf[js.Any])
    
    inline def setCaptureDeviceNameNull: Self = StObject.set(x, "captureDeviceName", null)
    
    inline def setCaptureDeviceNameUndefined: Self = StObject.set(x, "captureDeviceName", js.undefined)
    
    inline def setCaptureNotFunctioningEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "captureNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    inline def setCaptureNotFunctioningEventRatioNull: Self = StObject.set(x, "captureNotFunctioningEventRatio", null)
    
    inline def setCaptureNotFunctioningEventRatioUndefined: Self = StObject.set(x, "captureNotFunctioningEventRatio", js.undefined)
    
    inline def setCpuInsufficentEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "cpuInsufficentEventRatio", value.asInstanceOf[js.Any])
    
    inline def setCpuInsufficentEventRatioNull: Self = StObject.set(x, "cpuInsufficentEventRatio", null)
    
    inline def setCpuInsufficentEventRatioUndefined: Self = StObject.set(x, "cpuInsufficentEventRatio", js.undefined)
    
    inline def setDeviceClippingEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "deviceClippingEventRatio", value.asInstanceOf[js.Any])
    
    inline def setDeviceClippingEventRatioNull: Self = StObject.set(x, "deviceClippingEventRatio", null)
    
    inline def setDeviceClippingEventRatioUndefined: Self = StObject.set(x, "deviceClippingEventRatio", js.undefined)
    
    inline def setDeviceGlitchEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "deviceGlitchEventRatio", value.asInstanceOf[js.Any])
    
    inline def setDeviceGlitchEventRatioNull: Self = StObject.set(x, "deviceGlitchEventRatio", null)
    
    inline def setDeviceGlitchEventRatioUndefined: Self = StObject.set(x, "deviceGlitchEventRatio", js.undefined)
    
    inline def setHowlingEventCount(value: NullableOption[Double]): Self = StObject.set(x, "howlingEventCount", value.asInstanceOf[js.Any])
    
    inline def setHowlingEventCountNull: Self = StObject.set(x, "howlingEventCount", null)
    
    inline def setHowlingEventCountUndefined: Self = StObject.set(x, "howlingEventCount", js.undefined)
    
    inline def setInitialSignalLevelRootMeanSquare(value: NullableOption[Double]): Self = StObject.set(x, "initialSignalLevelRootMeanSquare", value.asInstanceOf[js.Any])
    
    inline def setInitialSignalLevelRootMeanSquareNull: Self = StObject.set(x, "initialSignalLevelRootMeanSquare", null)
    
    inline def setInitialSignalLevelRootMeanSquareUndefined: Self = StObject.set(x, "initialSignalLevelRootMeanSquare", js.undefined)
    
    inline def setLowSpeechLevelEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "lowSpeechLevelEventRatio", value.asInstanceOf[js.Any])
    
    inline def setLowSpeechLevelEventRatioNull: Self = StObject.set(x, "lowSpeechLevelEventRatio", null)
    
    inline def setLowSpeechLevelEventRatioUndefined: Self = StObject.set(x, "lowSpeechLevelEventRatio", js.undefined)
    
    inline def setLowSpeechToNoiseEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "lowSpeechToNoiseEventRatio", value.asInstanceOf[js.Any])
    
    inline def setLowSpeechToNoiseEventRatioNull: Self = StObject.set(x, "lowSpeechToNoiseEventRatio", null)
    
    inline def setLowSpeechToNoiseEventRatioUndefined: Self = StObject.set(x, "lowSpeechToNoiseEventRatio", js.undefined)
    
    inline def setMicGlitchRate(value: NullableOption[Double]): Self = StObject.set(x, "micGlitchRate", value.asInstanceOf[js.Any])
    
    inline def setMicGlitchRateNull: Self = StObject.set(x, "micGlitchRate", null)
    
    inline def setMicGlitchRateUndefined: Self = StObject.set(x, "micGlitchRate", js.undefined)
    
    inline def setReceivedNoiseLevel(value: NullableOption[Double]): Self = StObject.set(x, "receivedNoiseLevel", value.asInstanceOf[js.Any])
    
    inline def setReceivedNoiseLevelNull: Self = StObject.set(x, "receivedNoiseLevel", null)
    
    inline def setReceivedNoiseLevelUndefined: Self = StObject.set(x, "receivedNoiseLevel", js.undefined)
    
    inline def setReceivedSignalLevel(value: NullableOption[Double]): Self = StObject.set(x, "receivedSignalLevel", value.asInstanceOf[js.Any])
    
    inline def setReceivedSignalLevelNull: Self = StObject.set(x, "receivedSignalLevel", null)
    
    inline def setReceivedSignalLevelUndefined: Self = StObject.set(x, "receivedSignalLevel", js.undefined)
    
    inline def setRenderDeviceDriver(value: NullableOption[String]): Self = StObject.set(x, "renderDeviceDriver", value.asInstanceOf[js.Any])
    
    inline def setRenderDeviceDriverNull: Self = StObject.set(x, "renderDeviceDriver", null)
    
    inline def setRenderDeviceDriverUndefined: Self = StObject.set(x, "renderDeviceDriver", js.undefined)
    
    inline def setRenderDeviceName(value: NullableOption[String]): Self = StObject.set(x, "renderDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRenderDeviceNameNull: Self = StObject.set(x, "renderDeviceName", null)
    
    inline def setRenderDeviceNameUndefined: Self = StObject.set(x, "renderDeviceName", js.undefined)
    
    inline def setRenderMuteEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderMuteEventRatio", value.asInstanceOf[js.Any])
    
    inline def setRenderMuteEventRatioNull: Self = StObject.set(x, "renderMuteEventRatio", null)
    
    inline def setRenderMuteEventRatioUndefined: Self = StObject.set(x, "renderMuteEventRatio", js.undefined)
    
    inline def setRenderNotFunctioningEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    inline def setRenderNotFunctioningEventRatioNull: Self = StObject.set(x, "renderNotFunctioningEventRatio", null)
    
    inline def setRenderNotFunctioningEventRatioUndefined: Self = StObject.set(x, "renderNotFunctioningEventRatio", js.undefined)
    
    inline def setRenderZeroVolumeEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderZeroVolumeEventRatio", value.asInstanceOf[js.Any])
    
    inline def setRenderZeroVolumeEventRatioNull: Self = StObject.set(x, "renderZeroVolumeEventRatio", null)
    
    inline def setRenderZeroVolumeEventRatioUndefined: Self = StObject.set(x, "renderZeroVolumeEventRatio", js.undefined)
    
    inline def setSentNoiseLevel(value: NullableOption[Double]): Self = StObject.set(x, "sentNoiseLevel", value.asInstanceOf[js.Any])
    
    inline def setSentNoiseLevelNull: Self = StObject.set(x, "sentNoiseLevel", null)
    
    inline def setSentNoiseLevelUndefined: Self = StObject.set(x, "sentNoiseLevel", js.undefined)
    
    inline def setSentSignalLevel(value: NullableOption[Double]): Self = StObject.set(x, "sentSignalLevel", value.asInstanceOf[js.Any])
    
    inline def setSentSignalLevelNull: Self = StObject.set(x, "sentSignalLevel", null)
    
    inline def setSentSignalLevelUndefined: Self = StObject.set(x, "sentSignalLevel", js.undefined)
    
    inline def setSpeakerGlitchRate(value: NullableOption[Double]): Self = StObject.set(x, "speakerGlitchRate", value.asInstanceOf[js.Any])
    
    inline def setSpeakerGlitchRateNull: Self = StObject.set(x, "speakerGlitchRate", null)
    
    inline def setSpeakerGlitchRateUndefined: Self = StObject.set(x, "speakerGlitchRate", js.undefined)
  }
}
