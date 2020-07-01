package typings.meyda.mod

import typings.meyda.anon.PartialMeydaFeaturesObjec
import typings.std.AudioContext
import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeydaAnalyzerOptions extends js.Object {
  var audioContext: AudioContext
  var bufferSize: Double
  var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.undefined
  var channel: js.UndefOr[Double] = js.undefined
  var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.undefined
  var hopSize: js.UndefOr[Double] = js.undefined
  var inputs: js.UndefOr[Double] = js.undefined
  var numberOfMFCCCoefficients: js.UndefOr[Double] = js.undefined
  var outputs: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var source: AudioNode
  var startImmediately: js.UndefOr[Boolean] = js.undefined
  var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.undefined
}

object MeydaAnalyzerOptions {
  @scala.inline
  def apply(
    audioContext: AudioContext,
    bufferSize: Double,
    source: AudioNode,
    callback: /* features */ PartialMeydaFeaturesObjec => Unit = null,
    channel: js.UndefOr[Double] = js.undefined,
    featureExtractors: MeydaAudioFeature | js.Array[MeydaAudioFeature] = null,
    hopSize: js.UndefOr[Double] = js.undefined,
    inputs: js.UndefOr[Double] = js.undefined,
    numberOfMFCCCoefficients: js.UndefOr[Double] = js.undefined,
    outputs: js.UndefOr[Double] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined,
    startImmediately: js.UndefOr[Boolean] = js.undefined,
    windowingFunction: MeydaWindowingFunction = null
  ): MeydaAnalyzerOptions = {
    val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.get.asInstanceOf[js.Any])
    if (featureExtractors != null) __obj.updateDynamic("featureExtractors")(featureExtractors.asInstanceOf[js.Any])
    if (!js.isUndefined(hopSize)) __obj.updateDynamic("hopSize")(hopSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputs)) __obj.updateDynamic("inputs")(inputs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfMFCCCoefficients)) __obj.updateDynamic("numberOfMFCCCoefficients")(numberOfMFCCCoefficients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputs)) __obj.updateDynamic("outputs")(outputs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startImmediately)) __obj.updateDynamic("startImmediately")(startImmediately.get.asInstanceOf[js.Any])
    if (windowingFunction != null) __obj.updateDynamic("windowingFunction")(windowingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaAnalyzerOptions]
  }
}

