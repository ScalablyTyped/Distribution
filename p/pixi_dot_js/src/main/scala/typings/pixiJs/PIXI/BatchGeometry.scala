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
trait BatchGeometry extends js.Object {
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  var _buffer: Buffer
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  var _indexBuffer: Buffer
}

object BatchGeometry {
  @scala.inline
  def apply(_buffer: Buffer, _indexBuffer: Buffer): BatchGeometry = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGeometry]
  }
}

