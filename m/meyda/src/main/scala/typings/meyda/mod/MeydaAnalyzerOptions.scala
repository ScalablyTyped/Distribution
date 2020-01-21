package typings.meyda.mod

import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeydaAnalyzerOptions extends js.Object {
  var audioContext: AudioContext
  var bufferSize: Double
  var callback: js.UndefOr[js.Function1[/* features */ Partial[MeydaFeaturesObject], Unit]] = js.undefined
  var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.undefined
  var hopSize: js.UndefOr[Double] = js.undefined
  var numberOfMFCCCoefficients: js.UndefOr[Double] = js.undefined
  var source: AudioNode
  var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.undefined
}

object MeydaAnalyzerOptions {
  @scala.inline
  def apply(
    audioContext: AudioContext,
    bufferSize: Double,
    source: AudioNode,
    callback: /* features */ Partial[MeydaFeaturesObject] => Unit = null,
    featureExtractors: MeydaAudioFeature | js.Array[MeydaAudioFeature] = null,
    hopSize: Int | Double = null,
    numberOfMFCCCoefficients: Int | Double = null,
    windowingFunction: MeydaWindowingFunction = null
  ): MeydaAnalyzerOptions = {
    val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (featureExtractors != null) __obj.updateDynamic("featureExtractors")(featureExtractors.asInstanceOf[js.Any])
    if (hopSize != null) __obj.updateDynamic("hopSize")(hopSize.asInstanceOf[js.Any])
    if (numberOfMFCCCoefficients != null) __obj.updateDynamic("numberOfMFCCCoefficients")(numberOfMFCCCoefficients.asInstanceOf[js.Any])
    if (windowingFunction != null) __obj.updateDynamic("windowingFunction")(windowingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaAnalyzerOptions]
  }
}

