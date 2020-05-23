package typings.meyda.anon

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
trait PartialMeydaFeaturesObjec extends js.Object {
  var amplitudeSpectrum: js.UndefOr[Float32Array] = js.undefined
  var buffer: js.UndefOr[js.Array[Double]] = js.undefined
  var chroma: js.UndefOr[js.Array[Double]] = js.undefined
  var complexSpectrum: js.UndefOr[Imag] = js.undefined
  var energy: js.UndefOr[Double] = js.undefined
  var loudness: js.UndefOr[Specific] = js.undefined
  var mfcc: js.UndefOr[js.Array[Double]] = js.undefined
  var perceptualSharpness: js.UndefOr[Double] = js.undefined
  var perceptualSpread: js.UndefOr[Double] = js.undefined
  var powerSpectrum: js.UndefOr[Float32Array] = js.undefined
  var rms: js.UndefOr[Double] = js.undefined
  var spectralCentroid: js.UndefOr[Double] = js.undefined
  var spectralFlatness: js.UndefOr[Double] = js.undefined
  var spectralKurtosis: js.UndefOr[Double] = js.undefined
  var spectralRolloff: js.UndefOr[Double] = js.undefined
  var spectralSkewness: js.UndefOr[Double] = js.undefined
  var spectralSlope: js.UndefOr[Double] = js.undefined
  var spectralSpread: js.UndefOr[Double] = js.undefined
  var zcr: js.UndefOr[Double] = js.undefined
}

object PartialMeydaFeaturesObjec {
  @scala.inline
  def apply(
    amplitudeSpectrum: Float32Array = null,
    buffer: js.Array[Double] = null,
    chroma: js.Array[Double] = null,
    complexSpectrum: Imag = null,
    energy: js.UndefOr[Double] = js.undefined,
    loudness: Specific = null,
    mfcc: js.Array[Double] = null,
    perceptualSharpness: js.UndefOr[Double] = js.undefined,
    perceptualSpread: js.UndefOr[Double] = js.undefined,
    powerSpectrum: Float32Array = null,
    rms: js.UndefOr[Double] = js.undefined,
    spectralCentroid: js.UndefOr[Double] = js.undefined,
    spectralFlatness: js.UndefOr[Double] = js.undefined,
    spectralKurtosis: js.UndefOr[Double] = js.undefined,
    spectralRolloff: js.UndefOr[Double] = js.undefined,
    spectralSkewness: js.UndefOr[Double] = js.undefined,
    spectralSlope: js.UndefOr[Double] = js.undefined,
    spectralSpread: js.UndefOr[Double] = js.undefined,
    zcr: js.UndefOr[Double] = js.undefined
  ): PartialMeydaFeaturesObjec = {
    val __obj = js.Dynamic.literal()
    if (amplitudeSpectrum != null) __obj.updateDynamic("amplitudeSpectrum")(amplitudeSpectrum.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (chroma != null) __obj.updateDynamic("chroma")(chroma.asInstanceOf[js.Any])
    if (complexSpectrum != null) __obj.updateDynamic("complexSpectrum")(complexSpectrum.asInstanceOf[js.Any])
    if (!js.isUndefined(energy)) __obj.updateDynamic("energy")(energy.get.asInstanceOf[js.Any])
    if (loudness != null) __obj.updateDynamic("loudness")(loudness.asInstanceOf[js.Any])
    if (mfcc != null) __obj.updateDynamic("mfcc")(mfcc.asInstanceOf[js.Any])
    if (!js.isUndefined(perceptualSharpness)) __obj.updateDynamic("perceptualSharpness")(perceptualSharpness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perceptualSpread)) __obj.updateDynamic("perceptualSpread")(perceptualSpread.get.asInstanceOf[js.Any])
    if (powerSpectrum != null) __obj.updateDynamic("powerSpectrum")(powerSpectrum.asInstanceOf[js.Any])
    if (!js.isUndefined(rms)) __obj.updateDynamic("rms")(rms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralCentroid)) __obj.updateDynamic("spectralCentroid")(spectralCentroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralFlatness)) __obj.updateDynamic("spectralFlatness")(spectralFlatness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralKurtosis)) __obj.updateDynamic("spectralKurtosis")(spectralKurtosis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralRolloff)) __obj.updateDynamic("spectralRolloff")(spectralRolloff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralSkewness)) __obj.updateDynamic("spectralSkewness")(spectralSkewness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralSlope)) __obj.updateDynamic("spectralSlope")(spectralSlope.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spectralSpread)) __obj.updateDynamic("spectralSpread")(spectralSpread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zcr)) __obj.updateDynamic("zcr")(zcr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMeydaFeaturesObjec]
  }
}

