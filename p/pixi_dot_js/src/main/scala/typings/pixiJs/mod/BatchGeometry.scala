package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geometry used to batch standard PIXI content (e.g. Mesh, Sprite, Graphics objects).
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "BatchGeometry")
@js.native
class BatchGeometry ()
  extends typings.pixiJs.PIXI.BatchGeometry {
  def this(_static: Boolean) = this()
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  /* CompleteClass */
  override var _buffer: typings.pixiJs.PIXI.Buffer = js.native
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  /* CompleteClass */
  override var _indexBuffer: typings.pixiJs.PIXI.Buffer = js.native
}

