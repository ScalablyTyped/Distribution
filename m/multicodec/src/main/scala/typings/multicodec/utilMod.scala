package typings.multicodec

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("multicodec/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def numberToUint8Array(num: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToUint8Array")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def uint8ArrayToNumber(buf: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8ArrayToNumber")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def varintEncode(num: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("varintEncode")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def varintUint8ArrayEncode(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("varintUint8ArrayEncode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
