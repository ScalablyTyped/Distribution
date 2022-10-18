package typings.next.anon

import typings.next.distServerLibSquooshCodecsMod.DecodeModule
import typings.next.distServerLibSquooshMozjpegMozjpegEncMod.MozJPEGModule
import typings.next.nextStrings.MozJPEG
import typings.next.nextStrings.jpg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoOptimize extends StObject {
  
  val autoOptimize: Max
  
  def dec(): js.Promise[DecodeModule]
  
  val defaultEncoderOptions: Arithmetic
  
  val detectors: js.Array[js.RegExp]
  
  def enc(): js.Promise[MozJPEGModule]
  
  val `extension`: jpg
  
  val name: MozJPEG
}
object AutoOptimize {
  
  inline def apply(
    autoOptimize: Max,
    dec: () => js.Promise[DecodeModule],
    defaultEncoderOptions: Arithmetic,
    detectors: js.Array[js.RegExp],
    enc: () => js.Promise[MozJPEGModule]
  ): AutoOptimize = {
    val __obj = js.Dynamic.literal(autoOptimize = autoOptimize.asInstanceOf[js.Any], dec = js.Any.fromFunction0(dec), defaultEncoderOptions = defaultEncoderOptions.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], enc = js.Any.fromFunction0(enc), name = "MozJPEG")
    __obj.updateDynamic("extension")("jpg")
    __obj.asInstanceOf[AutoOptimize]
  }
  
  extension [Self <: AutoOptimize](x: Self) {
    
    inline def setAutoOptimize(value: Max): Self = StObject.set(x, "autoOptimize", value.asInstanceOf[js.Any])
    
    inline def setDec(value: () => js.Promise[DecodeModule]): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
    
    inline def setDefaultEncoderOptions(value: Arithmetic): Self = StObject.set(x, "defaultEncoderOptions", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: js.Array[js.RegExp]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: js.RegExp*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setEnc(value: () => js.Promise[MozJPEGModule]): Self = StObject.set(x, "enc", js.Any.fromFunction0(value))
    
    inline def setExtension(value: jpg): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: MozJPEG): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
