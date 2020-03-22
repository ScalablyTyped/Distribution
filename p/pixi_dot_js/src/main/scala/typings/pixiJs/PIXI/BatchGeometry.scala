package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geometry used to batch standard PIXI content (e.g. Mesh, Sprite, Graphics objects).
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.BatchGeometry")
@js.native
class BatchGeometry () extends js.Object {
  def this(_static: Boolean) = this()
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  var _buffer: Buffer = js.native
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  var _indexBuffer: Buffer = js.native
}

