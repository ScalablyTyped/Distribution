package typings.pixiCore

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchBatchDrawCallMod {
  
  @JSImport("@pixi/core/lib/batch/BatchDrawCall", "BatchDrawCall")
  @js.native
  open class BatchDrawCall () extends StObject {
    
    var blend: BLEND_MODES = js.native
    
    /** Data for uniforms or custom webgl state. */
    var data: Any = js.native
    
    var size: Double = js.native
    
    var start: Double = js.native
    
    var texArray: BatchTextureArray = js.native
    
    var `type`: DRAW_MODES = js.native
  }
}
