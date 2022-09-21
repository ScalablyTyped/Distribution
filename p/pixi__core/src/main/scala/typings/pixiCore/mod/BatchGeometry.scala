package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BatchGeometry")
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
  var _buffer: Buffer2 = js.native
  
  /**
    * Index buffer data
    * @protected
    */
  var _indexBuffer: Buffer2 = js.native
}
