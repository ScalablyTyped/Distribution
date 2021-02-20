package typings.meyda

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Imag extends StObject {
    
    var imag: js.Array[Double] = js.native
    
    var real: js.Array[Double] = js.native
  }
  object Imag {
    
    @scala.inline
    def apply(imag: js.Array[Double], real: js.Array[Double]): Imag = {
      val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imag]
    }
    
    @scala.inline
    implicit class ImagMutableBuilder[Self <: Imag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImag(value: js.Array[Double]): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagVarargs(value: Double*): Self = StObject.set(x, "imag", js.Array(value :_*))
      
      @scala.inline
      def setReal(value: js.Array[Double]): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealVarargs(value: Double*): Self = StObject.set(x, "real", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
  @js.native
  trait PartialMeydaFeaturesObjec extends StObject {
    
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
    implicit class PartialMeydaFeaturesObjecMutableBuilder[Self <: PartialMeydaFeaturesObjec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmplitudeSpectrum(value: Float32Array): Self = StObject.set(x, "amplitudeSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplitudeSpectrumUndefined: Self = StObject.set(x, "amplitudeSpectrum", js.undefined)
      
      @scala.inline
      def setBuffer(value: js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value :_*))
      
      @scala.inline
      def setChroma(value: js.Array[Double]): Self = StObject.set(x, "chroma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromaUndefined: Self = StObject.set(x, "chroma", js.undefined)
      
      @scala.inline
      def setChromaVarargs(value: Double*): Self = StObject.set(x, "chroma", js.Array(value :_*))
      
      @scala.inline
      def setComplexSpectrum(value: Imag): Self = StObject.set(x, "complexSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexSpectrumUndefined: Self = StObject.set(x, "complexSpectrum", js.undefined)
      
      @scala.inline
      def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnergyUndefined: Self = StObject.set(x, "energy", js.undefined)
      
      @scala.inline
      def setLoudness(value: Specific): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoudnessUndefined: Self = StObject.set(x, "loudness", js.undefined)
      
      @scala.inline
      def setMfcc(value: js.Array[Double]): Self = StObject.set(x, "mfcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfccUndefined: Self = StObject.set(x, "mfcc", js.undefined)
      
      @scala.inline
      def setMfccVarargs(value: Double*): Self = StObject.set(x, "mfcc", js.Array(value :_*))
      
      @scala.inline
      def setPerceptualSharpness(value: Double): Self = StObject.set(x, "perceptualSharpness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerceptualSharpnessUndefined: Self = StObject.set(x, "perceptualSharpness", js.undefined)
      
      @scala.inline
      def setPerceptualSpread(value: Double): Self = StObject.set(x, "perceptualSpread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerceptualSpreadUndefined: Self = StObject.set(x, "perceptualSpread", js.undefined)
      
      @scala.inline
      def setPowerSpectrum(value: Float32Array): Self = StObject.set(x, "powerSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerSpectrumUndefined: Self = StObject.set(x, "powerSpectrum", js.undefined)
      
      @scala.inline
      def setRms(value: Double): Self = StObject.set(x, "rms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmsUndefined: Self = StObject.set(x, "rms", js.undefined)
      
      @scala.inline
      def setSpectralCentroid(value: Double): Self = StObject.set(x, "spectralCentroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralCentroidUndefined: Self = StObject.set(x, "spectralCentroid", js.undefined)
      
      @scala.inline
      def setSpectralFlatness(value: Double): Self = StObject.set(x, "spectralFlatness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralFlatnessUndefined: Self = StObject.set(x, "spectralFlatness", js.undefined)
      
      @scala.inline
      def setSpectralKurtosis(value: Double): Self = StObject.set(x, "spectralKurtosis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralKurtosisUndefined: Self = StObject.set(x, "spectralKurtosis", js.undefined)
      
      @scala.inline
      def setSpectralRolloff(value: Double): Self = StObject.set(x, "spectralRolloff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralRolloffUndefined: Self = StObject.set(x, "spectralRolloff", js.undefined)
      
      @scala.inline
      def setSpectralSkewness(value: Double): Self = StObject.set(x, "spectralSkewness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSkewnessUndefined: Self = StObject.set(x, "spectralSkewness", js.undefined)
      
      @scala.inline
      def setSpectralSlope(value: Double): Self = StObject.set(x, "spectralSlope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSlopeUndefined: Self = StObject.set(x, "spectralSlope", js.undefined)
      
      @scala.inline
      def setSpectralSpread(value: Double): Self = StObject.set(x, "spectralSpread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSpreadUndefined: Self = StObject.set(x, "spectralSpread", js.undefined)
      
      @scala.inline
      def setZcr(value: Double): Self = StObject.set(x, "zcr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZcrUndefined: Self = StObject.set(x, "zcr", js.undefined)
    }
  }
  
  @js.native
  trait Specific extends StObject {
    
    var specific: Float32Array = js.native
    
    var total: Double = js.native
  }
  object Specific {
    
    @scala.inline
    def apply(specific: Float32Array, total: Double): Specific = {
      val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specific]
    }
    
    @scala.inline
    implicit class SpecificMutableBuilder[Self <: Specific] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpecific(value: Float32Array): Self = StObject.set(x, "specific", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
