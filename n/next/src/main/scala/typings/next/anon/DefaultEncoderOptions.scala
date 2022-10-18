package typings.next.anon

import typings.next.distServerLibSquooshAvifAvifEncMod.AVIFModule
import typings.next.distServerLibSquooshCodecsMod.DecodeModule
import typings.next.nextStrings.AVIF
import typings.next.nextStrings.avif_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultEncoderOptions extends StObject {
  
  val autoOptimize: Min
  
  def dec(): js.Promise[DecodeModule]
  
  val defaultEncoderOptions: ChromaDeltaQ
  
  val detectors: js.Array[js.RegExp]
  
  def enc(): js.Promise[AVIFModule]
  
  val `extension`: avif_
  
  val name: AVIF
}
object DefaultEncoderOptions {
  
  inline def apply(
    autoOptimize: Min,
    dec: () => js.Promise[DecodeModule],
    defaultEncoderOptions: ChromaDeltaQ,
    detectors: js.Array[js.RegExp],
    enc: () => js.Promise[AVIFModule]
  ): DefaultEncoderOptions = {
    val __obj = js.Dynamic.literal(autoOptimize = autoOptimize.asInstanceOf[js.Any], dec = js.Any.fromFunction0(dec), defaultEncoderOptions = defaultEncoderOptions.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], enc = js.Any.fromFunction0(enc), name = "AVIF")
    __obj.updateDynamic("extension")("avif")
    __obj.asInstanceOf[DefaultEncoderOptions]
  }
  
  extension [Self <: DefaultEncoderOptions](x: Self) {
    
    inline def setAutoOptimize(value: Min): Self = StObject.set(x, "autoOptimize", value.asInstanceOf[js.Any])
    
    inline def setDec(value: () => js.Promise[DecodeModule]): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
    
    inline def setDefaultEncoderOptions(value: ChromaDeltaQ): Self = StObject.set(x, "defaultEncoderOptions", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: js.Array[js.RegExp]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: js.RegExp*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setEnc(value: () => js.Promise[AVIFModule]): Self = StObject.set(x, "enc", js.Any.fromFunction0(value))
    
    inline def setExtension(value: avif_): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: AVIF): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
