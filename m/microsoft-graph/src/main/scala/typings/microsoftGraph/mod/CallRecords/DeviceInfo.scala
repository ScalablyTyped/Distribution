package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInfo extends js.Object {
  
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
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptureDeviceDriver(value: NullableOption[String]): Self = this.set("captureDeviceDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureDeviceDriver: Self = this.set("captureDeviceDriver", js.undefined)
    
    @scala.inline
    def setCaptureDeviceDriverNull: Self = this.set("captureDeviceDriver", null)
    
    @scala.inline
    def setCaptureDeviceName(value: NullableOption[String]): Self = this.set("captureDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureDeviceName: Self = this.set("captureDeviceName", js.undefined)
    
    @scala.inline
    def setCaptureDeviceNameNull: Self = this.set("captureDeviceName", null)
    
    @scala.inline
    def setCaptureNotFunctioningEventRatio(value: NullableOption[Double]): Self = this.set("captureNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureNotFunctioningEventRatio: Self = this.set("captureNotFunctioningEventRatio", js.undefined)
    
    @scala.inline
    def setCaptureNotFunctioningEventRatioNull: Self = this.set("captureNotFunctioningEventRatio", null)
    
    @scala.inline
    def setCpuInsufficentEventRatio(value: NullableOption[Double]): Self = this.set("cpuInsufficentEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuInsufficentEventRatio: Self = this.set("cpuInsufficentEventRatio", js.undefined)
    
    @scala.inline
    def setCpuInsufficentEventRatioNull: Self = this.set("cpuInsufficentEventRatio", null)
    
    @scala.inline
    def setDeviceClippingEventRatio(value: NullableOption[Double]): Self = this.set("deviceClippingEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceClippingEventRatio: Self = this.set("deviceClippingEventRatio", js.undefined)
    
    @scala.inline
    def setDeviceClippingEventRatioNull: Self = this.set("deviceClippingEventRatio", null)
    
    @scala.inline
    def setDeviceGlitchEventRatio(value: NullableOption[Double]): Self = this.set("deviceGlitchEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceGlitchEventRatio: Self = this.set("deviceGlitchEventRatio", js.undefined)
    
    @scala.inline
    def setDeviceGlitchEventRatioNull: Self = this.set("deviceGlitchEventRatio", null)
    
    @scala.inline
    def setHowlingEventCount(value: NullableOption[Double]): Self = this.set("howlingEventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHowlingEventCount: Self = this.set("howlingEventCount", js.undefined)
    
    @scala.inline
    def setHowlingEventCountNull: Self = this.set("howlingEventCount", null)
    
    @scala.inline
    def setInitialSignalLevelRootMeanSquare(value: NullableOption[Double]): Self = this.set("initialSignalLevelRootMeanSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSignalLevelRootMeanSquare: Self = this.set("initialSignalLevelRootMeanSquare", js.undefined)
    
    @scala.inline
    def setInitialSignalLevelRootMeanSquareNull: Self = this.set("initialSignalLevelRootMeanSquare", null)
    
    @scala.inline
    def setLowSpeechLevelEventRatio(value: NullableOption[Double]): Self = this.set("lowSpeechLevelEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowSpeechLevelEventRatio: Self = this.set("lowSpeechLevelEventRatio", js.undefined)
    
    @scala.inline
    def setLowSpeechLevelEventRatioNull: Self = this.set("lowSpeechLevelEventRatio", null)
    
    @scala.inline
    def setLowSpeechToNoiseEventRatio(value: NullableOption[Double]): Self = this.set("lowSpeechToNoiseEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowSpeechToNoiseEventRatio: Self = this.set("lowSpeechToNoiseEventRatio", js.undefined)
    
    @scala.inline
    def setLowSpeechToNoiseEventRatioNull: Self = this.set("lowSpeechToNoiseEventRatio", null)
    
    @scala.inline
    def setMicGlitchRate(value: NullableOption[Double]): Self = this.set("micGlitchRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicGlitchRate: Self = this.set("micGlitchRate", js.undefined)
    
    @scala.inline
    def setMicGlitchRateNull: Self = this.set("micGlitchRate", null)
    
    @scala.inline
    def setReceivedNoiseLevel(value: NullableOption[Double]): Self = this.set("receivedNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedNoiseLevel: Self = this.set("receivedNoiseLevel", js.undefined)
    
    @scala.inline
    def setReceivedNoiseLevelNull: Self = this.set("receivedNoiseLevel", null)
    
    @scala.inline
    def setReceivedSignalLevel(value: NullableOption[Double]): Self = this.set("receivedSignalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedSignalLevel: Self = this.set("receivedSignalLevel", js.undefined)
    
    @scala.inline
    def setReceivedSignalLevelNull: Self = this.set("receivedSignalLevel", null)
    
    @scala.inline
    def setRenderDeviceDriver(value: NullableOption[String]): Self = this.set("renderDeviceDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDeviceDriver: Self = this.set("renderDeviceDriver", js.undefined)
    
    @scala.inline
    def setRenderDeviceDriverNull: Self = this.set("renderDeviceDriver", null)
    
    @scala.inline
    def setRenderDeviceName(value: NullableOption[String]): Self = this.set("renderDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDeviceName: Self = this.set("renderDeviceName", js.undefined)
    
    @scala.inline
    def setRenderDeviceNameNull: Self = this.set("renderDeviceName", null)
    
    @scala.inline
    def setRenderMuteEventRatio(value: NullableOption[Double]): Self = this.set("renderMuteEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMuteEventRatio: Self = this.set("renderMuteEventRatio", js.undefined)
    
    @scala.inline
    def setRenderMuteEventRatioNull: Self = this.set("renderMuteEventRatio", null)
    
    @scala.inline
    def setRenderNotFunctioningEventRatio(value: NullableOption[Double]): Self = this.set("renderNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderNotFunctioningEventRatio: Self = this.set("renderNotFunctioningEventRatio", js.undefined)
    
    @scala.inline
    def setRenderNotFunctioningEventRatioNull: Self = this.set("renderNotFunctioningEventRatio", null)
    
    @scala.inline
    def setRenderZeroVolumeEventRatio(value: NullableOption[Double]): Self = this.set("renderZeroVolumeEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderZeroVolumeEventRatio: Self = this.set("renderZeroVolumeEventRatio", js.undefined)
    
    @scala.inline
    def setRenderZeroVolumeEventRatioNull: Self = this.set("renderZeroVolumeEventRatio", null)
    
    @scala.inline
    def setSentNoiseLevel(value: NullableOption[Double]): Self = this.set("sentNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentNoiseLevel: Self = this.set("sentNoiseLevel", js.undefined)
    
    @scala.inline
    def setSentNoiseLevelNull: Self = this.set("sentNoiseLevel", null)
    
    @scala.inline
    def setSentSignalLevel(value: NullableOption[Double]): Self = this.set("sentSignalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentSignalLevel: Self = this.set("sentSignalLevel", js.undefined)
    
    @scala.inline
    def setSentSignalLevelNull: Self = this.set("sentSignalLevel", null)
    
    @scala.inline
    def setSpeakerGlitchRate(value: NullableOption[Double]): Self = this.set("speakerGlitchRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakerGlitchRate: Self = this.set("speakerGlitchRate", js.undefined)
    
    @scala.inline
    def setSpeakerGlitchRateNull: Self = this.set("speakerGlitchRate", null)
  }
}
