package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorHexMod {
  
  @JSImport("@pixi/utils/lib/color/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hex2rgb(hex: Double): js.Array[Double] | js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  inline def hex2rgb(hex: Double, out: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  inline def hex2rgb(hex: Double, out: js.typedarray.Float32Array): js.Array[Double] | js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  
  inline def hex2string(hex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2string")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rgb2hex(rgb: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rgb2hex(rgb: js.typedarray.Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def string2hex(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("string2hex")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
}
