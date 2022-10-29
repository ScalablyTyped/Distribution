package typings.pixiCore

import typings.pixiCore.libGeometryBufferMod.ITypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryUtilsInterleaveTypedArraysMod {
  
  @JSImport("@pixi/core/lib/geometry/utils/interleaveTypedArrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interleaveTypedArrays(arrays: js.Array[ITypedArray], sizes: js.Array[Double]): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("interleaveTypedArrays")(arrays.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
}
