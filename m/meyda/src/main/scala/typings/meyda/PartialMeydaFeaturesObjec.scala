package typings.meyda

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
trait PartialMeydaFeaturesObjec extends js.Object {
  var amplitudeSpectrum: js.UndefOr[Float32Array] = js.undefined
  var buffer: js.UndefOr[js.Array[Double]] = js.undefined
  var chroma: js.UndefOr[js.Array[Double]] = js.undefined
  var complexSpectrum: js.UndefOr[AnonImag] = js.undefined
  var energy: js.UndefOr[Double] = js.undefined
  var loudness: js.UndefOr[AnonSpecific] = js.undefined
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
    complexSpectrum: AnonImag = null,
    energy: Int | Double = null,
    loudness: AnonSpecific = null,
    mfcc: js.Array[Double] = null,
    perceptualSharpness: Int | Double = null,
    perceptualSpread: Int | Double = null,
    powerSpectrum: Float32Array = null,
    rms: Int | Double = null,
    spectralCentroid: Int | Double = null,
    spectralFlatness: Int | Double = null,
    spectralKurtosis: Int | Double = null,
    spectralRolloff: Int | Double = null,
    spectralSkewness: Int | Double = null,
    spectralSlope: Int | Double = null,
    spectralSpread: Int | Double = null,
    zcr: Int | Double = null
  ): PartialMeydaFeaturesObjec = {
    val __obj = js.Dynamic.literal()
    if (amplitudeSpectrum != null) __obj.updateDynamic("amplitudeSpectrum")(amplitudeSpectrum.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (chroma != null) __obj.updateDynamic("chroma")(chroma.asInstanceOf[js.Any])
    if (complexSpectrum != null) __obj.updateDynamic("complexSpectrum")(complexSpectrum.asInstanceOf[js.Any])
    if (energy != null) __obj.updateDynamic("energy")(energy.asInstanceOf[js.Any])
    if (loudness != null) __obj.updateDynamic("loudness")(loudness.asInstanceOf[js.Any])
    if (mfcc != null) __obj.updateDynamic("mfcc")(mfcc.asInstanceOf[js.Any])
    if (perceptualSharpness != null) __obj.updateDynamic("perceptualSharpness")(perceptualSharpness.asInstanceOf[js.Any])
    if (perceptualSpread != null) __obj.updateDynamic("perceptualSpread")(perceptualSpread.asInstanceOf[js.Any])
    if (powerSpectrum != null) __obj.updateDynamic("powerSpectrum")(powerSpectrum.asInstanceOf[js.Any])
    if (rms != null) __obj.updateDynamic("rms")(rms.asInstanceOf[js.Any])
    if (spectralCentroid != null) __obj.updateDynamic("spectralCentroid")(spectralCentroid.asInstanceOf[js.Any])
    if (spectralFlatness != null) __obj.updateDynamic("spectralFlatness")(spectralFlatness.asInstanceOf[js.Any])
    if (spectralKurtosis != null) __obj.updateDynamic("spectralKurtosis")(spectralKurtosis.asInstanceOf[js.Any])
    if (spectralRolloff != null) __obj.updateDynamic("spectralRolloff")(spectralRolloff.asInstanceOf[js.Any])
    if (spectralSkewness != null) __obj.updateDynamic("spectralSkewness")(spectralSkewness.asInstanceOf[js.Any])
    if (spectralSlope != null) __obj.updateDynamic("spectralSlope")(spectralSlope.asInstanceOf[js.Any])
    if (spectralSpread != null) __obj.updateDynamic("spectralSpread")(spectralSpread.asInstanceOf[js.Any])
    if (zcr != null) __obj.updateDynamic("zcr")(zcr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMeydaFeaturesObjec]
  }
}

