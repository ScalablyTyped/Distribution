package typings.next

import typings.next.EmscriptenWasm.Module
import typings.next.EmscriptenWasm.ModuleFactory
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmServerLibSquooshWebpWebpEncMod {
  
  @JSImport("next/dist/esm/server/lib/squoosh/webp/webp_enc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/esm/server/lib/squoosh/webp/webp_enc", JSImport.Default)
  @js.native
  def default: ModuleFactory[WebPModule] = js.native
  inline def default_=(x: ModuleFactory[WebPModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait EncodeOptions extends StObject {
    
    var alpha_compression: Double
    
    var alpha_filtering: Double
    
    var alpha_quality: Double
    
    var autofilter: Double
    
    var emulate_jpeg_size: Double
    
    var exact: Double
    
    var filter_sharpness: Double
    
    var filter_strength: Double
    
    var filter_type: Double
    
    var image_hint: Double
    
    var lossless: Double
    
    var low_memory: Double
    
    var method: Double
    
    var near_lossless: Double
    
    var partition_limit: Double
    
    var partitions: Double
    
    var pass: Double
    
    var preprocessing: Double
    
    var quality: Double
    
    var segments: Double
    
    var show_compressed: Double
    
    var sns_strength: Double
    
    var target_PSNR: Double
    
    var target_size: Double
    
    var thread_level: Double
    
    var use_delta_palette: Double
    
    var use_sharp_yuv: Double
  }
  object EncodeOptions {
    
    inline def apply(
      alpha_compression: Double,
      alpha_filtering: Double,
      alpha_quality: Double,
      autofilter: Double,
      emulate_jpeg_size: Double,
      exact: Double,
      filter_sharpness: Double,
      filter_strength: Double,
      filter_type: Double,
      image_hint: Double,
      lossless: Double,
      low_memory: Double,
      method: Double,
      near_lossless: Double,
      partition_limit: Double,
      partitions: Double,
      pass: Double,
      preprocessing: Double,
      quality: Double,
      segments: Double,
      show_compressed: Double,
      sns_strength: Double,
      target_PSNR: Double,
      target_size: Double,
      thread_level: Double,
      use_delta_palette: Double,
      use_sharp_yuv: Double
    ): EncodeOptions = {
      val __obj = js.Dynamic.literal(alpha_compression = alpha_compression.asInstanceOf[js.Any], alpha_filtering = alpha_filtering.asInstanceOf[js.Any], alpha_quality = alpha_quality.asInstanceOf[js.Any], autofilter = autofilter.asInstanceOf[js.Any], emulate_jpeg_size = emulate_jpeg_size.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], filter_sharpness = filter_sharpness.asInstanceOf[js.Any], filter_strength = filter_strength.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], image_hint = image_hint.asInstanceOf[js.Any], lossless = lossless.asInstanceOf[js.Any], low_memory = low_memory.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], near_lossless = near_lossless.asInstanceOf[js.Any], partition_limit = partition_limit.asInstanceOf[js.Any], partitions = partitions.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], preprocessing = preprocessing.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], show_compressed = show_compressed.asInstanceOf[js.Any], sns_strength = sns_strength.asInstanceOf[js.Any], target_PSNR = target_PSNR.asInstanceOf[js.Any], target_size = target_size.asInstanceOf[js.Any], thread_level = thread_level.asInstanceOf[js.Any], use_delta_palette = use_delta_palette.asInstanceOf[js.Any], use_sharp_yuv = use_sharp_yuv.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setAlpha_compression(value: Double): Self = StObject.set(x, "alpha_compression", value.asInstanceOf[js.Any])
      
      inline def setAlpha_filtering(value: Double): Self = StObject.set(x, "alpha_filtering", value.asInstanceOf[js.Any])
      
      inline def setAlpha_quality(value: Double): Self = StObject.set(x, "alpha_quality", value.asInstanceOf[js.Any])
      
      inline def setAutofilter(value: Double): Self = StObject.set(x, "autofilter", value.asInstanceOf[js.Any])
      
      inline def setEmulate_jpeg_size(value: Double): Self = StObject.set(x, "emulate_jpeg_size", value.asInstanceOf[js.Any])
      
      inline def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setFilter_sharpness(value: Double): Self = StObject.set(x, "filter_sharpness", value.asInstanceOf[js.Any])
      
      inline def setFilter_strength(value: Double): Self = StObject.set(x, "filter_strength", value.asInstanceOf[js.Any])
      
      inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      inline def setImage_hint(value: Double): Self = StObject.set(x, "image_hint", value.asInstanceOf[js.Any])
      
      inline def setLossless(value: Double): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      inline def setLow_memory(value: Double): Self = StObject.set(x, "low_memory", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNear_lossless(value: Double): Self = StObject.set(x, "near_lossless", value.asInstanceOf[js.Any])
      
      inline def setPartition_limit(value: Double): Self = StObject.set(x, "partition_limit", value.asInstanceOf[js.Any])
      
      inline def setPartitions(value: Double): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
      
      inline def setPass(value: Double): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPreprocessing(value: Double): Self = StObject.set(x, "preprocessing", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setShow_compressed(value: Double): Self = StObject.set(x, "show_compressed", value.asInstanceOf[js.Any])
      
      inline def setSns_strength(value: Double): Self = StObject.set(x, "sns_strength", value.asInstanceOf[js.Any])
      
      inline def setTarget_PSNR(value: Double): Self = StObject.set(x, "target_PSNR", value.asInstanceOf[js.Any])
      
      inline def setTarget_size(value: Double): Self = StObject.set(x, "target_size", value.asInstanceOf[js.Any])
      
      inline def setThread_level(value: Double): Self = StObject.set(x, "thread_level", value.asInstanceOf[js.Any])
      
      inline def setUse_delta_palette(value: Double): Self = StObject.set(x, "use_delta_palette", value.asInstanceOf[js.Any])
      
      inline def setUse_sharp_yuv(value: Double): Self = StObject.set(x, "use_sharp_yuv", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebPModule
    extends StObject
       with Module {
    
    def encode(data: BufferSource, width: Double, height: Double, options: EncodeOptions): js.typedarray.Uint8Array = js.native
  }
}
