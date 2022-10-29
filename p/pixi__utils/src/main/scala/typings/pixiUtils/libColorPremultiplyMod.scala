package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorPremultiplyMod {
  
  @JSImport("@pixi/utils/lib/color/premultiply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def correctBlendMode(blendMode: Double, premultiplied: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctBlendMode")(blendMode.asInstanceOf[js.Any], premultiplied.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@pixi/utils/lib/color/premultiply", "premultiplyBlendMode")
  @js.native
  val premultiplyBlendMode: js.Array[js.Array[Double]] = js.native
  
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Unit, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(
    rgb: js.typedarray.Float32Array,
    alpha: Double,
    out: js.typedarray.Float32Array,
    premultiply: Boolean
  ): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double, out: Unit, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def premultiplyTint(tint: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTint")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def premultiplyTintToRgba(tint: Double, alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyTintToRgba(tint: Double, alpha: Double, out: js.typedarray.Float32Array, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
}
