package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNumberNormalizationMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/numberNormalization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bin2dec(number: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bin2dec")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/numberNormalization", "binaryDigitNormalizer")
  @js.native
  val binaryDigitNormalizer: Normalizer = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/numberNormalization", "binaryStraightNormalizer")
  @js.native
  val binaryStraightNormalizer: Normalizer = js.native
  
  inline def dec2bin(number: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("dec2bin")(number.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def dec2bin(number: Double, arrayLength: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("dec2bin")(number.asInstanceOf[js.Any], arrayLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/numberNormalization", "decimalDigitNormalizer")
  @js.native
  val decimalDigitNormalizer: Normalizer = js.native
  
  @js.native
  trait Normalizer extends StObject {
    
    def decode(input: js.Array[Double]): Double = js.native
    
    def encode(n: Double): js.Array[Double] = js.native
    def encode(n: Double, inputSize: Double): js.Array[Double] = js.native
  }
}
