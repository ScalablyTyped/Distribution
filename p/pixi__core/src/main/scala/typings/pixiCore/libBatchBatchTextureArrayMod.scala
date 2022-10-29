package typings.pixiCore

import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchBatchTextureArrayMod {
  
  @JSImport("@pixi/core/lib/batch/BatchTextureArray", "BatchTextureArray")
  @js.native
  open class BatchTextureArray () extends StObject {
    
    def clear(): Unit = js.native
    
    /** Number of filled elements. */
    var count: Double = js.native
    
    /** Inside textures array. */
    var elements: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
    
    /** Respective locations for textures. */
    var ids: js.Array[Double] = js.native
  }
}
