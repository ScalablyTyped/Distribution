package typings.next

import typings.next.EmscriptenWasm.Module
import typings.next.EmscriptenWasm.ModuleFactory
import typings.next.nextInts.`0`
import typings.next.nextInts.`1`
import typings.next.nextInts.`2`
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmServerLibSquooshAvifAvifEncMod {
  
  @JSImport("next/dist/esm/server/lib/squoosh/avif/avif_enc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/esm/server/lib/squoosh/avif/avif_enc", JSImport.Default)
  @js.native
  def default: ModuleFactory[AVIFModule] = js.native
  inline def default_=(x: ModuleFactory[AVIFModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AVIFModule
    extends StObject
       with Module {
    
    def encode(data: BufferSource, width: Double, height: Double, options: EncodeOptions): js.typedarray.Uint8Array = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextInts.`0`
    - typings.next.nextInts.`1`
    - typings.next.nextInts.`2`
  */
  trait AVIFTune extends StObject
  object AVIFTune {
    
    inline def auto: `0` = 0.asInstanceOf[`0`]
    
    inline def psnr: `1` = 1.asInstanceOf[`1`]
    
    inline def ssim: `2` = 2.asInstanceOf[`2`]
  }
  
  trait EncodeOptions extends StObject {
    
    var chromaDeltaQ: Boolean
    
    var cqAlphaLevel: Double
    
    var cqLevel: Double
    
    var denoiseLevel: Double
    
    var sharpness: Double
    
    var speed: Double
    
    var subsample: Double
    
    var tileColsLog2: Double
    
    var tileRowsLog2: Double
    
    var tune: AVIFTune
  }
  object EncodeOptions {
    
    inline def apply(
      chromaDeltaQ: Boolean,
      cqAlphaLevel: Double,
      cqLevel: Double,
      denoiseLevel: Double,
      sharpness: Double,
      speed: Double,
      subsample: Double,
      tileColsLog2: Double,
      tileRowsLog2: Double,
      tune: AVIFTune
    ): EncodeOptions = {
      val __obj = js.Dynamic.literal(chromaDeltaQ = chromaDeltaQ.asInstanceOf[js.Any], cqAlphaLevel = cqAlphaLevel.asInstanceOf[js.Any], cqLevel = cqLevel.asInstanceOf[js.Any], denoiseLevel = denoiseLevel.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], subsample = subsample.asInstanceOf[js.Any], tileColsLog2 = tileColsLog2.asInstanceOf[js.Any], tileRowsLog2 = tileRowsLog2.asInstanceOf[js.Any], tune = tune.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setChromaDeltaQ(value: Boolean): Self = StObject.set(x, "chromaDeltaQ", value.asInstanceOf[js.Any])
      
      inline def setCqAlphaLevel(value: Double): Self = StObject.set(x, "cqAlphaLevel", value.asInstanceOf[js.Any])
      
      inline def setCqLevel(value: Double): Self = StObject.set(x, "cqLevel", value.asInstanceOf[js.Any])
      
      inline def setDenoiseLevel(value: Double): Self = StObject.set(x, "denoiseLevel", value.asInstanceOf[js.Any])
      
      inline def setSharpness(value: Double): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSubsample(value: Double): Self = StObject.set(x, "subsample", value.asInstanceOf[js.Any])
      
      inline def setTileColsLog2(value: Double): Self = StObject.set(x, "tileColsLog2", value.asInstanceOf[js.Any])
      
      inline def setTileRowsLog2(value: Double): Self = StObject.set(x, "tileRowsLog2", value.asInstanceOf[js.Any])
      
      inline def setTune(value: AVIFTune): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
    }
  }
}
