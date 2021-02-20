package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInfo extends StObject {
  
  // Name of the capture device driver used by the media endpoint.
  var captureDeviceDriver: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the capture device used by the media endpoint.
  var captureDeviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Fraction of the call that the media endpoint detected the capture device was not working properly.
  var captureNotFunctioningEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor
    * quality of the audio sent and received.
    */
  var cpuInsufficentEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the
    * audio being sent.
    */
  var deviceClippingEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor
    * quality of the audio being sent or received.
    */
  var deviceGlitchEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of times during the call that the media endpoint detected howling or screeching audio.
  var howlingEventCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
  var initialSignalLevelRootMeanSquare: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being
    * sent.
    */
  var lowSpeechLevelEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio
    * being sent.
    */
  var lowSpeechToNoiseEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // Glitches per 5 minute interval for the media endpoint's microphone.
  var micGlitchRate: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media
    * endpoint.
    */
  var receivedNoiseLevel: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the
    * media endpoint.
    */
  var receivedSignalLevel: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the render device driver used by the media endpoint.
  var renderDeviceDriver: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the render device used by the media endpoint.
  var renderDeviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Fraction of the call that media endpoint detected device render is muted.
  var renderMuteEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // Fraction of the call that the media endpoint detected the render device was not working properly.
  var renderNotFunctioningEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // Fraction of the call that media endpoint detected device render volume is set to 0.
  var renderZeroVolumeEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media
    * endpoint.
    */
  var sentNoiseLevel: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media
    * endpoint.
    */
  var sentSignalLevel: js.UndefOr[NullableOption[Double]] = js.native
  
  // Glitches per 5 minute internal for the media endpoint's loudspeaker.
  var speakerGlitchRate: js.UndefOr[NullableOption[Double]] = js.native
}
object DeviceInfo {
  
  @scala.inline
  def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInfo]
  }
  
  @scala.inline
  implicit class DeviceInfoMutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureDeviceDriver(value: NullableOption[String]): Self = StObject.set(x, "captureDeviceDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureDeviceDriverNull: Self = StObject.set(x, "captureDeviceDriver", null)
    
    @scala.inline
    def setCaptureDeviceDriverUndefined: Self = StObject.set(x, "captureDeviceDriver", js.undefined)
    
    @scala.inline
    def setCaptureDeviceName(value: NullableOption[String]): Self = StObject.set(x, "captureDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureDeviceNameNull: Self = StObject.set(x, "captureDeviceName", null)
    
    @scala.inline
    def setCaptureDeviceNameUndefined: Self = StObject.set(x, "captureDeviceName", js.undefined)
    
    @scala.inline
    def setCaptureNotFunctioningEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "captureNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureNotFunctioningEventRatioNull: Self = StObject.set(x, "captureNotFunctioningEventRatio", null)
    
    @scala.inline
    def setCaptureNotFunctioningEventRatioUndefined: Self = StObject.set(x, "captureNotFunctioningEventRatio", js.undefined)
    
    @scala.inline
    def setCpuInsufficentEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "cpuInsufficentEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuInsufficentEventRatioNull: Self = StObject.set(x, "cpuInsufficentEventRatio", null)
    
    @scala.inline
    def setCpuInsufficentEventRatioUndefined: Self = StObject.set(x, "cpuInsufficentEventRatio", js.undefined)
    
    @scala.inline
    def setDeviceClippingEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "deviceClippingEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceClippingEventRatioNull: Self = StObject.set(x, "deviceClippingEventRatio", null)
    
    @scala.inline
    def setDeviceClippingEventRatioUndefined: Self = StObject.set(x, "deviceClippingEventRatio", js.undefined)
    
    @scala.inline
    def setDeviceGlitchEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "deviceGlitchEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceGlitchEventRatioNull: Self = StObject.set(x, "deviceGlitchEventRatio", null)
    
    @scala.inline
    def setDeviceGlitchEventRatioUndefined: Self = StObject.set(x, "deviceGlitchEventRatio", js.undefined)
    
    @scala.inline
    def setHowlingEventCount(value: NullableOption[Double]): Self = StObject.set(x, "howlingEventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHowlingEventCountNull: Self = StObject.set(x, "howlingEventCount", null)
    
    @scala.inline
    def setHowlingEventCountUndefined: Self = StObject.set(x, "howlingEventCount", js.undefined)
    
    @scala.inline
    def setInitialSignalLevelRootMeanSquare(value: NullableOption[Double]): Self = StObject.set(x, "initialSignalLevelRootMeanSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSignalLevelRootMeanSquareNull: Self = StObject.set(x, "initialSignalLevelRootMeanSquare", null)
    
    @scala.inline
    def setInitialSignalLevelRootMeanSquareUndefined: Self = StObject.set(x, "initialSignalLevelRootMeanSquare", js.undefined)
    
    @scala.inline
    def setLowSpeechLevelEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "lowSpeechLevelEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowSpeechLevelEventRatioNull: Self = StObject.set(x, "lowSpeechLevelEventRatio", null)
    
    @scala.inline
    def setLowSpeechLevelEventRatioUndefined: Self = StObject.set(x, "lowSpeechLevelEventRatio", js.undefined)
    
    @scala.inline
    def setLowSpeechToNoiseEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "lowSpeechToNoiseEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowSpeechToNoiseEventRatioNull: Self = StObject.set(x, "lowSpeechToNoiseEventRatio", null)
    
    @scala.inline
    def setLowSpeechToNoiseEventRatioUndefined: Self = StObject.set(x, "lowSpeechToNoiseEventRatio", js.undefined)
    
    @scala.inline
    def setMicGlitchRate(value: NullableOption[Double]): Self = StObject.set(x, "micGlitchRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicGlitchRateNull: Self = StObject.set(x, "micGlitchRate", null)
    
    @scala.inline
    def setMicGlitchRateUndefined: Self = StObject.set(x, "micGlitchRate", js.undefined)
    
    @scala.inline
    def setReceivedNoiseLevel(value: NullableOption[Double]): Self = StObject.set(x, "receivedNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedNoiseLevelNull: Self = StObject.set(x, "receivedNoiseLevel", null)
    
    @scala.inline
    def setReceivedNoiseLevelUndefined: Self = StObject.set(x, "receivedNoiseLevel", js.undefined)
    
    @scala.inline
    def setReceivedSignalLevel(value: NullableOption[Double]): Self = StObject.set(x, "receivedSignalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedSignalLevelNull: Self = StObject.set(x, "receivedSignalLevel", null)
    
    @scala.inline
    def setReceivedSignalLevelUndefined: Self = StObject.set(x, "receivedSignalLevel", js.undefined)
    
    @scala.inline
    def setRenderDeviceDriver(value: NullableOption[String]): Self = StObject.set(x, "renderDeviceDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDeviceDriverNull: Self = StObject.set(x, "renderDeviceDriver", null)
    
    @scala.inline
    def setRenderDeviceDriverUndefined: Self = StObject.set(x, "renderDeviceDriver", js.undefined)
    
    @scala.inline
    def setRenderDeviceName(value: NullableOption[String]): Self = StObject.set(x, "renderDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDeviceNameNull: Self = StObject.set(x, "renderDeviceName", null)
    
    @scala.inline
    def setRenderDeviceNameUndefined: Self = StObject.set(x, "renderDeviceName", js.undefined)
    
    @scala.inline
    def setRenderMuteEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderMuteEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMuteEventRatioNull: Self = StObject.set(x, "renderMuteEventRatio", null)
    
    @scala.inline
    def setRenderMuteEventRatioUndefined: Self = StObject.set(x, "renderMuteEventRatio", js.undefined)
    
    @scala.inline
    def setRenderNotFunctioningEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderNotFunctioningEventRatioNull: Self = StObject.set(x, "renderNotFunctioningEventRatio", null)
    
    @scala.inline
    def setRenderNotFunctioningEventRatioUndefined: Self = StObject.set(x, "renderNotFunctioningEventRatio", js.undefined)
    
    @scala.inline
    def setRenderZeroVolumeEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "renderZeroVolumeEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderZeroVolumeEventRatioNull: Self = StObject.set(x, "renderZeroVolumeEventRatio", null)
    
    @scala.inline
    def setRenderZeroVolumeEventRatioUndefined: Self = StObject.set(x, "renderZeroVolumeEventRatio", js.undefined)
    
    @scala.inline
    def setSentNoiseLevel(value: NullableOption[Double]): Self = StObject.set(x, "sentNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentNoiseLevelNull: Self = StObject.set(x, "sentNoiseLevel", null)
    
    @scala.inline
    def setSentNoiseLevelUndefined: Self = StObject.set(x, "sentNoiseLevel", js.undefined)
    
    @scala.inline
    def setSentSignalLevel(value: NullableOption[Double]): Self = StObject.set(x, "sentSignalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentSignalLevelNull: Self = StObject.set(x, "sentSignalLevel", null)
    
    @scala.inline
    def setSentSignalLevelUndefined: Self = StObject.set(x, "sentSignalLevel", js.undefined)
    
    @scala.inline
    def setSpeakerGlitchRate(value: NullableOption[Double]): Self = StObject.set(x, "speakerGlitchRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerGlitchRateNull: Self = StObject.set(x, "speakerGlitchRate", null)
    
    @scala.inline
    def setSpeakerGlitchRateUndefined: Self = StObject.set(x, "speakerGlitchRate", js.undefined)
  }
}
