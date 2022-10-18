package typings.next.anon

import typings.next.distServerLibSquooshCodecsMod.DecodeModule
import typings.next.distServerLibSquooshWebpWebpEncMod.WebPModule
import typings.next.nextStrings.WebP
import typings.next.nextStrings.webp_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dec extends StObject {
  
  val autoOptimize: Max
  
  def dec(): js.Promise[DecodeModule]
  
  val defaultEncoderOptions: Alphacompression
  
  val detectors: js.Array[js.RegExp]
  
  def enc(): js.Promise[WebPModule]
  
  val `extension`: webp_
  
  val name: WebP
}
object Dec {
  
  inline def apply(
    autoOptimize: Max,
    dec: () => js.Promise[DecodeModule],
    defaultEncoderOptions: Alphacompression,
    detectors: js.Array[js.RegExp],
    enc: () => js.Promise[WebPModule]
  ): Dec = {
    val __obj = js.Dynamic.literal(autoOptimize = autoOptimize.asInstanceOf[js.Any], dec = js.Any.fromFunction0(dec), defaultEncoderOptions = defaultEncoderOptions.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], enc = js.Any.fromFunction0(enc), name = "WebP")
    __obj.updateDynamic("extension")("webp")
    __obj.asInstanceOf[Dec]
  }
  
  extension [Self <: Dec](x: Self) {
    
    inline def setAutoOptimize(value: Max): Self = StObject.set(x, "autoOptimize", value.asInstanceOf[js.Any])
    
    inline def setDec(value: () => js.Promise[DecodeModule]): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
    
    inline def setDefaultEncoderOptions(value: Alphacompression): Self = StObject.set(x, "defaultEncoderOptions", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: js.Array[js.RegExp]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: js.RegExp*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setEnc(value: () => js.Promise[WebPModule]): Self = StObject.set(x, "enc", js.Any.fromFunction0(value))
    
    inline def setExtension(value: webp_): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: WebP): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
