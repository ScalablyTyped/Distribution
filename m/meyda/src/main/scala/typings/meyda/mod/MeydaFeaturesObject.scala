package typings.meyda.mod

import typings.meyda.anon.Imag
import typings.meyda.anon.Specific
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeydaFeaturesObject extends js.Object {
  
  var amplitudeSpectrum: Float32Array = js.native
  
  var buffer: js.Array[Double] = js.native
  
  var chroma: js.Array[Double] = js.native
  
  var complexSpectrum: Imag = js.native
  
  var energy: Double = js.native
  
  var loudness: Specific = js.native
  
  var mfcc: js.Array[Double] = js.native
  
  var perceptualSharpness: Double = js.native
  
  var perceptualSpread: Double = js.native
  
  var powerSpectrum: Float32Array = js.native
  
  var rms: Double = js.native
  
  var spectralCentroid: Double = js.native
  
  var spectralFlatness: Double = js.native
  
  var spectralKurtosis: Double = js.native
  
  var spectralRolloff: Double = js.native
  
  var spectralSkewness: Double = js.native
  
  var spectralSlope: Double = js.native
  
  var spectralSpread: Double = js.native
  
  var zcr: Double = js.native
}
object MeydaFeaturesObject {
  
  @scala.inline
  def apply(
    amplitudeSpectrum: Float32Array,
    buffer: js.Array[Double],
    chroma: js.Array[Double],
    complexSpectrum: Imag,
    energy: Double,
    loudness: Specific,
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
  
  @scala.inline
  implicit class MeydaFeaturesObjectOps[Self <: MeydaFeaturesObject] (val x: Self) extends AnyVal {
    
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
    def setBufferVarargs(value: Double*): Self = this.set("buffer", js.Array(value :_*))
    
    @scala.inline
    def setBuffer(value: js.Array[Double]): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromaVarargs(value: Double*): Self = this.set("chroma", js.Array(value :_*))
    
    @scala.inline
    def setChroma(value: js.Array[Double]): Self = this.set("chroma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexSpectrum(value: Imag): Self = this.set("complexSpectrum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergy(value: Double): Self = this.set("energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoudness(value: Specific): Self = this.set("loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfccVarargs(value: Double*): Self = this.set("mfcc", js.Array(value :_*))
    
    @scala.inline
    def setMfcc(value: js.Array[Double]): Self = this.set("mfcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerceptualSharpness(value: Double): Self = this.set("perceptualSharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerceptualSpread(value: Double): Self = this.set("perceptualSpread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSpectrum(value: Float32Array): Self = this.set("powerSpectrum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRms(value: Double): Self = this.set("rms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralCentroid(value: Double): Self = this.set("spectralCentroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralFlatness(value: Double): Self = this.set("spectralFlatness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralKurtosis(value: Double): Self = this.set("spectralKurtosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralRolloff(value: Double): Self = this.set("spectralRolloff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralSkewness(value: Double): Self = this.set("spectralSkewness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralSlope(value: Double): Self = this.set("spectralSlope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectralSpread(value: Double): Self = this.set("spectralSpread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZcr(value: Double): Self = this.set("zcr", value.asInstanceOf[js.Any])
  }
}
