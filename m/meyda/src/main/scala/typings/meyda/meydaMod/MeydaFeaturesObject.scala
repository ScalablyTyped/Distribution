package typings.meyda.meydaMod

import typings.meyda.Anon_Imag
import typings.meyda.Anon_Specific
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeydaFeaturesObject extends js.Object {
  var amplitudeSpectrum: Float32Array
  var buffer: js.Array[Double]
  var chroma: js.Array[Double]
  var complexSpectrum: Anon_Imag
  var energy: Double
  var loudness: Anon_Specific
  var mfcc: js.Array[Double]
  var perceptualSharpness: Double
  var perceptualSpread: Double
  var powerSpectrum: Float32Array
  var rms: Double
  var spectralCentroid: Double
  var spectralFlatness: Double
  var spectralKurtosis: Double
  var spectralRolloff: Double
  var spectralSkewness: Double
  var spectralSlope: Double
  var spectralSpread: Double
  var zcr: Double
}

object MeydaFeaturesObject {
  @scala.inline
  def apply(
    amplitudeSpectrum: Float32Array,
    buffer: js.Array[Double],
    chroma: js.Array[Double],
    complexSpectrum: Anon_Imag,
    energy: Double,
    loudness: Anon_Specific,
    mfcc: js.Array[Double],
    perceptualSharpness: Double,
    perceptualSpread: Double,
    powerSpectrum: Float32Array,
    rms: Double,
    spectralCentroid: Double,
    spectralFlatness: Double,
    spectralKurtosis: Double,
    spectralRolloff: Double,
    spectralSkewness: Double,
    spectralSlope: Double,
    spectralSpread: Double,
    zcr: Double
  ): MeydaFeaturesObject = {
    val __obj = js.Dynamic.literal(amplitudeSpectrum = amplitudeSpectrum.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], chroma = chroma.asInstanceOf[js.Any], complexSpectrum = complexSpectrum.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mfcc = mfcc.asInstanceOf[js.Any], perceptualSharpness = perceptualSharpness.asInstanceOf[js.Any], perceptualSpread = perceptualSpread.asInstanceOf[js.Any], powerSpectrum = powerSpectrum.asInstanceOf[js.Any], rms = rms.asInstanceOf[js.Any], spectralCentroid = spectralCentroid.asInstanceOf[js.Any], spectralFlatness = spectralFlatness.asInstanceOf[js.Any], spectralKurtosis = spectralKurtosis.asInstanceOf[js.Any], spectralRolloff = spectralRolloff.asInstanceOf[js.Any], spectralSkewness = spectralSkewness.asInstanceOf[js.Any], spectralSlope = spectralSlope.asInstanceOf[js.Any], spectralSpread = spectralSpread.asInstanceOf[js.Any], zcr = zcr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeydaFeaturesObject]
  }
}

