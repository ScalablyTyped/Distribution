package typings.meyda.mod

import typings.meyda.anon.PartialMeydaFeaturesObjec
import typings.std.AudioContext
import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeydaAnalyzerOptions extends js.Object {
  
  var audioContext: AudioContext = js.native
  
  var bufferSize: Double = js.native
  
  var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.native
  
  var channel: js.UndefOr[Double] = js.native
  
  var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.native
  
  var hopSize: js.UndefOr[Double] = js.native
  
  var inputs: js.UndefOr[Double] = js.native
  
  var numberOfMFCCCoefficients: js.UndefOr[Double] = js.native
  
  var outputs: js.UndefOr[Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var source: AudioNode = js.native
  
  var startImmediately: js.UndefOr[Boolean] = js.native
  
  var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.native
}
object MeydaAnalyzerOptions {
  
  @scala.inline
  def apply(audioContext: AudioContext, bufferSize: Double, source: AudioNode): MeydaAnalyzerOptions = {
    val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaAnalyzerOptions]
  }
  
  @scala.inline
  implicit class MeydaAnalyzerOptionsOps[Self <: MeydaAnalyzerOptions] (val x: Self) extends AnyVal {
    
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
    def setAudioContext(value: AudioContext): Self = this.set("audioContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: AudioNode): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: /* features */ PartialMeydaFeaturesObjec => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setFeatureExtractorsVarargs(value: MeydaAudioFeature*): Self = this.set("featureExtractors", js.Array(value :_*))
    
    @scala.inline
    def setFeatureExtractors(value: MeydaAudioFeature | js.Array[MeydaAudioFeature]): Self = this.set("featureExtractors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureExtractors: Self = this.set("featureExtractors", js.undefined)
    
    @scala.inline
    def setHopSize(value: Double): Self = this.set("hopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHopSize: Self = this.set("hopSize", js.undefined)
    
    @scala.inline
    def setInputs(value: Double): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setNumberOfMFCCCoefficients(value: Double): Self = this.set("numberOfMFCCCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMFCCCoefficients: Self = this.set("numberOfMFCCCoefficients", js.undefined)
    
    @scala.inline
    def setOutputs(value: Double): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setStartImmediately(value: Boolean): Self = this.set("startImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartImmediately: Self = this.set("startImmediately", js.undefined)
    
    @scala.inline
    def setWindowingFunction(value: MeydaWindowingFunction): Self = this.set("windowingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowingFunction: Self = this.set("windowingFunction", js.undefined)
  }
}
