package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataInterleaveTypedArraysMod {
  
  @JSImport("@pixi/utils/lib/data/interleaveTypedArrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interleaveTypedArrays(arrays: js.Array[PackedArray], sizes: js.Array[Double]): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("interleaveTypedArrays")(arrays.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  type PackedArray = js.typedarray.Float32Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
}
