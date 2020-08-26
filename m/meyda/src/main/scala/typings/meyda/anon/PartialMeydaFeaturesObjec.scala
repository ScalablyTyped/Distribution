package typings.meyda.anon

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
@js.native
trait PartialMeydaFeaturesObjec extends js.Object {
  var amplitudeSpectrum: js.UndefOr[Float32Array] = js.native
  var buffer: js.UndefOr[js.Array[Double]] = js.native
  var chroma: js.UndefOr[js.Array[Double]] = js.native
  var complexSpectrum: js.UndefOr[Imag] = js.native
  var energy: js.UndefOr[Double] = js.native
  var loudness: js.UndefOr[Specific] = js.native
  var mfcc: js.UndefOr[js.Array[Double]] = js.native
  var perceptualSharpness: js.UndefOr[Double] = js.native
  var perceptualSpread: js.UndefOr[Double] = js.native
  var powerSpectrum: js.UndefOr[Float32Array] = js.native
  var rms: js.UndefOr[Double] = js.native
  var spectralCentroid: js.UndefOr[Double] = js.native
  var spectralFlatness: js.UndefOr[Double] = js.native
  var spectralKurtosis: js.UndefOr[Double] = js.native
  var spectralRolloff: js.UndefOr[Double] = js.native
  var spectralSkewness: js.UndefOr[Double] = js.native
  var spectralSlope: js.UndefOr[Double] = js.native
  var spectralSpread: js.UndefOr[Double] = js.native
  var zcr: js.UndefOr[Double] = js.native
}

object PartialMeydaFeaturesObjec {
  @scala.inline
  def apply(): PartialMeydaFeaturesObjec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMeydaFeaturesObjec]
  }
  @scala.inline
  implicit class PartialMeydaFeaturesObjecOps[Self <: PartialMeydaFeaturesObjec] (val x: Self) extends AnyVal {
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
    def setAmplitudeSpectrum(value: Float32Array): Self = this.set("amplitudeSpectrum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmplitudeSpectrum: Self = this.set("amplitudeSpectrum", js.undefined)
    @scala.inline
    def setBufferVarargs(value: Double*): Self = this.set("buffer", js.Array(value :_*))
    @scala.inline
    def setBuffer(value: js.Array[Double]): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setChromaVarargs(value: Double*): Self = this.set("chroma", js.Array(value :_*))
    @scala.inline
    def setChroma(value: js.Array[Double]): Self = this.set("chroma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChroma: Self = this.set("chroma", js.undefined)
    @scala.inline
    def setComplexSpectrum(value: Imag): Self = this.set("complexSpectrum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplexSpectrum: Self = this.set("complexSpectrum", js.undefined)
    @scala.inline
    def setEnergy(value: Double): Self = this.set("energy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnergy: Self = this.set("energy", js.undefined)
    @scala.inline
    def setLoudness(value: Specific): Self = this.set("loudness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoudness: Self = this.set("loudness", js.undefined)
    @scala.inline
    def setMfccVarargs(value: Double*): Self = this.set("mfcc", js.Array(value :_*))
    @scala.inline
    def setMfcc(value: js.Array[Double]): Self = this.set("mfcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfcc: Self = this.set("mfcc", js.undefined)
    @scala.inline
    def setPerceptualSharpness(value: Double): Self = this.set("perceptualSharpness", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerceptualSharpness: Self = this.set("perceptualSharpness", js.undefined)
    @scala.inline
    def setPerceptualSpread(value: Double): Self = this.set("perceptualSpread", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerceptualSpread: Self = this.set("perceptualSpread", js.undefined)
    @scala.inline
    def setPowerSpectrum(value: Float32Array): Self = this.set("powerSpectrum", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowerSpectrum: Self = this.set("powerSpectrum", js.undefined)
    @scala.inline
    def setRms(value: Double): Self = this.set("rms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRms: Self = this.set("rms", js.undefined)
    @scala.inline
    def setSpectralCentroid(value: Double): Self = this.set("spectralCentroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralCentroid: Self = this.set("spectralCentroid", js.undefined)
    @scala.inline
    def setSpectralFlatness(value: Double): Self = this.set("spectralFlatness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralFlatness: Self = this.set("spectralFlatness", js.undefined)
    @scala.inline
    def setSpectralKurtosis(value: Double): Self = this.set("spectralKurtosis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralKurtosis: Self = this.set("spectralKurtosis", js.undefined)
    @scala.inline
    def setSpectralRolloff(value: Double): Self = this.set("spectralRolloff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralRolloff: Self = this.set("spectralRolloff", js.undefined)
    @scala.inline
    def setSpectralSkewness(value: Double): Self = this.set("spectralSkewness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralSkewness: Self = this.set("spectralSkewness", js.undefined)
    @scala.inline
    def setSpectralSlope(value: Double): Self = this.set("spectralSlope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralSlope: Self = this.set("spectralSlope", js.undefined)
    @scala.inline
    def setSpectralSpread(value: Double): Self = this.set("spectralSpread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectralSpread: Self = this.set("spectralSpread", js.undefined)
    @scala.inline
    def setZcr(value: Double): Self = this.set("zcr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZcr: Self = this.set("zcr", js.undefined)
  }
  
}

