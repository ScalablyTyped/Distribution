package typings.pixiUtils

import typings.pixiUtils.pixiUtilsStrings.Float32Array
import typings.pixiUtils.pixiUtilsStrings.Int32Array
import typings.pixiUtils.pixiUtilsStrings.Uint16Array
import typings.pixiUtils.pixiUtilsStrings.Uint32Array
import typings.pixiUtils.pixiUtilsStrings.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataGetBufferTypeMod {
  
  @JSImport("@pixi/utils/lib/data/getBufferType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBufferType(
    array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITypedArray */ Any
  ): Float32Array | Uint32Array | Int32Array | Uint16Array | Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBufferType")(array.asInstanceOf[js.Any]).asInstanceOf[Float32Array | Uint32Array | Int32Array | Uint16Array | Uint8Array | Null]
}
