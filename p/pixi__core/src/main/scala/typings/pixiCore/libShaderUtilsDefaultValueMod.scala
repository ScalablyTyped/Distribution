package typings.pixiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsDefaultValueMod {
  
  @JSImport("@pixi/core/lib/shader/utils/defaultValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultValue(`type`: String, size: Double): Double | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | Boolean | js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | Boolean | js.Array[Boolean]]
}
