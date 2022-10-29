package typings.pixiCore

import typings.pixiCore.libGeometryBufferMod.Buffer
import typings.pixiCore.libGeometryGeometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchBatchGeometryMod {
  
  @JSImport("@pixi/core/lib/batch/BatchGeometry", "BatchGeometry")
  @js.native
  /**
    * @param {boolean} [_static=false] - Optimization flag, where `false`
    *        is updated every frame, `true` doesn't change frame-to-frame.
    */
  open class BatchGeometry () extends Geometry {
    def this(_static: Boolean) = this()
    
    /**
      * Buffer used for position, color, texture IDs
      * @protected
      */
    var _buffer: Buffer = js.native
    
    /**
      * Index buffer data
      * @protected
      */
    var _indexBuffer: Buffer = js.native
  }
}
