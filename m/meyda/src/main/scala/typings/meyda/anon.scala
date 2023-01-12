package typings.meyda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imag extends StObject {
    
    var imag: js.Array[Double]
    
    var real: js.Array[Double]
  }
  object Imag {
    
    inline def apply(imag: js.Array[Double], real: js.Array[Double]): Imag = {
      val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imag] (val x: Self) extends AnyVal {
      
      inline def setImag(value: js.Array[Double]): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
      
      inline def setImagVarargs(value: Double*): Self = StObject.set(x, "imag", js.Array(value*))
      
      inline def setReal(value: js.Array[Double]): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
      
      inline def setRealVarargs(value: Double*): Self = StObject.set(x, "real", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
  trait PartialMeydaFeaturesObjec extends StObject {
    
    var amplitudeSpectrum: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    var buffer: js.UndefOr[js.Array[Double]] = js.undefined
    
    var chroma: js.UndefOr[js.Array[Double]] = js.undefined
    
    var complexSpectrum: js.UndefOr[Imag] = js.undefined
    
    var energy: js.UndefOr[Double] = js.undefined
    
    var loudness: js.UndefOr[Specific] = js.undefined
    
    var mfcc: js.UndefOr[js.Array[Double]] = js.undefined
    
    var perceptualSharpness: js.UndefOr[Double] = js.undefined
    
    var perceptualSpread: js.UndefOr[Double] = js.undefined
    
    var powerSpectrum: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
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
    
    inline def apply(): PartialMeydaFeaturesObjec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMeydaFeaturesObjec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMeydaFeaturesObjec] (val x: Self) extends AnyVal {
      
      inline def setAmplitudeSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "amplitudeSpectrum", value.asInstanceOf[js.Any])
      
      inline def setAmplitudeSpectrumUndefined: Self = StObject.set(x, "amplitudeSpectrum", js.undefined)
      
      inline def setBuffer(value: js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setChroma(value: js.Array[Double]): Self = StObject.set(x, "chroma", value.asInstanceOf[js.Any])
      
      inline def setChromaUndefined: Self = StObject.set(x, "chroma", js.undefined)
      
      inline def setChromaVarargs(value: Double*): Self = StObject.set(x, "chroma", js.Array(value*))
      
      inline def setComplexSpectrum(value: Imag): Self = StObject.set(x, "complexSpectrum", value.asInstanceOf[js.Any])
      
      inline def setComplexSpectrumUndefined: Self = StObject.set(x, "complexSpectrum", js.undefined)
      
      inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
      
      inline def setEnergyUndefined: Self = StObject.set(x, "energy", js.undefined)
      
      inline def setLoudness(value: Specific): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
      
      inline def setLoudnessUndefined: Self = StObject.set(x, "loudness", js.undefined)
      
      inline def setMfcc(value: js.Array[Double]): Self = StObject.set(x, "mfcc", value.asInstanceOf[js.Any])
      
      inline def setMfccUndefined: Self = StObject.set(x, "mfcc", js.undefined)
      
      inline def setMfccVarargs(value: Double*): Self = StObject.set(x, "mfcc", js.Array(value*))
      
      inline def setPerceptualSharpness(value: Double): Self = StObject.set(x, "perceptualSharpness", value.asInstanceOf[js.Any])
      
      inline def setPerceptualSharpnessUndefined: Self = StObject.set(x, "perceptualSharpness", js.undefined)
      
      inline def setPerceptualSpread(value: Double): Self = StObject.set(x, "perceptualSpread", value.asInstanceOf[js.Any])
      
      inline def setPerceptualSpreadUndefined: Self = StObject.set(x, "perceptualSpread", js.undefined)
      
      inline def setPowerSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "powerSpectrum", value.asInstanceOf[js.Any])
      
      inline def setPowerSpectrumUndefined: Self = StObject.set(x, "powerSpectrum", js.undefined)
      
      inline def setRms(value: Double): Self = StObject.set(x, "rms", value.asInstanceOf[js.Any])
      
      inline def setRmsUndefined: Self = StObject.set(x, "rms", js.undefined)
      
      inline def setSpectralCentroid(value: Double): Self = StObject.set(x, "spectralCentroid", value.asInstanceOf[js.Any])
      
      inline def setSpectralCentroidUndefined: Self = StObject.set(x, "spectralCentroid", js.undefined)
      
      inline def setSpectralFlatness(value: Double): Self = StObject.set(x, "spectralFlatness", value.asInstanceOf[js.Any])
      
      inline def setSpectralFlatnessUndefined: Self = StObject.set(x, "spectralFlatness", js.undefined)
      
      inline def setSpectralKurtosis(value: Double): Self = StObject.set(x, "spectralKurtosis", value.asInstanceOf[js.Any])
      
      inline def setSpectralKurtosisUndefined: Self = StObject.set(x, "spectralKurtosis", js.undefined)
      
      inline def setSpectralRolloff(value: Double): Self = StObject.set(x, "spectralRolloff", value.asInstanceOf[js.Any])
      
      inline def setSpectralRolloffUndefined: Self = StObject.set(x, "spectralRolloff", js.undefined)
      
      inline def setSpectralSkewness(value: Double): Self = StObject.set(x, "spectralSkewness", value.asInstanceOf[js.Any])
      
      inline def setSpectralSkewnessUndefined: Self = StObject.set(x, "spectralSkewness", js.undefined)
      
      inline def setSpectralSlope(value: Double): Self = StObject.set(x, "spectralSlope", value.asInstanceOf[js.Any])
      
      inline def setSpectralSlopeUndefined: Self = StObject.set(x, "spectralSlope", js.undefined)
      
      inline def setSpectralSpread(value: Double): Self = StObject.set(x, "spectralSpread", value.asInstanceOf[js.Any])
      
      inline def setSpectralSpreadUndefined: Self = StObject.set(x, "spectralSpread", js.undefined)
      
      inline def setZcr(value: Double): Self = StObject.set(x, "zcr", value.asInstanceOf[js.Any])
      
      inline def setZcrUndefined: Self = StObject.set(x, "zcr", js.undefined)
    }
  }
  
  trait Specific extends StObject {
    
    var specific: js.typedarray.Float32Array
    
    var total: Double
  }
  object Specific {
    
    inline def apply(specific: js.typedarray.Float32Array, total: Double): Specific = {
      val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specific]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Specific] (val x: Self) extends AnyVal {
      
      inline def setSpecific(value: js.typedarray.Float32Array): Self = StObject.set(x, "specific", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
