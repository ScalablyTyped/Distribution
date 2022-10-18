package typings.next

import typings.next.EmscriptenWasm.Module
import typings.next.EmscriptenWasm.ModuleFactory
import typings.next.nextInts.`0`
import typings.next.nextInts.`1`
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshMozjpegMozjpegEncMod {
  
  @JSImport("next/dist/server/lib/squoosh/mozjpeg/mozjpeg_enc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/lib/squoosh/mozjpeg/mozjpeg_enc", JSImport.Default)
  @js.native
  def default: ModuleFactory[MozJPEGModule] = js.native
  inline def default_=(x: ModuleFactory[MozJPEGModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait EncodeOptions extends StObject {
    
    var arithmetic: Boolean
    
    var auto_subsample: Boolean
    
    var baseline: Boolean
    
    var chroma_quality: Double
    
    var chroma_subsample: Double
    
    var color_space: MozJpegColorSpace
    
    var optimize_coding: Boolean
    
    var progressive: Boolean
    
    var quality: Double
    
    var quant_table: Double
    
    var separate_chroma_quality: Boolean
    
    var smoothing: Double
    
    var trellis_loops: Double
    
    var trellis_multipass: Boolean
    
    var trellis_opt_table: Boolean
    
    var trellis_opt_zero: Boolean
  }
  object EncodeOptions {
    
    inline def apply(
      arithmetic: Boolean,
      auto_subsample: Boolean,
      baseline: Boolean,
      chroma_quality: Double,
      chroma_subsample: Double,
      color_space: MozJpegColorSpace,
      optimize_coding: Boolean,
      progressive: Boolean,
      quality: Double,
      quant_table: Double,
      separate_chroma_quality: Boolean,
      smoothing: Double,
      trellis_loops: Double,
      trellis_multipass: Boolean,
      trellis_opt_table: Boolean,
      trellis_opt_zero: Boolean
    ): EncodeOptions = {
      val __obj = js.Dynamic.literal(arithmetic = arithmetic.asInstanceOf[js.Any], auto_subsample = auto_subsample.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], chroma_quality = chroma_quality.asInstanceOf[js.Any], chroma_subsample = chroma_subsample.asInstanceOf[js.Any], color_space = color_space.asInstanceOf[js.Any], optimize_coding = optimize_coding.asInstanceOf[js.Any], progressive = progressive.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], quant_table = quant_table.asInstanceOf[js.Any], separate_chroma_quality = separate_chroma_quality.asInstanceOf[js.Any], smoothing = smoothing.asInstanceOf[js.Any], trellis_loops = trellis_loops.asInstanceOf[js.Any], trellis_multipass = trellis_multipass.asInstanceOf[js.Any], trellis_opt_table = trellis_opt_table.asInstanceOf[js.Any], trellis_opt_zero = trellis_opt_zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setArithmetic(value: Boolean): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      inline def setAuto_subsample(value: Boolean): Self = StObject.set(x, "auto_subsample", value.asInstanceOf[js.Any])
      
      inline def setBaseline(value: Boolean): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setChroma_quality(value: Double): Self = StObject.set(x, "chroma_quality", value.asInstanceOf[js.Any])
      
      inline def setChroma_subsample(value: Double): Self = StObject.set(x, "chroma_subsample", value.asInstanceOf[js.Any])
      
      inline def setColor_space(value: MozJpegColorSpace): Self = StObject.set(x, "color_space", value.asInstanceOf[js.Any])
      
      inline def setOptimize_coding(value: Boolean): Self = StObject.set(x, "optimize_coding", value.asInstanceOf[js.Any])
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQuant_table(value: Double): Self = StObject.set(x, "quant_table", value.asInstanceOf[js.Any])
      
      inline def setSeparate_chroma_quality(value: Boolean): Self = StObject.set(x, "separate_chroma_quality", value.asInstanceOf[js.Any])
      
      inline def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
      
      inline def setTrellis_loops(value: Double): Self = StObject.set(x, "trellis_loops", value.asInstanceOf[js.Any])
      
      inline def setTrellis_multipass(value: Boolean): Self = StObject.set(x, "trellis_multipass", value.asInstanceOf[js.Any])
      
      inline def setTrellis_opt_table(value: Boolean): Self = StObject.set(x, "trellis_opt_table", value.asInstanceOf[js.Any])
      
      inline def setTrellis_opt_zero(value: Boolean): Self = StObject.set(x, "trellis_opt_zero", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MozJPEGModule
    extends StObject
       with Module {
    
    def encode(data: BufferSource, width: Double, height: Double, options: EncodeOptions): js.typedarray.Uint8Array = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextInts.`1`
    - typings.next.nextInts.`0`
  */
  trait MozJpegColorSpace extends StObject
  object MozJpegColorSpace {
    
    inline def GRAYSCALE: `1` = 1.asInstanceOf[`1`]
    
    inline def RGB: `0` = 0.asInstanceOf[`0`]
    
    inline def YCbCr: `1` = 1.asInstanceOf[`1`]
  }
}
