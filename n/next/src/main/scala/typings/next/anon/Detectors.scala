package typings.next.anon

import typings.next.nextStrings.OxiPNG
import typings.next.nextStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detectors extends StObject {
  
  val autoOptimize: Option
  
  def dec(): js.Promise[Decode]
  
  val defaultEncoderOptions: `2`
  
  val detectors: js.Array[js.RegExp]
  
  def enc(): js.Promise[Encode]
  
  val `extension`: png
  
  val name: OxiPNG
}
object Detectors {
  
  inline def apply(
    autoOptimize: Option,
    dec: () => js.Promise[Decode],
    defaultEncoderOptions: `2`,
    detectors: js.Array[js.RegExp],
    enc: () => js.Promise[Encode]
  ): Detectors = {
    val __obj = js.Dynamic.literal(autoOptimize = autoOptimize.asInstanceOf[js.Any], dec = js.Any.fromFunction0(dec), defaultEncoderOptions = defaultEncoderOptions.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], enc = js.Any.fromFunction0(enc), name = "OxiPNG")
    __obj.updateDynamic("extension")("png")
    __obj.asInstanceOf[Detectors]
  }
  
  extension [Self <: Detectors](x: Self) {
    
    inline def setAutoOptimize(value: Option): Self = StObject.set(x, "autoOptimize", value.asInstanceOf[js.Any])
    
    inline def setDec(value: () => js.Promise[Decode]): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
    
    inline def setDefaultEncoderOptions(value: `2`): Self = StObject.set(x, "defaultEncoderOptions", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: js.Array[js.RegExp]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: js.RegExp*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setEnc(value: () => js.Promise[Encode]): Self = StObject.set(x, "enc", js.Any.fromFunction0(value))
    
    inline def setExtension(value: png): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: OxiPNG): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
